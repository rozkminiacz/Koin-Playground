import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.create

/**
 * Created by jaroslawmichalik on 2018-12-23
 */
class PublishPlugin : Plugin<Project> {

  override fun apply(target: Project) {
    target.tasks.create("fabricPublish", Task::class)
  }

  open class Task : DefaultTask() {
    @TaskAction
    fun run() {
      
    }
  }
}