package com.example.quotes_app_jetpack_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotes_app_jetpack_compose.R
import com.example.quotes_app_jetpack_compose.models.Quote

@Composable
fun QuoteListScreen(data :Array<Quote> , onClick : (quote :Quote)->Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Text(
            text = "Quote App",
            modifier = Modifier
                .align(Alignment.CenterHorizontally) // Center the text horizontally
                .padding(top = 24.dp),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            fontFamily = FontFamily(Font(R.font.montserratvariablefontwght))
        )
        Spacer(modifier = Modifier.padding(8.dp))
        QuoteList(data =data  ,onClick)
    }
}