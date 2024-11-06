package com.example.weather.presentation.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import com.example.weather.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.Core.helpers.SetError
import com.example.weather.Core.utils.ExceptionTiles
import com.example.weather.presentation.component.ErrorCard

@Composable
fun HomeScreen()
{

}



@Preview
@Composable
private fun backgroundImage()
{
    Box(modifier = Modifier.fillMaxSize()){
        Image(modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background,),
            contentDescription = null, contentScale = ContentScale.Crop
        )
    }
}
@Composable
private fun WeatherSection(currentWeatherState: HomeForecastState,errorOnCardClick: () -> Unit)
{

    when(currentWeatherState) {
        is HomeForecastState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){}
            CircularProgressIndicator(modifier = Modifier.size(LocalConfiguration.current.screenWidthDp.dp/3))
        }

        is HomeForecastState.Error -> {
            ErrorCard(modifier = Modifier.fillMaxSize(),
                errorTittle = currentWeatherState.error?: ExceptionTiles.UnknownError,
                errorDesc = SetError.s)

        }
        is HomeForecastState.Success -> {

        }
    }
}