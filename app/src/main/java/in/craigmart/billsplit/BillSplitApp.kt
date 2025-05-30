package `in`.craigmart.billsplit

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import `in`.craigmart.billsplit.ui.theme.BillSplitNavHost
import `in`.craigmart.billsplit.ui.theme.BillSplitTheme

@Composable
fun BillSplitApp() {
    BillSplitTheme {
        val navController = rememberNavController()

        BillSplitNavHost(navController)

//        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//
//        }
    }
}