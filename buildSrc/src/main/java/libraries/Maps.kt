package libraries

/**
 * Created by jaroslawmichalik on 2018-12-24
 */
object Maps: DependencyContainer {

  val directionsSdk = "me.rozkmin.directions:core:1.0"

  override val all: List<String> = listOf(
      directionsSdk
  )
}