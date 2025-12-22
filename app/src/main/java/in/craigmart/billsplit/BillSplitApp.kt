package `in`.craigmart.billsplit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import `in`.craigmart.billsplit.navigation.BillSplitNavDisplay
import `in`.craigmart.billsplit.ui.bills.BillList
import `in`.craigmart.billsplit.ui.theme.BillSplitTheme

@Composable
fun BillSplitApp() {
    BillSplitTheme {
        val backStack = remember { mutableStateListOf<Any>(BillList) }

        BillSplitNavDisplay(backStack)
    }
}