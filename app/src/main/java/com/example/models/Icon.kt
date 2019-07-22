package com.example.models

import com.google.gson.annotations.Expose

data class Icon(
    @Expose
    val Height: String = "",
    @Expose
    val URL: String = "",
    @Expose
    val Width: String = ""
)