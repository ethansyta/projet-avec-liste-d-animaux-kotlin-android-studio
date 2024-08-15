package com.example.apprendreliste.ui.composable

import androidx.compose.runtime.Composable
import com.example.apprendreliste.data.all

@Composable
fun BodyComposable(){
    simpleList(Message = all)
}