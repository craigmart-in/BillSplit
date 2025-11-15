package `in`.craigmart.billsplit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import `in`.craigmart.billsplit.ui.billsplit.BillSplitRoute
import `in`.craigmart.billsplit.ui.billsplit.billSplitRoute

@Composable
fun BillSplitNavHost(
    navController: NavHostController,
) {
    NavHost(navController, startDestination = BillSplitRoute) {
        billSplitRoute()
    }
}