package com.example.stormgame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stormgame.ui.theme.StormGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StormGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StorGame()
                }
            }
        }
    }
}

@Composable
fun StorGame() {

    val GetGold = remember {
        mutableStateOf(0)
    }
    val changeDirection = remember {
        mutableStateOf("North")
    }

    Column {
        Text(text = "Number of Gold ${GetGold.value}")
        Text(text = "Current Direction ${changeDirection.value}")

        Button(onClick = {
            changeDirection.value = "East"
        }) {
            Text(text = "East")
        }

        Button(onClick = {
            changeDirection.value = "West"
        }) {
            Text(text = "West")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StormGameTheme {
//        Greeting("Android")
    }
}