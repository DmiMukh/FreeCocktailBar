package com.flyview.freecocktailbar.feature_cocktail.edit

import kotlinx.coroutines.flow.MutableStateFlow

class FakeCocktailEditComponent : CocktailEditComponent {

    override val name = MutableStateFlow("Cocktail name")
    override val description = MutableStateFlow("To make this homemade")
    override val recipe = MutableStateFlow("Simply combine all the ingredients")

    override fun onSaveClick() = Unit

    override fun onCancelClick() = Unit
    override fun onNameChange(newValue: String) = Unit

    override fun onDescriptionChange(newValue: String) = Unit

    override fun onRecipeChange(newValue: String) = Unit
}