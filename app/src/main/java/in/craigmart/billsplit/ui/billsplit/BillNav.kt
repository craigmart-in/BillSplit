package `in`.craigmart.billsplit.ui.billsplit

import androidx.navigation3.runtime.EntryProviderScope

data object BillList
data class BillDetail(val id: Int)

fun EntryProviderScope<Any>.billList()  {
    entry<BillList> {
        BillSplitScreen()
    }
}