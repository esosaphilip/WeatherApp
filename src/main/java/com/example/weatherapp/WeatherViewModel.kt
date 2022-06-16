package com.example.weatherapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.Api.WeatherApi
import kotlinx.coroutines.launch

class WeatherViewModel(): ViewModel() {
    private val _status = MutableLiveData<String>()
    val status: LiveData<String> = _status

    init {
        getWeather()
    }

    private fun getWeather() {
        viewModelScope.launch {
            val listResult = WeatherApi.retrofitService.getForecast()
            _status.value = listResult.toString()
        }
    }

}