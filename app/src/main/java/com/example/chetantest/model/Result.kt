package com.example.chetantest.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Result : Serializable {
    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("href")
    @Expose
    var href: String? = null

    @SerializedName("ingredients")
    @Expose
    var ingredients: String? = null

    @SerializedName("thumbnail")
    @Expose
    var thumbnail: String? = null

}