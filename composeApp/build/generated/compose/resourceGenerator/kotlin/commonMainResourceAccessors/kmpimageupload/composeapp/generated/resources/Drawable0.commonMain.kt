@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package kmpimageupload.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainDrawable0 {
  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }

  public val ic_camera: DrawableResource by 
      lazy { init_ic_camera() }

  public val ic_delete: DrawableResource by 
      lazy { init_ic_delete() }

  public val ic_error_dialog: DrawableResource by 
      lazy { init_ic_error_dialog() }

  public val ic_images: DrawableResource by 
      lazy { init_ic_images() }

  public val ic_person_circle: DrawableResource by 
      lazy { init_ic_person_circle() }

  public val upload_image: DrawableResource by 
      lazy { init_upload_image() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", CommonMainDrawable0.compose_multiplatform)
  map.put("ic_camera", CommonMainDrawable0.ic_camera)
  map.put("ic_delete", CommonMainDrawable0.ic_delete)
  map.put("ic_error_dialog", CommonMainDrawable0.ic_error_dialog)
  map.put("ic_images", CommonMainDrawable0.ic_images)
  map.put("ic_person_circle", CommonMainDrawable0.ic_person_circle)
  map.put("upload_image", CommonMainDrawable0.upload_image)
}

internal val Res.drawable.compose_multiplatform: DrawableResource
  get() = CommonMainDrawable0.compose_multiplatform

private fun init_compose_multiplatform(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:compose_multiplatform",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/compose-multiplatform.xml", -1, -1),
    )
)

internal val Res.drawable.ic_camera: DrawableResource
  get() = CommonMainDrawable0.ic_camera

private fun init_ic_camera(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_camera",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/ic_camera.xml", -1, -1),
    )
)

internal val Res.drawable.ic_delete: DrawableResource
  get() = CommonMainDrawable0.ic_delete

private fun init_ic_delete(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_delete",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/ic_delete.xml", -1, -1),
    )
)

internal val Res.drawable.ic_error_dialog: DrawableResource
  get() = CommonMainDrawable0.ic_error_dialog

private fun init_ic_error_dialog(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_error_dialog",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/ic_error_dialog.xml", -1, -1),
    )
)

internal val Res.drawable.ic_images: DrawableResource
  get() = CommonMainDrawable0.ic_images

private fun init_ic_images(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_images",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/ic_images.xml", -1, -1),
    )
)

internal val Res.drawable.ic_person_circle: DrawableResource
  get() = CommonMainDrawable0.ic_person_circle

private fun init_ic_person_circle(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_person_circle",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/ic_person_circle.xml", -1, -1),
    )
)

internal val Res.drawable.upload_image: DrawableResource
  get() = CommonMainDrawable0.upload_image

private fun init_upload_image(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:upload_image",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmpimageupload.composeapp.generated.resources/drawable/upload_image.png", -1, -1),
    )
)
