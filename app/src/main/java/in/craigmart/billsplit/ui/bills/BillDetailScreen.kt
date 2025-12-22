package `in`.craigmart.billsplit.ui.bills

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import `in`.craigmart.billsplit.R

@Composable
fun BillDetailScreen(
    onBack: () -> Unit,
) {
    BillDetailScreenContent(
        onBack = onBack,
        onAddItemClick = { }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BillDetailScreenContent(
    onBack: () -> Unit,
    onAddItemClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Bill Detail") },
                navigationIcon = {
                    IconButton(
                        onClick = onBack
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.arrow_back_24px),
                            contentDescription = "Add Item",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            SmallFloatingActionButton(
                onClick = onAddItemClick
            ) {
                Icon(
                    painter = painterResource(R.drawable.add_24px),
                    contentDescription = "Add Item",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(contentPadding)
        ) {
            Text("People")
            Text("Bill Detail")
        }
    }
}

@Preview
@Composable
private fun BillDetailScreenPreview() {
    BillDetailScreenContent(
        onBack = { },
        onAddItemClick = { }
    )
}