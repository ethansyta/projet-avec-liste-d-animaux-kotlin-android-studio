package com.example.apprendreliste.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apprendreliste.data.all
import com.example.apprendreliste.model.Message

@Composable
fun simpleList(Message : List<Message>){

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(enabled = true,
            state = rememberScrollState())
        ){
            for (message in Message){
                listTile(message = message
                )
            }
    }
}

@Preview
@Composable
fun listPreview(){
    simpleList(Message = all)
}