# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class com.lithic.api.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }