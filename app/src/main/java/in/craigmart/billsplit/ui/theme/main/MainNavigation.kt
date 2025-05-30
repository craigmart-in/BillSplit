package `in`.craigmart.billsplit.ui.theme.main

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object MainRoute

fun NavController.navigateMainRoute() = navigate(MainRoute)

fun NavGraphBuilder.mainRoute() {
    composable<MainRoute> {
        MainScreen()
    }
}
