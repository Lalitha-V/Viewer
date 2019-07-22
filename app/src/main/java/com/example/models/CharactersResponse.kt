package com.example.models

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import com.example.networking.Api
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class CharactersResponse : BaseObservable(){
    @Expose
    val AbstractSource: String = ""
    @Expose
    val AbstractText: String = ""
    @Expose
    val AbstractURL: String = ""
    @Expose
    val Heading: String = ""
    @Expose
    val ImageWidth: Int = 0
    @Expose
    val RelatedTopics: List<Character> = listOf()
}
