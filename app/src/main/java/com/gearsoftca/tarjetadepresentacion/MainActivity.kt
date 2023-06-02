package com.gearsoftca.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gearsoftca.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardPresentation()
                }
            }
        }
    }
}

@Preview
@Composable
private fun CardPresentation() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(R.color.blue_background)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(2f, true)
        ) {
            Image(
                painter = painterResource(R.drawable.gearsoftlogo),
                contentDescription = stringResource(
                    R.string.logo_from_geatsoft

                ),
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = stringResource(R.string.title_name),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = stringResource(R.string.sub_title),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f, true)
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(start = 100.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_phone),
                    contentDescription = stringResource(R.string.phone),
                    tint = Color.White
                )
                Text(
                    text = stringResource(R.string.phone_number),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(start = 100.dp, top = 16.dp, end = 16.dp, bottom = 16.dp),
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_share),
                    contentDescription = stringResource(R.string.red_social),
                    tint = Color.White
                )
                Text(
                    text = stringResource(R.string.gearsoftca_social),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(start = 100.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_email),
                    contentDescription = stringResource(R.string.email_ic),
                    tint = Color.White
                )
                Text(
                    text = "javieralburges@gmail.com",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }

        }
    }
}