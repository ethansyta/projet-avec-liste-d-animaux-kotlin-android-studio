package com.example.apprendreliste.ui.composable

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.apprendreliste.model.Message

@Composable
fun listTile(message: Message) {

    Card (modifier = Modifier.padding(5.dp))
    {
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp))
        {
            Image(painter = painterResource(id = message.image ),
                contentDescription = stringResource (id = message.name),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .clip(CircleShape)

            )
            
            Column {
                Text(text = stringResource(id = message.name), fontWeight = FontWeight.Bold)
                Text(text = message.msg,
                    style = MaterialTheme.typography.titleSmall)
            }
        }
    }
}