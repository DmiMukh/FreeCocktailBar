package com.flyview.freecocktailbar.feature_cocktail.edit

import kotlinx.coroutines.flow.StateFlow

interface CocktailEditComponent {

    val name: StateFlow<String>
    val description: StateFlow<String>
    val recipe: StateFlow<String>

    fun onSaveClick()
    fun onCancelClick()
}