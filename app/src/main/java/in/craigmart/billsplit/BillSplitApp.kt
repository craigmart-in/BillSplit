package `in`.craigmart.billsplit

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import `in`.craigmart.billsplit.navigation.BillSplitNavHost
import `in`.craigmart.billsplit.ui.theme.BillSplitTheme

@Composable
fun BillSplitApp() {
    BillSplitTheme {
        val navController = rememberNavController()

        BillSplitNavHost(navController)
    }
}