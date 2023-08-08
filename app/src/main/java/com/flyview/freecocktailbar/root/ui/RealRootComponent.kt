package com.flyview.freecocktailbar.root.ui

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.essenty.parcelable.Parcelable
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.core.toStateFlow
import com.flyview.freecocktailbar.feature_recipe.createRecipeFeatureDetailsComponent
import com.flyview.freecocktailbar.feature_recipe.createRecipeFeatureListComponent
import kotlinx.coroutines.flow.StateFlow
import kotlinx.parcelize.Parcelize

class RealRootComponent(
    componentContext: ComponentContext,
    private val componentFactory: ComponentFactory
) : ComponentContext by componentContext, RootComponent {

    private val navigation = StackNavigation<ChildConfig>()

    override val childStack: StateFlow<ChildStack<*, RootComponent.Child>> = childStack(
        source = navigation,
        initialConfiguration = ChildConfig.List,
        handleBackButton = true,
        childFactory = ::createChild
    ).toStateFlow(lifecycle)

    private fun createChild(
        config: ChildConfig,
        componentContext: ComponentContext
    ): RootComponent.Child = when (config) {

        ChildConfig.Details -> RootComponent.Child.Details(
            componentFactory.createRecipeFeatureDetailsComponent(componentContext = componentContext)
        )

        ChildConfig.List -> RootComponent.Child.List(
            componentFactory.createRecipeFeatureListComponent(componentContext = componentContext)
        )
    }

    private sealed interface ChildConfig : Parcelable {

        @Parcelize
        object Details : ChildConfig

        @Parcelize
        object List : ChildConfig
    }
}