package pnm.tigad.classdankoleksi

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event (
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {
    val event = Event(
        title = "Belajar Kotlin",
        description = "Berkomitmen untuk mempelajari Kotlin setidaknya 15 menit per hari.",
        daypart = Daypart.EVENING,
        durationInMinutes = 15
    )

    println(event)
}