package com.example.cmpdemo.cmpdemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import cmpdemo.composeapp.generated.resources.Res
import cmpdemo.composeapp.generated.resources.compose_multiplatform
import com.example.cmpdemo.cmpdemo.home.HomeScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen({})
    }
}