package com.example.quotes_app_jetpack_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.quotes_app_jetpack_compose.R
import com.example.quotes_app_jetpack_compose.models.Quote

@Composable
fun QuoteListScreen(data :Array<Quote> , onClick : ()->Unit){
    Column() {
            Text(text = "Quote App",
                modifier = Modifier
                    .padding(8.dp ,24.dp)
                    .fillMaxWidth(1f),
                    style = MaterialTheme.typography.bodySmall,
                        fontFamily = FontFamily(Font(R.font.montserratvariablefontwght))



        )
        QuoteList(data =data ) {

        }
    }
}