package com.example.cyanandroidsample.main.ui

import androidx.lifecycle.ViewModel
import com.example.cyanandroidsample.main.model.MainSideEffect
import com.example.cyanandroidsample.main.model.MainState
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
): ContainerHost<MainState, MainSideEffect>,ViewModel() {
    override val container: Container<MainState, MainSideEffect> = container(MainState())

}