import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * Created by jaroslawmichalik on 20/02/2019
 */
fun DependencyHandler.`implementationAll`(dependencyList: List<Any>): List<Dependency?> =
    dependencyList.map { add("implementation", it) }

fun DependencyHandler.`testImplementationAll`(dependencyList: List<Any>): List<Dependency?> =
    dependencyList.map { add("testImplementation", it) }