package com.adrianj.examenej2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adrianj.examenej2.ui.theme.ExamenEJ2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEJ2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    principal(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun principal(modifier: Modifier = Modifier) {
    var listacolor = listOf(
        Text(text = "rojo"),
        Text(text = "azul"),
        Text(text = "blanco"),
        Text(text = "negro")
    )
    LazyColumn (modifier = Modifier.padding(all = 13.dp)){
        item {
            Text(text = "rojo")
            Text(text = "azul")
            Text(text = "blanco")
            Text(text = "negro")
        }
    }
}

@Preview()
@Composable
fun GreetingPreview() {
    ExamenEJ2Theme {
        principal()
    }
}