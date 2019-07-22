package com.example.networking

import com.example.models.CharactersResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

import com.example.BuildConfig.BASE_URL
import retrofit2.http.Url

object Api {

    private var api: ApiInterface = getApi()

    fun getApi(): ApiInterface {
            val client = OkHttpClient.Builder()
                .build()


            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            api = retrofit.create(ApiInterface::class.java)
        return api
    }

    interface ApiInterface {

        @GET
        @Headers("Accept: application/json")
        fun getCharacters(@Url url: String = BASE_URL) : Call<CharactersResponse>

    }
}