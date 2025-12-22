package `in`.craigmart.billsplit.ui.bills

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import `in`.craigmart.billsplit.R
import `in`.craigmart.billsplit.ui.theme.BillSplitTheme

@Composable
fun BillSplitScreen(
    onPeopleClick: () -> Unit,
    onAddBillClick: () -> Unit,
    viewModel: BillSplitViewModel = viewModel(),
) {
    BillSplitContent(
        onPeopleClick = onPeopleClick,
        onAddBillClick = onAddBillClick
    )
}

@Composable
private fun BillSplitContent(
    onPeopleClick: () -> Unit,
    onAddBillClick: () -> Unit,
) {
    Scaffold(
        bottomBar = {
            NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
                NavigationBarItem(
                    selected = true,
                    onClick = { },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.receipt_24px),
                            contentDescription = "Add Bill",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    },
                    label = { Text("Bills") }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = onPeopleClick,
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.person_24px),
                            contentDescription = "Add Bill",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    },
                    label = { Text("People") }
                )
            }
        },
        floatingActionButton = {
            SmallFloatingActionButton(
                onClick = onAddBillClick
            ) {
                Icon(
                    painter = painterResource(R.drawable.add_24px),
                    contentDescription = "Add Bill",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            Text("Bill Split")
        }
    }
}

@Preview
@Composable
private fun BillSplitContentPreview() {
    BillSplitTheme {
        BillSplitContent(
            onPeopleClick = { },
            onAddBillClick = { }
        )
    }
}
