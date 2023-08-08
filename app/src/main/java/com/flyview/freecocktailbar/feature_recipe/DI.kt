package com.flyview.freecocktailbar.feature_recipe

import com.arkivanov.decompose.ComponentContext
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.feature_recipe.details.RealRecipeDetailsComponent
import com.flyview.freecocktailbar.feature_recipe.details.RecipeDetailsComponent
import com.flyview.freecocktailbar.feature_recipe.list.RealRecipeListComponent
import com.flyview.freecocktailbar.feature_recipe.list.RecipeListComponent

fun ComponentFactory.createRecipeFeatureListComponent(
    componentContext: ComponentContext
): RecipeListComponent {
    return RealRecipeListComponent(componentContext = componentContext)
}

fun ComponentFactory.createRecipeFeatureDetailsComponent(
    componentContext: ComponentContext
): RecipeDetailsComponent {
    return RealRecipeDetailsComponent(componentContext = componentContext)
}