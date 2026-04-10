package com.aline.pokedex

import android.R.attr.height
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aline.pokedex.ui.theme.PokedexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StartScreen(modifier = Modifier.padding(innerPadding))


                }
            }
        }
    }
}

@Composable
fun StartScreen(modifier: Modifier = Modifier){
    var nameOrId by remember { mutableStateOf("") }
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color(247, 247, 247, 255)),




    ) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .background(Color(199, 74, 64, 255)),

        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center


    ) {
        Row(modifier = Modifier,)
        {
            Spacer(modifier= modifier.width(20.dp))
            Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(R.drawable.ic_pokebola),
            colorFilter = ColorFilter.tint(color = Color.White),
            contentDescription = "Pokebola"
        )
            Spacer(modifier= modifier.height(10.dp))
            Spacer(modifier= modifier.width(16.dp))
            Text(text = "Pokédex",
                fontSize = (36.sp),
                color = Color.White)}


    }

        OutlinedTextField(
            value = nameOrId,
            onValueChange = {nameOrId = it},
            modifier = Modifier
                .fillMaxWidth(.98f)
                .padding(all = 20.dp)
                .background(Color(247, 247, 247, 253)),
            shape = RoundedCornerShape(20.dp),
            


            label = {Text(text = "Digite o nome ou o ID")},
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = " "

                )
            }

        )
    }
    @Composable
    fun CardPokemon(modifier: Modifier = Modifier,
    ){
        Column(modifier = Modifier
            .height(30.dp)
            .width(30.dp)
            .background(Color(156, 39, 176, 255))) { }

    }


}

