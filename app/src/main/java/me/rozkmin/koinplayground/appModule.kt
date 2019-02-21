package me.rozkmin.koinplayground

import org.koin.dsl.module.module

/**
 * Created by jaroslawmichalik on 20/02/2019
 */
val appModule = module {
    single<Config> {
        object : Config {
            override val demoVersion: Boolean
                get() = true
        }
    }
}