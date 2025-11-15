package `in`.craigmart.billsplit.data

data class Bill(
    val items: List<Item> = emptyList(),
    val people: List<Person> = emptyList(),
    val tax: Double = 0.0,
    val tip: Double = 0.0
)
