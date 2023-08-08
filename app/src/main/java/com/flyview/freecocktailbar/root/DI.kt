package com.flyview.freecocktailbar.root

import com.arkivanov.decompose.ComponentContext
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.root.ui.RealRootComponent
import com.flyview.freecocktailbar.root.ui.RootComponent
import org.koin.core.component.get

fun ComponentFactory.createRootComponent(componentContext: ComponentContext): RootComponent {
    return RealRootComponent(
        componentContext = componentContext,
        componentFactory = get()
    )
}