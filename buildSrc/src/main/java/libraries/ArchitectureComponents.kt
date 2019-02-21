package libraries

/**
 * Created by jaroslawmichalik on 2018-12-24
 */
object ArchitectureComponents : DependencyContainer {

    const val androidxVersion = "2.0.0-rc01"
    const val materialVersion = "1.0.0-rc01"
    const val appCompatLegacyVersion = "1.0.0"

    val browserVersion = "1.0.0-beta01"

    val workManager = "android.arch.work:work-runtime:1.0.0-beta01"
    val design = "com.google.android.material:material:$materialVersion"
    val recyclerView = "androidx.recyclerview:recyclerview:${appCompatLegacyVersion}"
    val appCompat = "androidx.appcompat:appcompat:$appCompatLegacyVersion"
    val support = "androidx.legacy:legacy-support-v4:$androidxVersion"
    val constraint = "androidx.constraintlayout:constraintlayout:1.1.2"
    val browser = "androidx.browser:browser:$browserVersion"

    override val all: List<String> = listOf(
        design,
        appCompat,
        constraint
    )

    override val kapt: String = "com.android.databinding:compiler:3.2.1"

}
