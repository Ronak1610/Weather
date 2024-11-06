package com.example.weather.presentation.Home

sealed interface HomeForecastState {
    data class Success(val forecast: Forecast?): HomeForecastState
    data class Error(val error : String?): HomeForecastState
    object Loading : HomeForecastState
    object Forecast
}