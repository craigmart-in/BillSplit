package `in`.craigmart.billsplit.data

data class Item(
    val name: String,
    val cost: Double,
    val people: List<Person> = emptyList()
)