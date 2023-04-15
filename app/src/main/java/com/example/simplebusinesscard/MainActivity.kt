package com.example.simplebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplebusinesscard.ui.theme.SimpleBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Card()
                }
            }
        }
    }
}


@Composable
fun MainSection(){
    Box() {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            val androidLogo = painterResource(id = R.drawable.android_logo)
            Image(painter = androidLogo, contentDescription = null, modifier = Modifier.width(150.dp))
            Text(text = "Jennifer Doe", fontSize = 36.sp, color= Color.White, modifier = Modifier.padding(vertical = 8.dp))
            Text(text = "Android Developer Extraordinaire", fontWeight = FontWeight.Bold, color = Color(0xFF3ddc84))
        }
    }
}

@Composable
fun DetailsSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 50.dp)){
        Column( modifier = Modifier.fillMaxWidth()) {
            Divider(color= Color.White, modifier = Modifier.height(1.dp).alpha(0.5F))
            Row(modifier = Modifier.padding(vertical = 8.dp, horizontal = 30.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Icon(Icons.Default.Phone, contentDescription = null, tint = Color(0xFF3ddc84) )
                Text(text = "+977 9865113117", color = Color.White)
            }
            Divider(color= Color.White, modifier = Modifier.height(1.dp).alpha(0.5F))
            Row(modifier = Modifier.padding(vertical = 8.dp, horizontal = 30.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Icon(Icons.Default.Share, contentDescription = null, tint = Color(0xFF3ddc84) )
                Text(text = "@abhishekram404", color = Color.White)
            }
            Divider(color= Color.White, modifier = Modifier.height(1.dp).alpha(0.5F))
            Row(modifier = Modifier.padding(vertical = 8.dp, horizontal = 30.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Icon(Icons.Default.Email, contentDescription = null, tint = Color(0xFF3ddc84) )
                Text(text = "reach@keshavram.com.np", color = Color.White)
            }
        }
    }
}

@Composable
fun Card() {
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxHeight()
        .background(color = Color.DarkGray), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        MainSection()
        Spacer(modifier = Modifier.weight(1f))
        DetailsSection()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    SimpleBusinessCardTheme {
        Card()
    }
}