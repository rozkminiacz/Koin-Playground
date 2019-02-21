package libraries

object PlayServices: DependencyContainer {
  override val all = listOf(
      "com.google.android.gms:play-services-location:16.0.0",
      "com.google.android.gms:play-services-maps:16.0.0"
  )
}