package `in`.craigmart.billsplit.ui.bills

import androidx.lifecycle.ViewModel
import `in`.craigmart.billsplit.data.Bill
import `in`.craigmart.billsplit.data.Item
import `in`.craigmart.billsplit.data.Person
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BillSplitViewModel : ViewModel() {

    private val _bill = MutableStateFlow(Bill())
    val bill: StateFlow<Bill> = _bill

    fun addItem(item: Item) {
        _bill.value = _bill.value.copy(items = _bill.value.items + item)
    }

    fun addPerson(person: Person) {
        _bill.value = _bill.value.copy(people = _bill.value.people + person)
    }

    fun setTax(tax: Double) {
        _bill.value = _bill.value.copy(tax = tax)
    }

    fun setTip(tip: Double) {
        _bill.value = _bill.value.copy(tip = tip)
    }
}