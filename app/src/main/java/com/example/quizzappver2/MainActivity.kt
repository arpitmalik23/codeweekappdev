package com.example.quizzappver2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizzappver2.ui.theme.Quizzappver2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quizzappver2Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Cyan
                ) {


                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier=Modifier.height(40.dp))

                        Text(
                            "Quizzz Time",
                            modifier = Modifier.padding(10.dp),
                            fontSize = 30.sp,
                            color = Color.Black
                        )


                        Spacer(modifier = Modifier.height(10.dp))
                        Text("Welcome to thh ultimate quiz ", fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(120.dp))
                        //Box (modifier = Modifier.weight(.1f).height(20.dp).background(color=Color.Green)){


                        Text(
                            "ARE YOU READY!!",
                            modifier = Modifier.padding(10.dp),
                            fontSize = 30.sp,
                            color = Color.Black
                        )


                        Spacer(modifier = Modifier.height(35.dp))


                        OutlinedButton(onClick = {




                            val intent = Intent(this@MainActivity,Main11Activity::class.java)

                            startActivity(intent)

                        }) {

                            Text(text = "Start  the Quiz" , fontSize= 20.sp )
                        }

                        Spacer(modifier = Modifier.height(30.dp))

                        //Matrix P
                        /* OutlinedButton(onClick = {


                         }) {

                             Text(text = "Entertainment Catagory" , fontSize= 20.sp )
                         }
                         Spacer(modifier = Modifier.height(30.dp))

                         //Matrix P
                         OutlinedButton(onClick = {


                         }) {

                             Text(text = "Movie Catagory" , fontSize= 20.sp )
                         } */


                    }


                }


            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Quizzappver2Theme {
        Greeting("Android")
    }
}