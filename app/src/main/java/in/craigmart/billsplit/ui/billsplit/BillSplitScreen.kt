package `in`.craigmart.billsplit.ui.billsplit

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import `in`.craigmart.billsplit.ui.billsplit.BillSplitViewModel
import `in`.craigmart.billsplit.ui.theme.BillSplitTheme

@Composable
fun BillSplitScreen(viewModel: BillSplitViewModel = viewModel()) {
    // UI to be implemented
}

@Composable
private fun BillSplitContent() {

}

@Preview
@Composable
private fun BillSplitContentPreview() {
    BillSplitTheme {
        BillSplitContent()
    }
}
