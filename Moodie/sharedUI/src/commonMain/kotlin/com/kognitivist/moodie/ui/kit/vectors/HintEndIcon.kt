package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.HintEndIcon: ImageVector
    get() {
        if (_HintEndIcon != null) {
            return _HintEndIcon!!
        }
        _HintEndIcon = ImageVector.Builder(
            name = "HintEndIcon",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 30f,
            viewportHeight = 30f
        ).apply {
            path(fill = SolidColor(Color(0xFF725D78))) {
                moveTo(15f, 27.5f)
                curveTo(12.222f, 27.5f, 9.861f, 26.535f, 7.917f, 24.606f)
                curveTo(5.972f, 22.677f, 5f, 20.322f, 5f, 17.542f)
                verticalLineTo(11.188f)
                curveTo(5f, 8.664f, 6f, 6.585f, 8f, 4.951f)
                curveTo(10f, 3.317f, 12.333f, 2.5f, 15f, 2.5f)
                curveTo(17.667f, 2.5f, 20f, 3.317f, 22f, 4.951f)
                curveTo(24f, 6.585f, 25f, 8.664f, 25f, 11.188f)
                verticalLineTo(25.417f)
                curveTo(25f, 25.99f, 24.796f, 26.48f, 24.388f, 26.888f)
                curveTo(23.98f, 27.296f, 23.49f, 27.5f, 22.917f, 27.5f)
                horizontalLineTo(15f)
                close()
                moveTo(15f, 25.417f)
                horizontalLineTo(18.104f)
                curveTo(17.528f, 24.826f, 17.075f, 24.141f, 16.745f, 23.359f)
                curveTo(16.415f, 22.578f, 16.25f, 21.736f, 16.25f, 20.833f)
                verticalLineTo(19.792f)
                curveTo(16.042f, 19.826f, 15.833f, 19.846f, 15.625f, 19.849f)
                curveTo(15.417f, 19.852f, 15.208f, 19.854f, 15f, 19.854f)
                curveTo(13.521f, 19.854f, 12.106f, 19.568f, 10.755f, 18.995f)
                curveTo(9.404f, 18.422f, 8.201f, 17.615f, 7.146f, 16.573f)
                lineTo(7.083f, 17.542f)
                curveTo(7.083f, 19.729f, 7.853f, 21.588f, 9.392f, 23.12f)
                curveTo(10.932f, 24.651f, 12.801f, 25.417f, 15f, 25.417f)
                close()
                moveTo(18.333f, 20.833f)
                curveTo(18.333f, 22.097f, 18.781f, 23.177f, 19.677f, 24.073f)
                curveTo(20.573f, 24.969f, 21.653f, 25.417f, 22.917f, 25.417f)
                lineTo(22.854f, 16.573f)
                curveTo(22.203f, 17.218f, 21.502f, 17.77f, 20.752f, 18.228f)
                curveTo(20f, 18.687f, 19.194f, 19.056f, 18.333f, 19.333f)
                verticalLineTo(20.833f)
                close()
                moveTo(15.001f, 17.771f)
                curveTo(17.091f, 17.771f, 18.932f, 17.165f, 20.526f, 15.953f)
                curveTo(22.12f, 14.741f, 22.917f, 13.153f, 22.917f, 11.188f)
                curveTo(22.917f, 10.389f, 22.774f, 9.651f, 22.49f, 8.974f)
                curveTo(22.205f, 8.297f, 21.806f, 7.688f, 21.292f, 7.146f)
                curveTo(19.847f, 7.174f, 18.611f, 7.699f, 17.583f, 8.722f)
                curveTo(16.556f, 9.745f, 16.042f, 10.991f, 16.042f, 12.458f)
                curveTo(16.042f, 12.753f, 15.941f, 13.001f, 15.741f, 13.201f)
                curveTo(15.541f, 13.4f, 15.292f, 13.5f, 14.996f, 13.5f)
                curveTo(14.7f, 13.5f, 14.453f, 13.4f, 14.255f, 13.201f)
                curveTo(14.057f, 13.001f, 13.958f, 12.753f, 13.958f, 12.458f)
                curveTo(13.958f, 10.972f, 13.441f, 9.722f, 12.406f, 8.708f)
                curveTo(11.372f, 7.694f, 10.132f, 7.177f, 8.688f, 7.156f)
                curveTo(8.176f, 7.698f, 7.781f, 8.308f, 7.502f, 8.986f)
                curveTo(7.223f, 9.663f, 7.083f, 10.397f, 7.083f, 11.188f)
                curveTo(7.083f, 13.153f, 7.881f, 14.741f, 9.475f, 15.953f)
                curveTo(11.07f, 17.165f, 12.912f, 17.771f, 15.001f, 17.771f)
                close()
                moveTo(9.776f, 11.929f)
                curveTo(9.578f, 11.728f, 9.479f, 11.48f, 9.479f, 11.184f)
                curveTo(9.479f, 10.888f, 9.579f, 10.641f, 9.78f, 10.443f)
                curveTo(9.98f, 10.245f, 10.228f, 10.146f, 10.524f, 10.146f)
                curveTo(10.821f, 10.146f, 11.068f, 10.246f, 11.266f, 10.446f)
                curveTo(11.464f, 10.647f, 11.563f, 10.895f, 11.563f, 11.191f)
                curveTo(11.563f, 11.487f, 11.462f, 11.734f, 11.262f, 11.932f)
                curveTo(11.062f, 12.13f, 10.813f, 12.229f, 10.517f, 12.229f)
                curveTo(10.221f, 12.229f, 9.974f, 12.129f, 9.776f, 11.929f)
                close()
                moveTo(18.734f, 11.929f)
                curveTo(18.537f, 11.728f, 18.438f, 11.48f, 18.438f, 11.184f)
                curveTo(18.438f, 10.888f, 18.538f, 10.641f, 18.738f, 10.443f)
                curveTo(18.938f, 10.245f, 19.187f, 10.146f, 19.483f, 10.146f)
                curveTo(19.779f, 10.146f, 20.026f, 10.246f, 20.224f, 10.446f)
                curveTo(20.422f, 10.647f, 20.521f, 10.895f, 20.521f, 11.191f)
                curveTo(20.521f, 11.487f, 20.421f, 11.734f, 20.22f, 11.932f)
                curveTo(20.02f, 12.13f, 19.772f, 12.229f, 19.476f, 12.229f)
                curveTo(19.179f, 12.229f, 18.932f, 12.129f, 18.734f, 11.929f)
                close()
                moveTo(10.875f, 5.542f)
                curveTo(11.75f, 5.833f, 12.542f, 6.26f, 13.25f, 6.823f)
                curveTo(13.958f, 7.385f, 14.542f, 8.038f, 15f, 8.781f)
                curveTo(15.458f, 8.024f, 16.037f, 7.368f, 16.734f, 6.813f)
                curveTo(17.432f, 6.257f, 18.219f, 5.833f, 19.094f, 5.542f)
                curveTo(18.476f, 5.229f, 17.821f, 4.991f, 17.13f, 4.828f)
                curveTo(16.439f, 4.665f, 15.729f, 4.583f, 15f, 4.583f)
                curveTo(14.271f, 4.583f, 13.557f, 4.665f, 12.859f, 4.828f)
                curveTo(12.161f, 4.991f, 11.5f, 5.229f, 10.875f, 5.542f)
                close()
                moveTo(15f, 25.417f)
                curveTo(12.801f, 25.417f, 10.932f, 24.651f, 9.392f, 23.12f)
                curveTo(7.853f, 21.588f, 7.083f, 19.729f, 7.083f, 17.542f)
                horizontalLineTo(7.146f)
                curveTo(7.118f, 19.736f, 7.872f, 21.597f, 9.407f, 23.125f)
                curveTo(10.942f, 24.653f, 12.807f, 25.417f, 15f, 25.417f)
                close()
                moveTo(18.333f, 20.833f)
                curveTo(18.333f, 22.097f, 18.778f, 23.177f, 19.667f, 24.073f)
                curveTo(20.556f, 24.969f, 21.618f, 25.417f, 22.854f, 25.417f)
                horizontalLineTo(22.917f)
                curveTo(21.653f, 25.417f, 20.573f, 24.969f, 19.677f, 24.073f)
                curveTo(18.781f, 23.177f, 18.333f, 22.097f, 18.333f, 20.833f)
                close()
            }
        }.build()

        return _HintEndIcon!!
    }

@Suppress("ObjectPropertyName")
private var _HintEndIcon: ImageVector? = null
