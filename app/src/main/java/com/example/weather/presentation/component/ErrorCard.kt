package com.example.weather.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.weather.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.ui.theme.WeatherTheme


@Composable
 fun ErrorCard(modifier: Modifier = Modifier,
                      errorTittle : String,
                      errorDesc: String,
                      errorText : String,
                      onClick : ()-> Unit,
                      cardModifier: Modifier,
                      )
{
    Box(modifier = modifier, contentAlignment = Alignment.Center)
    {
        Card (modifier = cardModifier){
            Column (modifier= Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Box(modifier = Modifier.fillMaxWidth()
                    .weight(1f)
                    .background(color = MaterialTheme.colorScheme.onErrorContainer)
                )
                {
                    Column (modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround){
                        Image(modifier = Modifier.size(64.dp),
                            painter = painterResource(id = R.drawable.error),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                        Text(text = errorText, style = MaterialTheme.typography.headlineSmall)
                    }
                }
                Box(modifier = Modifier.fillMaxWidth()
                    .weight(1f),
                    contentAlignment = Alignment.Center)
                {
                    Text(modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = errorDesc,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.primary)
                    Button(onClick = onClick,
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.error),
                        shape = RoundedCornerShape(50.dp)
                    ) {
                        Text(errorText.uppercase(), style = MaterialTheme.typography.headlineSmall)
                    }
                }
            }
        }
    }

}
@Preview
@Composable
fun Weatherscrenn()
{
    WeatherTheme {
        ErrorCard(modifier = Modifier.fillMaxWidth(), errorDesc = "saddas", errorText = "dsadsadsad", errorTittle = "dfdfdfdsf",
            cardModifier = Modifier, onClick = {})
    }
}