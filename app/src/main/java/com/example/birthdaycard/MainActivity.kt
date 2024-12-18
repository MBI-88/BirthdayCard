package com.example.birthdaycard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface {
        Column {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Text(
                text = "Hola Mikel",
                modifier = modifier
            )
        }
    }

}

@Composable
fun GreetingText(message:String, from:String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        verticalArrangement = Arrangement.Center,

        content = {
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
            )
            Text(
                text = "From $from",
                fontSize = 25.sp,
                lineHeight = 15.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    )

}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
        )
        GreetingText(message, from, Modifier.fillMaxSize().padding(8.dp))
    }

}

@Preview(showBackground = true, showSystemUi = true, name = "MBI")
@Composable
fun GreetingPreview() {
    BirthdayCardTheme {
        //Greeting("Maikel", Modifier.padding(10.dp, 10.dp))
        //GreetingText("Happy Birthday Sam!", "Maikel")
        GreetingImage("Happy Birthday Sam!", "MBI", Modifier.padding(10.dp, 10.dp))
    }
}