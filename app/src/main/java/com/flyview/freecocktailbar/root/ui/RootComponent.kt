package com.flyview.freecocktailbar.root.ui

import com.arkivanov.decompose.router.stack.ChildStack
import com.flyview.freecocktailbar.feature_recipe.details.RecipeDetailsComponent
import com.flyview.freecocktailbar.feature_recipe.list.RecipeListComponent
import kotlinx.coroutines.flow.StateFlow

interface RootComponent {

    val childStack: StateFlow<ChildStack<*, Child>>

    sealed interface Child {

        class List(val component: RecipeListComponent) : Child
        class Details(val component: RecipeDetailsComponent) : Child
    }
}