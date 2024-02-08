package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ui.theme.Aula1NicolasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula1NicolasTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        Tela(texto = "Melhor", Color.Cyan)
                        Tela(texto = "Melhor", Color.Red)
                    }

                }
            }
        }
    }
}

@Composable
fun Tela (texto: String, cor: Color) {
    Column {
        Text(text = "Quem é o $texto?", fontSize= 32.sp, color = cor)
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Eros o melhor")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "União Sinistra")
            }
        }
        Text(text = "Nem o app aceita o click nessa União de merda ai")
    }
}
