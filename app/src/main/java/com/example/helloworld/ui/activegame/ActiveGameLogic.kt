package com.example.helloworld.ui.activegame

import com.example.helloworld.common.BaseLogic
import com.example.helloworld.common.DispatcherProvider
import com.example.helloworld.domain.IGameRepository
import com.example.helloworld.domain.IStatisticsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class ActiveGameLogic(
    private val container: ActiveGameContainer?,
    private val viewModel: ActiveGameViewModel,
    private val gameRepo: IGameRepository,
    private val statsRepo: IStatisticsRepository,
    private val dispatcher: DispatcherProvider,
) : BaseLogic<ActiveGameEvent>(), CoroutineScope{
    override val coroutineContext: CoroutineContext
        get() = dispatcher.provideUIContext() + jobTracker

    init {
        jobTracker = Job()
    }

    inline fun startCoroutineTimer(
        crossinline action: () -> Unit
    ) = launch {
        while( true){
            action()
            delay(1000 )
        }
    }

    override fun onEvent(event: ActiveGameEvent) {
        TODO("Not yet implemented")
    }
}