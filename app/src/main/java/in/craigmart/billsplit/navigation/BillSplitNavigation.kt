package `in`.craigmart.billsplit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import `in`.craigmart.billsplit.ui.billsplit.billList


@Composable
fun BillSplitNavDisplay(
    backstack: MutableList<Any>,
) {
    NavDisplay(
        backStack = backstack,
        onBack = { backstack.removeLastOrNull() },
        entryProvider = entryProvider {
            billList()
        }
    )
}
