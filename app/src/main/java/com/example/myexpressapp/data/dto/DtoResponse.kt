package com.example.myexpressapp.data.dto


import com.google.gson.annotations.SerializedName

data class DtoResponse(
    @SerializedName("name")
    val name: String = ""
)