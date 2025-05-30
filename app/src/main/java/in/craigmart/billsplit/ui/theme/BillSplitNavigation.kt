package `in`.craigmart.billsplit.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import `in`.craigmart.billsplit.ui.theme.main.MainRoute
import `in`.craigmart.billsplit.ui.theme.main.mainRoute

@Composable
fun BillSplitNavHost(
    navController: NavHostController,
) {
    NavHost(navController, startDestination = MainRoute) {
        mainRoute()
    }
}