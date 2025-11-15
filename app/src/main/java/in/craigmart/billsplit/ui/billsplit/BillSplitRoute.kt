package `in`.craigmart.billsplit.ui.billsplit

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val BillSplitRoute = "bill_split"

fun NavGraphBuilder.billSplitRoute() {
    composable(BillSplitRoute) {
        BillSplitScreen()
    }
}

fun NavController.navigateToBillSplit() {
    navigate(BillSplitRoute)
}