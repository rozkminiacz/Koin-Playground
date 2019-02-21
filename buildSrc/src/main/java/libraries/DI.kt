package libraries

/**
 * Created by jaroslawmichalik on 2018-12-24
 */
object DI : DependencyContainer {

    val DaggerVersion = "2.16"


    override val kapt = "com.google.dagger:dagger-compiler:$DaggerVersion"
    private val dagger = "com.google.dagger:dagger:$DaggerVersion"
    val annotations = "org.glassfish:javax.annotation:10.0-b28"

    val koin_version = "1.0.2"

    val koinDependencies = listOf(
        "org.koin:koin-android:$koin_version",
        "org.koin:koin-androidx-scope:$koin_version",
        "org.koin:koin-androidx-viewmodel:$koin_version"
    )

    override val all: List<String> = koinDependencies
}