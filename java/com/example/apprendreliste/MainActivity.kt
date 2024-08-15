package com.example.apprendreliste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apprendreliste.data.all
import com.example.apprendreliste.ui.composable.scaffoldComposable
import com.example.apprendreliste.ui.composable.simpleList
import com.example.apprendreliste.ui.theme.ApprendreListeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApprendreListeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    scaffoldComposable()
                }
            }
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/

@Preview (showBackground = true)
@Composable
fun ScaffoldPreview(){
    ApprendreListeTheme {
        scaffoldComposable()
            simpleList(Message = all)

    }
}
