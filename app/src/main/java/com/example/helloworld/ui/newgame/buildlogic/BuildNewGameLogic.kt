package com.example.helloworld.ui.newgame.buildlogic

import android.content.Context
import com.example.helloworld.common.ProductionDispatcherProvider
import com.example.helloworld.persistence.*
import com.example.helloworld.ui.newgame.NewGameContainer
import com.example.helloworld.ui.newgame.NewGameLogic
import com.example.helloworld.ui.newgame.NewGameViewModel

internal fun buildNewGameLogic(
    container: NewGameContainer,
    viewModel: NewGameViewModel,
    context: Context
): NewGameLogic {
    return NewGameLogic(
        container,
        viewModel,
        GameRepositoryImpl(
            LocalGameStorageImpl(context.filesDir.path),
            LocalSettingsStorageImpl(context.settingsDataStore)
        ),
        LocalStatisticsStorageImpl(
            context.statsDataStore
        ),
        ProductionDispatcherProvider
    )
}