package com.aline.pokedex
import android.graphics.drawable.Drawable;
import android.R.attr.height
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.platform.InspectableModifier
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
        CardPokemon()
    }
}


@Composable
fun CardPokemon(modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .fillMaxSize(.98f)
        .padding(all = 20.dp)
        .background(Color(156, 39, 176, 255))
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                // colors = CardDefaults.cardColors(Color.Yellow)
                border = BorderStroke(1.dp, Color.Yellow)
            ){
                Column(modifier = Modifier
                    .width(115.dp)
                    .height(130.dp)
                    .background(
                        color = Color(253, 255, 254, 255), shape = RoundedCornerShape(8.dp)
                    )
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                        horizontalArrangement = Arrangement.End)
                        { Text(text = "#001") }

                    Image( modifier = Modifier.height(50.dp),
                        painter = painterResource(R.drawable.ic_pokebola),
                        colorFilter = ColorFilter.tint(color= Color.Yellow),
                        contentDescription = "Pokemon"
                    )


                    OutlinedButton(
                        onClick = {


                        },

                        modifier = Modifier
                            .width(115.dp)
                            .height(30.dp),


                        shape = RoundedCornerShape( bottomStart = 8.dp, bottomEnd = 8.dp),
                        colors = buttonColors(containerColor = Color.Yellow ),
                        border = BorderStroke(1.dp, Color.Yellow)
                    )
                    {
                        Text(
                            text = "alternative",

                            modifier = Modifier
                                .fillMaxWidth(),
                            color = Color.White
                        )

                    }
                }
            }

            Spacer(modifier= modifier.width(9.dp))


            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                // colors = CardDefaults.cardColors(Color.Yellow)

            ){
                Column(modifier = Modifier
                    .width(115.dp)
                    .height(130.dp)
                    .background(
                        color = Color(111, 215, 163), shape = RoundedCornerShape(8.dp)
                    )
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp)),
                    // verticalAlignment = Alignment.CenterVertically
                ){

                }
            }

            Spacer(modifier= modifier.width(9.dp))


            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                // colors = CardDefaults.cardColors(Color.Yellow)

            ){
                Column(modifier = Modifier
                    .width(115.dp)
                    .height(130.dp)
                    .background(
                        color = Color(111, 215, 163), shape = RoundedCornerShape(8.dp)
                    )
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp)),
                    // verticalAlignment = Alignment.CenterVertically
                ){

                }
            }



        }

        Spacer(modifier= modifier.height(9.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                // colors = CardDefaults.cardColors(Color.Yellow)

            ){
                Column(modifier = Modifier
                    .width(115.dp)
                    .height(130.dp)
                    .background(
                        color = Color(111, 215, 163), shape = RoundedCornerShape(8.dp)
                    )
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp)),
                    // verticalAlignment = Alignment.CenterVertically
                ){

                }
            }

            Spacer(modifier= modifier.width(9.dp))


            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                // colors = CardDefaults.cardColors(Color.Yellow)

            ){
                Column(modifier = Modifier
                    .width(115.dp)
                    .height(130.dp)
                    .background(
                        color = Color(255, 235, 59, 255), shape = RoundedCornerShape(8.dp)
                    )
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp)),
                    // verticalAlignment = Alignment.CenterVertically
                ){

                }
            }

            Spacer(modifier= modifier.width(9.dp))


            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                // colors = CardDefaults.cardColors(Color.Yellow)

            ){
                Column(modifier = Modifier
                    .width(115.dp)
                    .height(130.dp)
                    .background(
                        color = Color(111, 215, 163), shape = RoundedCornerShape(8.dp)
                    )
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp)),
                    // verticalAlignment = Alignment.CenterVertically
                ){

                }
            }
        }


    }

}
