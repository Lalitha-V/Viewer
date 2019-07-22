package com.example.models

import com.google.gson.annotations.Expose

data class Character(
    @Expose
    val FirstURL: String = "",
    @Expose
    val Icon: Icon = Icon(),
    @Expose
    val Result: String = "",
    @Expose
    val Text: String = ""
)