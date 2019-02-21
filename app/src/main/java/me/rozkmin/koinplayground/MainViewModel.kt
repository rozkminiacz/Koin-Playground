package me.rozkmin.koinplayground

import androidx.lifecycle.ViewModel

/**
 * Created by jaroslawmichalik on 20/02/2019
 */
class MainViewModel(
    config: Config
) : ViewModel() {
    val isDemo = config.demoVersion
}