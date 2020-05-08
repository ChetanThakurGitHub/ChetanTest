package com.example.chetantest.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Example : Serializable {
    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("version")
    @Expose
    var version = 0.0

    @SerializedName("href")
    @Expose
    var href: String? = null

    @SerializedName("results")
    @Expose
    var results: List<Result>? = null

}