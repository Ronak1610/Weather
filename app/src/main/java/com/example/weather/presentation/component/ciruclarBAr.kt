package com.example.weather.presentation.component

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp




@Preview
@Composable
fun CircularBar(modifier: Modifier = Modifier) {
    CircularProgressIndicator(
        modifier = modifier,

        strokeWidth = 10.dp, trackColor = MaterialTheme.colorScheme.surfaceVariant,
        strokeCap = StrokeCap.Round
    )
    
}