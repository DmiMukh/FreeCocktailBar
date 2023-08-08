package com.flyview.freecocktailbar.feature_cocktail.edit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.flyview.freecocktailbar.R
import com.flyview.freecocktailbar.ui.theme.FreeCocktailBarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CocktailEditUi(component: CocktailEditComponent) {

    val name = component.name.collectAsState()
    val description = component.description.collectAsState()
    val recipe = component.recipe.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues)
        ) {

            Box(
                modifier = Modifier
                    .padding(top = 64.dp)
                    .width(216.dp)
                    .height(204.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(shape = RoundedCornerShape(size = 54.dp))
                    .background(color = Color(238, 238, 238))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_photo_camera),
                    contentDescription = "cocktail",
                    modifier = Modifier
                        .size(32.dp)
                        .align(Alignment.Center)
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = name.value,
                    onValueChange = component::onNameChange,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    label = { Text("Title") },
                    supportingText = { Text("Add title") },
                    shape = RoundedCornerShape(32.dp),
                    isError = name.value.isEmpty()
                )

                OutlinedTextField(
                    value = description.value,
                    onValueChange = component::onDescriptionChange,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 100.dp)
                        .padding(12.dp),
                    label = { Text("Description") },
                    supportingText = { Text("Optional field") },
                    shape = RoundedCornerShape(32.dp)
                )

                OutlinedTextField(
                    value = recipe.value,
                    onValueChange = component::onRecipeChange,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    label = { Text("Recipe") },
                    supportingText = { Text("Optional field") },
                    shape = RoundedCornerShape(32.dp)
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = component::onSaveClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    Text(
                        text = "Save",
                        fontSize = 32.sp
                    )
                }

                OutlinedButton(
                    onClick = component::onCancelClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    Text(
                        text = "Cancel",
                        fontSize = 32.sp
                    )
                }
            }
        }
    }
}

@Composable
fun RecipeEditUiPreview(darkTheme: Boolean) {
    FreeCocktailBarTheme(darkTheme = darkTheme) {
        CocktailEditUi(component = FakeCocktailEditComponent())
    }
}

@Preview(name = "light")
@Composable
fun RecipeEditUiPreviewLight() {
    RecipeEditUiPreview(darkTheme = false)
}

@Preview(name = "dark")
@Composable
fun RecipeEditUiPreviewDark() {
    RecipeEditUiPreview(darkTheme = true)
}