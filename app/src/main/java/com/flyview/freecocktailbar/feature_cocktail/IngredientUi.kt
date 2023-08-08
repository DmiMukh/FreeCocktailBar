package com.flyview.freecocktailbar.feature_cocktail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.flyview.freecocktailbar.ui.theme.FreeCocktailBarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IngredientUi() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 24.dp)
    ) {
        Text(
            text = "Add ingredient",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            label = { Text("Ingredient") },
            supportingText = { Text("Add title") },
            shape = RoundedCornerShape(32.dp),
            isError = false
        )

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Text(
                text = "Add",
                fontSize = 24.sp
            )
        }

        OutlinedButton(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Text(
                text = "Cancel",
                fontSize = 24.sp
            )
        }
    }
}

@Composable
fun IngredientUiPreview(darkTheme: Boolean) {
    FreeCocktailBarTheme(darkTheme = darkTheme) {
        Surface {
            IngredientUi()
        }
    }
}

@Preview(name = "light")
@Composable
fun IngredientUiPreviewLight() {
    IngredientUiPreview(darkTheme = false)
}

@Preview(name = "dark")
@Composable
fun IngredientUiPreviewDark() {
    IngredientUiPreview(darkTheme = true)
}