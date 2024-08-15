package com.example.apprendreliste.ui.composable

import android.annotation.SuppressLint
import android.os.Message
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apprendreliste.data.all
import com.example.apprendreliste.ui.theme.ApprendreListeTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scaffoldComposable(){

    Scaffold(
        topBar= { AppBarComposable()},
        content = { BodyComposable()}

    )







}




