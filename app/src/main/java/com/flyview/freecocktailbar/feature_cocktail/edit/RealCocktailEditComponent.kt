package com.flyview.freecocktailbar.feature_cocktail.edit

import kotlinx.coroutines.flow.StateFlow

class RealCocktailEditComponent: CocktailEditComponent {
    override val name: StateFlow<String>
        get() = TODO("Not yet implemented")
    override val description: StateFlow<String>
        get() = TODO("Not yet implemented")
    override val recipe: StateFlow<String>
        get() = TODO("Not yet implemented")

    override fun onSaveClick() {
        TODO("Not yet implemented")
    }

    override fun onCancelClick() {
        TODO("Not yet implemented")
    }
}