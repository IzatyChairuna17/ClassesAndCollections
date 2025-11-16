package pnm.tigad.classdankoleksi

enum class Daypart { MORNING, AFTERNOON, EVENING }

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {
    val event1 = Event("Wake up", "Time to get up", Daypart.MORNING, 0)
    val event2 = Event("Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event("Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event("Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event("Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event("Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf(event1, event2, event3, event4, event5, event6)
    println(events)
}