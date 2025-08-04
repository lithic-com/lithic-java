@file:JvmName("Utils")

package com.lithic.api.core

import com.lithic.api.core.http.Headers
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.SortedMap
import java.util.concurrent.CompletableFuture
import java.util.concurrent.locks.Lock

@JvmSynthetic
internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw LithicInvalidDataException("`${name}` is not present")

@JvmSynthetic
internal fun <T> List<T>.toImmutable(): List<T> =
    if (isEmpty()) Collections.emptyList() else Collections.unmodifiableList(toList())

@JvmSynthetic
internal fun <K, V> Map<K, V>.toImmutable(): Map<K, V> =
    if (isEmpty()) immutableEmptyMap() else Collections.unmodifiableMap(toMap())

@JvmSynthetic internal fun <K, V> immutableEmptyMap(): Map<K, V> = Collections.emptyMap()

@JvmSynthetic
internal fun <K : Comparable<K>, V> SortedMap<K, V>.toImmutable(): SortedMap<K, V> =
    if (isEmpty()) Collections.emptySortedMap()
    else Collections.unmodifiableSortedMap(toSortedMap(comparator()))

/**
 * Returns all elements that yield the largest value for the given function, or an empty list if
 * there are zero elements.
 *
 * This is similar to [Sequence.maxByOrNull] except it returns _all_ elements that yield the largest
 * value; not just the first one.
 */
@JvmSynthetic
internal fun <T, R : Comparable<R>> Sequence<T>.allMaxBy(selector: (T) -> R): List<T> {
    var maxValue: R? = null
    val maxElements = mutableListOf<T>()

    val iterator = iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        val value = selector(element)
        if (maxValue == null || value > maxValue) {
            maxValue = value
            maxElements.clear()
            maxElements.add(element)
        } else if (value == maxValue) {
            maxElements.add(element)
        }
    }

    return maxElements
}

/**
 * Returns whether [this] is equal to [other].
 *
 * This differs from [Object.equals] because it also deeply equates arrays based on their contents,
 * even when there are arrays directly nested within other arrays.
 */
@JvmSynthetic
internal infix fun Any?.contentEquals(other: Any?): Boolean =
    arrayOf(this).contentDeepEquals(arrayOf(other))

/**
 * Returns a hash of the given sequence of [values].
 *
 * This differs from [java.util.Objects.hash] because it also deeply hashes arrays based on their
 * contents, even when there are arrays directly nested within other arrays.
 */
@JvmSynthetic internal fun contentHash(vararg values: Any?): Int = values.contentDeepHashCode()

/**
 * Returns a [String] representation of [this].
 *
 * This differs from [Object.toString] because it also deeply stringifies arrays based on their
 * contents, even when there are arrays directly nested within other arrays.
 */
@JvmSynthetic
internal fun Any?.contentToString(): String {
    var string = arrayOf(this).contentDeepToString()
    if (string.startsWith('[')) {
        string = string.substring(1)
    }
    if (string.endsWith(']')) {
        string = string.substring(0, string.length - 1)
    }
    return string
}

@JvmSynthetic
internal fun Headers.getRequiredHeader(name: String): String =
    values(name).firstOrNull() ?: throw LithicInvalidDataException("Could not find $name header")

internal interface Enum

/**
 * Executes the given [action] while holding the lock, returning a [CompletableFuture] with the
 * result.
 *
 * @param action The asynchronous action to execute while holding the lock
 * @return A [CompletableFuture] that completes with the result of the action
 */
@JvmSynthetic
internal fun <T> Lock.withLockAsync(action: () -> CompletableFuture<T>): CompletableFuture<T> {
    lock()
    val future =
        try {
            action()
        } catch (e: Throwable) {
            unlock()
            throw e
        }
    future.whenComplete { _, _ -> unlock() }
    return future
}
