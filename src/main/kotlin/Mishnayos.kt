package shmuly.sternbach.custommishnahlearningprogram.logic

import shmuly.sternbach.custommishnahlearningprogram.LearningProgramMaterialGenerator
import shmuly.sternbach.custommishnahlearningprogram.inHebrew

open class Mishnayos : LearningProgramMaterialGenerator() {
    val hebrewList = listOf(
        "ברכות",
        "פאה",
        "דמאי",
        "כלאים",
        "שביעית",
        "תרומות",
        "מעשרות",
        "חלה",
        "ערלה",
        "ביכורים",
        "שבת",
        "עירובין",
        "פסחים",
        "שקלים",
        "יומא",
        "סוכה",
        "ביצה",
        "תענית",
        "מגילה",
        "חגיגה",
        "יבמות",
        "כתובות",
        "נדרים",
        "נזיר",
        "סוטה",
        "גיטין",
        "קידושין",
        "סנהדרין",
        "מכות",
        "שבועות",
        "עדיות",
        "אבות",
        "הוריות",
        "זבחים",
        "מנחות",
        "חולין",
        "בכורות",
        "ערכין",
        "תמורה",
        "כריתות",
        "מעילה",
        "תמיד",
        "מדות",
        "קינים",
        "כלים",
        "אהלות",
        "נגעים",
        "פרה",
        "טהרות",
        "מקואות",
        "נדה",
        "מכשירין",
        "זבים",
        "ידים",
        "עוקצים",
    )
    val englishList = listOf( //Masechtos
        "Berachos",
        "Pe'ah",
        "Demai",
        "Kil'aim",
        "Shevi'is",
        "Terumos",
        "Ma'aseros",
        "Ma'aser Sheni",
        "Chalah",
        "Orlah",
        "Bikkurim",
        "Shabbos",
        "Eruvin",
        "Pesachim",
        "Shekalim",
        "Yoma",
        "Sukkah",
        "Beitzah",
        "Rosh HaShanah",
        "Ta'anis",
        "Megilah",
        "Moed Kattan",
        "Chaggigah",
        "Yevamos",
        "Kesubos",
        "Nedarim",
        "Nazir",
        "Sotah",
        "Gittin",
        "Kidushin",
        "Bava Kamma",
        "Bava Metzia",
        "Bava Basra",
        "Sanhedrin",
        "Makkos",
        "Shevuos",
        "Eduyos",
        "Avodah Zara",
        "Avos",
        "Horayos",
        "Zevachim",
        "Menachos",
        "Chullin",
        "Bechoros",
        "Arachin",
        "Temurah",
        "Kerisos",
        "Me'ilah",
        "Tamid",
        "Middos",
        "Kinnim",
        "Keilim",
        "Ohalos",
        "Negaim",
        "Parah",
        "Taharos",
        "Mikva'os",
        "Niddah",
        "Machshirin",
        "Zavim",
        "Tevul Yom",
        "Yadayim",
        "Uktzim"
    )
    override val chapterLengths: List<List<Int>> = listOf( //Perakim
        listOf(5, 8, 6, 7, 5, 8, 5, 8, 5),
        listOf(6, 8, 8, 11, 8, 11, 8, 9),
        listOf(4, 5, 6, 7, 11, 12, 8),
        listOf(9, 11, 7, 9, 8, 9, 8, 6, 10),
        listOf(8, 10, 10, 10, 9, 6, 7, 11, 9, 9),
        listOf(10, 6, 9, 13, 9, 6, 7, 12, 7, 12, 10),
        listOf(8, 8, 10, 6, 8),
        listOf(7, 10, 13, 12, 15),
        listOf(9, 8, 10, 11),
        listOf(9, 17, 9),
        listOf(11, 11, 12, 5),
        listOf(11, 7, 6, 2, 4, 10, 4, 7, 7, 6, 6, 6, 7, 4, 3, 8, 8, 3, 6, 5, 3, 6, 5, 5),
        listOf(10, 6, 9, 11, 9, 10, 11, 11, 4, 15),
        listOf(7, 8, 8, 9, 10, 6, 13, 8, 11, 9),
        listOf(7, 5, 4, 9, 6, 6, 7, 8),
        listOf(8, 7, 11, 6, 7, 8, 5, 9),
        listOf(11, 9, 15, 10, 8),
        listOf(10, 10, 8, 7, 7),
        listOf(9, 8, 9, 9),
        listOf(7, 10, 9, 8),
        listOf(11, 6, 6, 10),
        listOf(10, 5, 9),
        listOf(8, 7, 8),
        listOf(4, 10, 10, 13, 6, 6, 6, 6, 6, 9, 7, 6, 13, 9, 10, 7),
        listOf(10, 10, 9, 12, 9, 7, 10, 8, 9, 6, 6, 4, 11),
        listOf(4, 5, 11, 8, 6, 10, 9, 7, 10, 8, 12),
        listOf(7, 10, 7, 7, 7, 11, 4, 2, 5),
        listOf(9, 6, 8, 5, 5, 4, 8, 7, 15),
        listOf(6, 7, 8, 9, 9, 7, 9, 10, 10),
        listOf(10, 10, 13, 14),
        listOf(4, 6, 11, 9, 7, 6, 7, 7, 12, 10),
        listOf(8, 11, 12, 12, 11, 8, 11, 9, 13, 6),
        listOf(6, 14, 8, 9, 11, 8, 4, 8, 10, 8),
        listOf(6, 5, 8, 5, 5, 6, 11, 7, 6, 6, 6),
        listOf(10, 8, 16),
        listOf(7, 5, 11, 13, 5, 7, 8, 6),
        listOf(14, 10, 12, 12, 7, 3, 9, 7),
        listOf(9, 7, 10, 12, 12),
        listOf(18, 16, 18, 22, 23, 11),
        listOf(5, 7, 8),
        listOf(4, 5, 6, 6, 8, 7, 6, 12, 7, 8, 8, 6, 8, 10),
        listOf(4, 5, 7, 5, 9, 7, 6, 7, 9, 9, 9, 5, 11),
        listOf(7, 10, 7, 7, 5, 7, 6, 6, 8, 4, 2, 5),
        listOf(7, 9, 4, 10, 6, 12, 7, 10, 8),
        listOf(4, 6, 5, 4, 6, 5, 5, 7, 8),
        listOf(6, 3, 5, 4, 6, 5, 6),
        listOf(7, 6, 10, 3, 8, 9),
        listOf(4, 9, 8, 6, 5, 6),
        listOf(4, 5, 9, 3, 6, 4, 3),
        listOf(9, 6, 8, 7, 4),
        listOf(4, 5, 6),
        listOf(
            9,
            8,
            8,
            4,
            11,
            4,
            6,
            11,
            8,
            8,
            9,
            8,
            8,
            8,
            6,
            8,
            17,
            9,
            10,
            7,
            3,
            10,
            5,
            17,
            9,
            9,
            12,
            10,
            8,
            4
        ),
        listOf(8, 7, 7, 3, 7, 7, 6, 6, 16, 7, 9, 8, 6, 7, 10, 5, 5, 10),
        listOf(6, 5, 8, 11, 5, 8, 5, 10, 3, 10, 12, 7, 12, 13),
        listOf(4, 5, 11, 4, 9, 5, 12, 11, 9, 6, 9, 11),
        listOf(9, 8, 8, 13, 9, 10, 9, 9, 9, 8),
        listOf(8, 10, 4, 5, 6, 11, 7, 5, 7, 8),
        listOf(7, 7, 7, 7, 9, 14, 5, 4, 11, 8),
        listOf(6, 11, 8, 10, 11, 8),
        listOf(6, 4, 3, 7, 12),
        listOf(5, 8, 6, 7),
        listOf(5, 4, 5, 8),
        listOf(6, 10, 12)
    )
    override var numReviewsPerUnit: Int = 6
    override val reviewIntervals: MutableList<Int> = mutableListOf()
    override val programName: String = "Mishnayos"
    override val chapterNames: List<String> = if (inHebrew) hebrewList else englishList
}