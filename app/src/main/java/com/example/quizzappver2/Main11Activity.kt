package com.example.quizzappver2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizzappver2.ui.theme.Quizzappver2Theme

class Main11Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {




            Quizzappver2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green
                ) {



                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        var selectedOption by remember { mutableStateOf("") }
                        var selectedOption2 by remember { mutableStateOf("") }


                        Spacer(modifier = Modifier.height(30.dp))
                        Text("Answer The following Questions ", fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(10.dp))
                        // MATRIX T



                        Spacer(modifier = Modifier.height(50.dp))
                        Text("Q.1 Which of these characters was almost added into Super Smash Bros. Melee, but not included as the game was too far in development?", fontSize = 15.sp, modifier = Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Column (horizontalAlignment = Alignment.Start){



                            Row {

                                RadioButton(selected = selectedOption=="Solid snake", onClick = {
                                    selectedOption="Solid snake"



                                })
                                Text(
                                    text = "Solid snake",
                                    modifier = Modifier.paddingFromBaseline(30.dp)
                                )

                            }
                            Row {
                                RadioButton(selected = selectedOption=="Pit", onClick = {
                                    selectedOption="Pit"


                                })
                                Text(text = "Pit ", modifier = Modifier.paddingFromBaseline(30.dp))

                            }
                            Row {
                                RadioButton(selected =  selectedOption=="Meta Knight", onClick = {
                                     selectedOption="Meta Knight"
                                })
                                Text(
                                    text = "Meta Knight",
                                    modifier = Modifier.paddingFromBaseline(30.dp)
                                )

                            }
                            Row {
                                RadioButton(selected = selectedOption=="R.O.B", onClick = {
                                    selectedOption="R.O.B"
                                })
                                Text(text = "R.O.B", modifier = Modifier.paddingFromBaseline(30.dp))

                            }
                        }

                        Text("Q.2 Which animated film did Steven Lisberger direct in 1980 before going on to direct Tron", fontSize = 15.sp, modifier = Modifier.padding(20.dp))
                        Column (horizontalAlignment = Alignment.Start){



                            Row {

                                RadioButton(selected = selectedOption2=="Animalympics", onClick = {
                                    selectedOption2="Animalympics"



                                })
                                Text(
                                    text = "Animalympics",
                                    modifier = Modifier.paddingFromBaseline(30.dp)
                                )

                            }
                            Row {
                                RadioButton(selected = selectedOption2=="The Fox and the Hound", onClick = {
                                    selectedOption2="The Fox and the Hound"


                                })
                                Text(text = "The Fox and the Hound", modifier = Modifier.paddingFromBaseline(30.dp))

                            }
                            Row {
                                RadioButton(selected =  selectedOption2=="The Black Cauldron", onClick = {
                                    selectedOption2="The Black Cauldron"
                                })
                                Text(
                                    text = "The Black Cauldron",
                                    modifier = Modifier.paddingFromBaseline(30.dp)
                                )

                            }
                            Row {
                                RadioButton(selected = selectedOption2=="The Great Mouse Detecive", onClick = {
                                    selectedOption2="The Great Mouse Detecive"
                                })
                                Text(text = "The Great Mouse Detecive", modifier = Modifier.paddingFromBaseline(30.dp))

                            }
                        }



                        OutlinedButton(onClick = {
                            if(selectedOption=="Solid snake" && selectedOption2=="Animalympics"){

                                val intent = Intent(this@Main11Activity,Main12Activity::class.java)

                                startActivity(intent)

                            }else if(selectedOption !="Solid snake" && selectedOption2!="Animalympics"){

                                val intent = Intent(this@Main11Activity,Main14Activity::class.java)

                                startActivity(intent)
                            }else{

                                val intent = Intent(this@Main11Activity,Main13Activity::class.java)

                                startActivity(intent)
                            }



                        }) {

                            Text(text = "Sumbit The Quiz" , fontSize= 20.sp )
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

