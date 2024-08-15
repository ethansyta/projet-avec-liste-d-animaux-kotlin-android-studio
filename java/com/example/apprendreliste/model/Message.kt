package com.example.apprendreliste.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Message(

    @StringRes val name : Int,
    @DrawableRes var image : Int,
    val msg : String
)
