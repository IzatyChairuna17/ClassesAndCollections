package pnm.tigad.classesandcollections

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day",
        daypart = Daypart.MORNING,
        durationInMinutes = 15
    )
    println(event)
}