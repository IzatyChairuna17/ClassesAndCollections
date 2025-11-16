package pnm.tigad.classdankoleksi

data class OldEvent (
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int
)

fun main() {
    val event = OldEvent(
        title = "Belajar Kotlin",
        description = "Berkomitmen untuk mempelajari Kotlin setidaknya 15 menit per hari.",
        daypart = "evening",
        durationInMinutes = 15
    )

    println(event)
}