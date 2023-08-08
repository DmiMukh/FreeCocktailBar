package com.flyview.freecocktailbar.feature_cocktail.edit

import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow

class RealCocktailEditComponent(
    componentContext: ComponentContext
): ComponentContext by componentContext, CocktailEditComponent {

    override val name = MutableStateFlow("")
    override val description = MutableStateFlow("")
    override val recipe = MutableStateFlow("")

    override fun onSaveClick() {
        TODO("Not yet implemented")
    }

    override fun onCancelClick() {
        TODO("Not yet implemented")
    }

    override fun onNameChange(newValue: String) {
        this.name.value = newValue
    }

    override fun onDescriptionChange(newValue: String) {
        this.description.value = newValue
    }

    override fun onRecipeChange(newValue: String) {
        this.recipe.value = newValue
    }
}