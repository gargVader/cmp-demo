package com.example.cmpdemo.cmpdemo.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    Column {
        ActionRow()
    }
}


@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

@Composable
fun ActionRow(
    modifier: Modifier = Modifier
){

    Card(modifier = modifier) {

    }

}