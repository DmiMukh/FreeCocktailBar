package com.flyview.freecocktailbar.feature_cocktail.edit

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class FakeCocktailEditComponent : CocktailEditComponent {

    override val name = MutableStateFlow("Cocktail name")
    override val description = MutableStateFlow("To make this homemade")
    override val recipe = MutableStateFlow("Simply combine all the ingredients")

    override fun onSaveClick() = Unit

    override fun onCancelClick() = Unit
}