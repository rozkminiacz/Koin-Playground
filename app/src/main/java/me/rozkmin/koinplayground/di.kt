package me.rozkmin.koinplayground

import org.koin.dsl.module.module

/**
 * Created by jaroslawmichalik on 21/02/2019
 */
val mainModule = module{
    factory {
        MainViewModel(get())
    }
}