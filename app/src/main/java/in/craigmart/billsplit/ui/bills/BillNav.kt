package `in`.craigmart.billsplit.ui.bills

import androidx.navigation3.runtime.EntryProviderScope

data object BillList
data class BillDetail(val id: Int)

fun EntryProviderScope<Any>.billFeature(backstack: MutableList<Any>)  {
    entry<BillList> {
        BillSplitScreen(
            onPeopleClick = { },
            onAddBillClick = { backstack.add(BillDetail(1))}
        )
    }

    entry<BillDetail> {
        BillDetailScreen(
            onBack = { backstack.removeLastOrNull() }
        )
    }
}