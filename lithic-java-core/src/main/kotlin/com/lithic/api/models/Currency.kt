// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class Currency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val AED = of("AED")

        @JvmField val AFN = of("AFN")

        @JvmField val ALL = of("ALL")

        @JvmField val AMD = of("AMD")

        @JvmField val ANG = of("ANG")

        @JvmField val AOA = of("AOA")

        @JvmField val ARS = of("ARS")

        @JvmField val AUD = of("AUD")

        @JvmField val AWG = of("AWG")

        @JvmField val AZN = of("AZN")

        @JvmField val BAM = of("BAM")

        @JvmField val BBD = of("BBD")

        @JvmField val BDT = of("BDT")

        @JvmField val BGN = of("BGN")

        @JvmField val BHD = of("BHD")

        @JvmField val BIF = of("BIF")

        @JvmField val BMD = of("BMD")

        @JvmField val BND = of("BND")

        @JvmField val BOB = of("BOB")

        @JvmField val BOV = of("BOV")

        @JvmField val BRL = of("BRL")

        @JvmField val BSD = of("BSD")

        @JvmField val BTN = of("BTN")

        @JvmField val BWP = of("BWP")

        @JvmField val BYN = of("BYN")

        @JvmField val BZD = of("BZD")

        @JvmField val CAD = of("CAD")

        @JvmField val CDF = of("CDF")

        @JvmField val CHE = of("CHE")

        @JvmField val CHF = of("CHF")

        @JvmField val CHW = of("CHW")

        @JvmField val CLF = of("CLF")

        @JvmField val CLP = of("CLP")

        @JvmField val CNY = of("CNY")

        @JvmField val COP = of("COP")

        @JvmField val COU = of("COU")

        @JvmField val CRC = of("CRC")

        @JvmField val CUC = of("CUC")

        @JvmField val CUP = of("CUP")

        @JvmField val CVE = of("CVE")

        @JvmField val CZK = of("CZK")

        @JvmField val DJF = of("DJF")

        @JvmField val DKK = of("DKK")

        @JvmField val DOP = of("DOP")

        @JvmField val DZD = of("DZD")

        @JvmField val EGP = of("EGP")

        @JvmField val ERN = of("ERN")

        @JvmField val ETB = of("ETB")

        @JvmField val EUR = of("EUR")

        @JvmField val FJD = of("FJD")

        @JvmField val FKP = of("FKP")

        @JvmField val GBP = of("GBP")

        @JvmField val GEL = of("GEL")

        @JvmField val GHS = of("GHS")

        @JvmField val GIP = of("GIP")

        @JvmField val GMD = of("GMD")

        @JvmField val GNF = of("GNF")

        @JvmField val GTQ = of("GTQ")

        @JvmField val GYD = of("GYD")

        @JvmField val HKD = of("HKD")

        @JvmField val HNL = of("HNL")

        @JvmField val HRK = of("HRK")

        @JvmField val HTG = of("HTG")

        @JvmField val HUF = of("HUF")

        @JvmField val IDR = of("IDR")

        @JvmField val ILS = of("ILS")

        @JvmField val INR = of("INR")

        @JvmField val IQD = of("IQD")

        @JvmField val IRR = of("IRR")

        @JvmField val ISK = of("ISK")

        @JvmField val JMD = of("JMD")

        @JvmField val JOD = of("JOD")

        @JvmField val JPY = of("JPY")

        @JvmField val KES = of("KES")

        @JvmField val KGS = of("KGS")

        @JvmField val KHR = of("KHR")

        @JvmField val KMF = of("KMF")

        @JvmField val KPW = of("KPW")

        @JvmField val KRW = of("KRW")

        @JvmField val KWD = of("KWD")

        @JvmField val KYD = of("KYD")

        @JvmField val KZT = of("KZT")

        @JvmField val LAK = of("LAK")

        @JvmField val LBP = of("LBP")

        @JvmField val LKR = of("LKR")

        @JvmField val LRD = of("LRD")

        @JvmField val LSL = of("LSL")

        @JvmField val LYD = of("LYD")

        @JvmField val MAD = of("MAD")

        @JvmField val MDL = of("MDL")

        @JvmField val MGA = of("MGA")

        @JvmField val MKD = of("MKD")

        @JvmField val MMK = of("MMK")

        @JvmField val MNT = of("MNT")

        @JvmField val MOP = of("MOP")

        @JvmField val MRU = of("MRU")

        @JvmField val MUR = of("MUR")

        @JvmField val MVR = of("MVR")

        @JvmField val MWK = of("MWK")

        @JvmField val MXN = of("MXN")

        @JvmField val MXV = of("MXV")

        @JvmField val MYR = of("MYR")

        @JvmField val MZN = of("MZN")

        @JvmField val NAD = of("NAD")

        @JvmField val NGN = of("NGN")

        @JvmField val NIO = of("NIO")

        @JvmField val NOK = of("NOK")

        @JvmField val NPR = of("NPR")

        @JvmField val NZD = of("NZD")

        @JvmField val OMR = of("OMR")

        @JvmField val PAB = of("PAB")

        @JvmField val PEN = of("PEN")

        @JvmField val PGK = of("PGK")

        @JvmField val PHP = of("PHP")

        @JvmField val PKR = of("PKR")

        @JvmField val PLN = of("PLN")

        @JvmField val PYG = of("PYG")

        @JvmField val QAR = of("QAR")

        @JvmField val RON = of("RON")

        @JvmField val RSD = of("RSD")

        @JvmField val RUB = of("RUB")

        @JvmField val RWF = of("RWF")

        @JvmField val SAR = of("SAR")

        @JvmField val SBD = of("SBD")

        @JvmField val SCR = of("SCR")

        @JvmField val SDG = of("SDG")

        @JvmField val SEK = of("SEK")

        @JvmField val SGD = of("SGD")

        @JvmField val SHP = of("SHP")

        @JvmField val SLE = of("SLE")

        @JvmField val SLL = of("SLL")

        @JvmField val SOS = of("SOS")

        @JvmField val SRD = of("SRD")

        @JvmField val SSP = of("SSP")

        @JvmField val STN = of("STN")

        @JvmField val SVC = of("SVC")

        @JvmField val SYP = of("SYP")

        @JvmField val SZL = of("SZL")

        @JvmField val THB = of("THB")

        @JvmField val TJS = of("TJS")

        @JvmField val TMT = of("TMT")

        @JvmField val TND = of("TND")

        @JvmField val TOP = of("TOP")

        @JvmField val TRY = of("TRY")

        @JvmField val TTD = of("TTD")

        @JvmField val TWD = of("TWD")

        @JvmField val TZS = of("TZS")

        @JvmField val UAH = of("UAH")

        @JvmField val UGX = of("UGX")

        @JvmField val USD = of("USD")

        @JvmField val USN = of("USN")

        @JvmField val UYI = of("UYI")

        @JvmField val UYU = of("UYU")

        @JvmField val UYW = of("UYW")

        @JvmField val UZS = of("UZS")

        @JvmField val VED = of("VED")

        @JvmField val VES = of("VES")

        @JvmField val VND = of("VND")

        @JvmField val VUV = of("VUV")

        @JvmField val WST = of("WST")

        @JvmField val XAF = of("XAF")

        @JvmField val XAG = of("XAG")

        @JvmField val XAU = of("XAU")

        @JvmField val XBA = of("XBA")

        @JvmField val XBB = of("XBB")

        @JvmField val XBC = of("XBC")

        @JvmField val XBD = of("XBD")

        @JvmField val XCD = of("XCD")

        @JvmField val XDR = of("XDR")

        @JvmField val XOF = of("XOF")

        @JvmField val XPD = of("XPD")

        @JvmField val XPF = of("XPF")

        @JvmField val XPT = of("XPT")

        @JvmField val XSU = of("XSU")

        @JvmField val XTS = of("XTS")

        @JvmField val XUA = of("XUA")

        @JvmField val XXX = of("XXX")

        @JvmField val YER = of("YER")

        @JvmField val ZAR = of("ZAR")

        @JvmField val ZMW = of("ZMW")

        @JvmField val ZWL = of("ZWL")

        @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
    }

    enum class Known {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BOV,
        BRL,
        BSD,
        BTN,
        BWP,
        BYN,
        BZD,
        CAD,
        CDF,
        CHE,
        CHF,
        CHW,
        CLF,
        CLP,
        CNY,
        COP,
        COU,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EGP,
        ERN,
        ETB,
        EUR,
        FJD,
        FKP,
        GBP,
        GEL,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        INR,
        IQD,
        IRR,
        ISK,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRU,
        MUR,
        MVR,
        MWK,
        MXN,
        MXV,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SLE,
        SLL,
        SOS,
        SRD,
        SSP,
        STN,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        USN,
        UYI,
        UYU,
        UYW,
        UZS,
        VED,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XOF,
        XPD,
        XPF,
        XPT,
        XSU,
        XTS,
        XUA,
        XXX,
        YER,
        ZAR,
        ZMW,
        ZWL,
    }

    enum class Value {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BOV,
        BRL,
        BSD,
        BTN,
        BWP,
        BYN,
        BZD,
        CAD,
        CDF,
        CHE,
        CHF,
        CHW,
        CLF,
        CLP,
        CNY,
        COP,
        COU,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EGP,
        ERN,
        ETB,
        EUR,
        FJD,
        FKP,
        GBP,
        GEL,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        INR,
        IQD,
        IRR,
        ISK,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRU,
        MUR,
        MVR,
        MWK,
        MXN,
        MXV,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SLE,
        SLL,
        SOS,
        SRD,
        SSP,
        STN,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        USN,
        UYI,
        UYU,
        UYW,
        UZS,
        VED,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XOF,
        XPD,
        XPF,
        XPT,
        XSU,
        XTS,
        XUA,
        XXX,
        YER,
        ZAR,
        ZMW,
        ZWL,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            AED -> Value.AED
            AFN -> Value.AFN
            ALL -> Value.ALL
            AMD -> Value.AMD
            ANG -> Value.ANG
            AOA -> Value.AOA
            ARS -> Value.ARS
            AUD -> Value.AUD
            AWG -> Value.AWG
            AZN -> Value.AZN
            BAM -> Value.BAM
            BBD -> Value.BBD
            BDT -> Value.BDT
            BGN -> Value.BGN
            BHD -> Value.BHD
            BIF -> Value.BIF
            BMD -> Value.BMD
            BND -> Value.BND
            BOB -> Value.BOB
            BOV -> Value.BOV
            BRL -> Value.BRL
            BSD -> Value.BSD
            BTN -> Value.BTN
            BWP -> Value.BWP
            BYN -> Value.BYN
            BZD -> Value.BZD
            CAD -> Value.CAD
            CDF -> Value.CDF
            CHE -> Value.CHE
            CHF -> Value.CHF
            CHW -> Value.CHW
            CLF -> Value.CLF
            CLP -> Value.CLP
            CNY -> Value.CNY
            COP -> Value.COP
            COU -> Value.COU
            CRC -> Value.CRC
            CUC -> Value.CUC
            CUP -> Value.CUP
            CVE -> Value.CVE
            CZK -> Value.CZK
            DJF -> Value.DJF
            DKK -> Value.DKK
            DOP -> Value.DOP
            DZD -> Value.DZD
            EGP -> Value.EGP
            ERN -> Value.ERN
            ETB -> Value.ETB
            EUR -> Value.EUR
            FJD -> Value.FJD
            FKP -> Value.FKP
            GBP -> Value.GBP
            GEL -> Value.GEL
            GHS -> Value.GHS
            GIP -> Value.GIP
            GMD -> Value.GMD
            GNF -> Value.GNF
            GTQ -> Value.GTQ
            GYD -> Value.GYD
            HKD -> Value.HKD
            HNL -> Value.HNL
            HRK -> Value.HRK
            HTG -> Value.HTG
            HUF -> Value.HUF
            IDR -> Value.IDR
            ILS -> Value.ILS
            INR -> Value.INR
            IQD -> Value.IQD
            IRR -> Value.IRR
            ISK -> Value.ISK
            JMD -> Value.JMD
            JOD -> Value.JOD
            JPY -> Value.JPY
            KES -> Value.KES
            KGS -> Value.KGS
            KHR -> Value.KHR
            KMF -> Value.KMF
            KPW -> Value.KPW
            KRW -> Value.KRW
            KWD -> Value.KWD
            KYD -> Value.KYD
            KZT -> Value.KZT
            LAK -> Value.LAK
            LBP -> Value.LBP
            LKR -> Value.LKR
            LRD -> Value.LRD
            LSL -> Value.LSL
            LYD -> Value.LYD
            MAD -> Value.MAD
            MDL -> Value.MDL
            MGA -> Value.MGA
            MKD -> Value.MKD
            MMK -> Value.MMK
            MNT -> Value.MNT
            MOP -> Value.MOP
            MRU -> Value.MRU
            MUR -> Value.MUR
            MVR -> Value.MVR
            MWK -> Value.MWK
            MXN -> Value.MXN
            MXV -> Value.MXV
            MYR -> Value.MYR
            MZN -> Value.MZN
            NAD -> Value.NAD
            NGN -> Value.NGN
            NIO -> Value.NIO
            NOK -> Value.NOK
            NPR -> Value.NPR
            NZD -> Value.NZD
            OMR -> Value.OMR
            PAB -> Value.PAB
            PEN -> Value.PEN
            PGK -> Value.PGK
            PHP -> Value.PHP
            PKR -> Value.PKR
            PLN -> Value.PLN
            PYG -> Value.PYG
            QAR -> Value.QAR
            RON -> Value.RON
            RSD -> Value.RSD
            RUB -> Value.RUB
            RWF -> Value.RWF
            SAR -> Value.SAR
            SBD -> Value.SBD
            SCR -> Value.SCR
            SDG -> Value.SDG
            SEK -> Value.SEK
            SGD -> Value.SGD
            SHP -> Value.SHP
            SLE -> Value.SLE
            SLL -> Value.SLL
            SOS -> Value.SOS
            SRD -> Value.SRD
            SSP -> Value.SSP
            STN -> Value.STN
            SVC -> Value.SVC
            SYP -> Value.SYP
            SZL -> Value.SZL
            THB -> Value.THB
            TJS -> Value.TJS
            TMT -> Value.TMT
            TND -> Value.TND
            TOP -> Value.TOP
            TRY -> Value.TRY
            TTD -> Value.TTD
            TWD -> Value.TWD
            TZS -> Value.TZS
            UAH -> Value.UAH
            UGX -> Value.UGX
            USD -> Value.USD
            USN -> Value.USN
            UYI -> Value.UYI
            UYU -> Value.UYU
            UYW -> Value.UYW
            UZS -> Value.UZS
            VED -> Value.VED
            VES -> Value.VES
            VND -> Value.VND
            VUV -> Value.VUV
            WST -> Value.WST
            XAF -> Value.XAF
            XAG -> Value.XAG
            XAU -> Value.XAU
            XBA -> Value.XBA
            XBB -> Value.XBB
            XBC -> Value.XBC
            XBD -> Value.XBD
            XCD -> Value.XCD
            XDR -> Value.XDR
            XOF -> Value.XOF
            XPD -> Value.XPD
            XPF -> Value.XPF
            XPT -> Value.XPT
            XSU -> Value.XSU
            XTS -> Value.XTS
            XUA -> Value.XUA
            XXX -> Value.XXX
            YER -> Value.YER
            ZAR -> Value.ZAR
            ZMW -> Value.ZMW
            ZWL -> Value.ZWL
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            AED -> Known.AED
            AFN -> Known.AFN
            ALL -> Known.ALL
            AMD -> Known.AMD
            ANG -> Known.ANG
            AOA -> Known.AOA
            ARS -> Known.ARS
            AUD -> Known.AUD
            AWG -> Known.AWG
            AZN -> Known.AZN
            BAM -> Known.BAM
            BBD -> Known.BBD
            BDT -> Known.BDT
            BGN -> Known.BGN
            BHD -> Known.BHD
            BIF -> Known.BIF
            BMD -> Known.BMD
            BND -> Known.BND
            BOB -> Known.BOB
            BOV -> Known.BOV
            BRL -> Known.BRL
            BSD -> Known.BSD
            BTN -> Known.BTN
            BWP -> Known.BWP
            BYN -> Known.BYN
            BZD -> Known.BZD
            CAD -> Known.CAD
            CDF -> Known.CDF
            CHE -> Known.CHE
            CHF -> Known.CHF
            CHW -> Known.CHW
            CLF -> Known.CLF
            CLP -> Known.CLP
            CNY -> Known.CNY
            COP -> Known.COP
            COU -> Known.COU
            CRC -> Known.CRC
            CUC -> Known.CUC
            CUP -> Known.CUP
            CVE -> Known.CVE
            CZK -> Known.CZK
            DJF -> Known.DJF
            DKK -> Known.DKK
            DOP -> Known.DOP
            DZD -> Known.DZD
            EGP -> Known.EGP
            ERN -> Known.ERN
            ETB -> Known.ETB
            EUR -> Known.EUR
            FJD -> Known.FJD
            FKP -> Known.FKP
            GBP -> Known.GBP
            GEL -> Known.GEL
            GHS -> Known.GHS
            GIP -> Known.GIP
            GMD -> Known.GMD
            GNF -> Known.GNF
            GTQ -> Known.GTQ
            GYD -> Known.GYD
            HKD -> Known.HKD
            HNL -> Known.HNL
            HRK -> Known.HRK
            HTG -> Known.HTG
            HUF -> Known.HUF
            IDR -> Known.IDR
            ILS -> Known.ILS
            INR -> Known.INR
            IQD -> Known.IQD
            IRR -> Known.IRR
            ISK -> Known.ISK
            JMD -> Known.JMD
            JOD -> Known.JOD
            JPY -> Known.JPY
            KES -> Known.KES
            KGS -> Known.KGS
            KHR -> Known.KHR
            KMF -> Known.KMF
            KPW -> Known.KPW
            KRW -> Known.KRW
            KWD -> Known.KWD
            KYD -> Known.KYD
            KZT -> Known.KZT
            LAK -> Known.LAK
            LBP -> Known.LBP
            LKR -> Known.LKR
            LRD -> Known.LRD
            LSL -> Known.LSL
            LYD -> Known.LYD
            MAD -> Known.MAD
            MDL -> Known.MDL
            MGA -> Known.MGA
            MKD -> Known.MKD
            MMK -> Known.MMK
            MNT -> Known.MNT
            MOP -> Known.MOP
            MRU -> Known.MRU
            MUR -> Known.MUR
            MVR -> Known.MVR
            MWK -> Known.MWK
            MXN -> Known.MXN
            MXV -> Known.MXV
            MYR -> Known.MYR
            MZN -> Known.MZN
            NAD -> Known.NAD
            NGN -> Known.NGN
            NIO -> Known.NIO
            NOK -> Known.NOK
            NPR -> Known.NPR
            NZD -> Known.NZD
            OMR -> Known.OMR
            PAB -> Known.PAB
            PEN -> Known.PEN
            PGK -> Known.PGK
            PHP -> Known.PHP
            PKR -> Known.PKR
            PLN -> Known.PLN
            PYG -> Known.PYG
            QAR -> Known.QAR
            RON -> Known.RON
            RSD -> Known.RSD
            RUB -> Known.RUB
            RWF -> Known.RWF
            SAR -> Known.SAR
            SBD -> Known.SBD
            SCR -> Known.SCR
            SDG -> Known.SDG
            SEK -> Known.SEK
            SGD -> Known.SGD
            SHP -> Known.SHP
            SLE -> Known.SLE
            SLL -> Known.SLL
            SOS -> Known.SOS
            SRD -> Known.SRD
            SSP -> Known.SSP
            STN -> Known.STN
            SVC -> Known.SVC
            SYP -> Known.SYP
            SZL -> Known.SZL
            THB -> Known.THB
            TJS -> Known.TJS
            TMT -> Known.TMT
            TND -> Known.TND
            TOP -> Known.TOP
            TRY -> Known.TRY
            TTD -> Known.TTD
            TWD -> Known.TWD
            TZS -> Known.TZS
            UAH -> Known.UAH
            UGX -> Known.UGX
            USD -> Known.USD
            USN -> Known.USN
            UYI -> Known.UYI
            UYU -> Known.UYU
            UYW -> Known.UYW
            UZS -> Known.UZS
            VED -> Known.VED
            VES -> Known.VES
            VND -> Known.VND
            VUV -> Known.VUV
            WST -> Known.WST
            XAF -> Known.XAF
            XAG -> Known.XAG
            XAU -> Known.XAU
            XBA -> Known.XBA
            XBB -> Known.XBB
            XBC -> Known.XBC
            XBD -> Known.XBD
            XCD -> Known.XCD
            XDR -> Known.XDR
            XOF -> Known.XOF
            XPD -> Known.XPD
            XPF -> Known.XPF
            XPT -> Known.XPT
            XSU -> Known.XSU
            XTS -> Known.XTS
            XUA -> Known.XUA
            XXX -> Known.XXX
            YER -> Known.YER
            ZAR -> Known.ZAR
            ZMW -> Known.ZMW
            ZWL -> Known.ZWL
            else -> throw LithicInvalidDataException("Unknown Currency: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
