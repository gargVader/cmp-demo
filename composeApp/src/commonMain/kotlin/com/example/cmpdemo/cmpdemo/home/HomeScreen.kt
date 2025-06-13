package com.example.cmpdemo.cmpdemo.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cmpdemo.composeapp.generated.resources.Res
import cmpdemo.composeapp.generated.resources.recent_activity
import cmpdemo.composeapp.generated.resources.take_picture
import cmpdemo.composeapp.generated.resources.take_picture_label
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(onPhotoSearchClick: () -> Unit) {
    Column(modifier = Modifier) {
        ActionRow(onClick = onPhotoSearchClick)

        Spacer(modifier = Modifier.fillMaxWidth().height(16.dp))

        Spacer(modifier = Modifier.fillMaxWidth().height(32.dp))

        RecentActivity()

    }
}


@Preview
@Composable
fun HomeScreenPreview() {

    MaterialTheme {
        HomeScreen(
            onPhotoSearchClick = {}
        )
    }
}

@Composable
fun ActionRow(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {

    Card(modifier = modifier, onClick = onClick) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.CameraAlt,
                contentDescription = "Picture",
                modifier = Modifier.size(32.dp)
            )
            Text(stringResource(Res.string.take_picture), style = MaterialTheme.typography.headlineSmall)
            Text(stringResource(Res.string.take_picture_label), style = MaterialTheme.typography.labelSmall)
        }
    }

}

@Composable
fun RecentActivity() {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.History, contentDescription = null, modifier = Modifier.padding(end = 8.dp))
            Text(stringResource(Res.string.recent_activity), style = MaterialTheme.typography.headlineSmall)
        }
        Spacer(modifier = Modifier.fillMaxWidth().height(16.dp))
        RecentActivityRow()
        RecentActivityRow()
        RecentActivityRow()
    }
}

@Composable
fun RecentActivityRow() {
    Card(modifier = Modifier.padding(bottom = 8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Picture",
                modifier = Modifier.size(32.dp).padding(end = 8.dp)
            )
            Text("Egg Shells", modifier = Modifier.weight(1f))
            Text("2 days ago")
        }
    }
}
