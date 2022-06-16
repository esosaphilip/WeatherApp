package com.example.weatherapp.Api

import KolnWeather
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


//http://api.weatherapi.com/v1/forecast.json?key=79996c488e254729994125159221606&q=cologne&days=1&aqi=no&alerts=no

private const val BASE_URL ="http://api.weatherapi.com/"
private const val Api_kEY ="forecast.json?key=79996c488e254729994125159221606&q=cologne&days=1&aqi=no&alerts=no\n"


private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface WeatherInterFace {
    @GET("v1/Api_KEY")
    fun getForecast(): Call<KolnWeather>

}


object WeatherApi {
    val retrofitService : WeatherInterFace by lazy {
        retrofit.create(WeatherInterFace::class.java) }
}