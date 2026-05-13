package com.kognitivist.data.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.UnselectedCollection: ImageVector
    get() {
        if (_UnselectedCollection != null) {
            return _UnselectedCollection!!
        }
        _UnselectedCollection = ImageVector.Builder(
            name = "UnselectedCollection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF725D78))) {
                moveTo(9.5f, 22f)
                curveTo(8.25f, 22f, 7.188f, 21.563f, 6.313f, 20.688f)
                curveTo(5.438f, 19.813f, 5f, 18.75f, 5f, 17.5f)
                curveTo(5f, 16.917f, 5.142f, 16.379f, 5.425f, 15.887f)
                curveTo(5.708f, 15.396f, 6.233f, 14.767f, 7f, 14f)
                curveTo(7.1f, 13.9f, 7.196f, 13.796f, 7.287f, 13.688f)
                curveTo(7.379f, 13.579f, 7.5f, 13.433f, 7.65f, 13.25f)
                curveTo(6.8f, 11.95f, 6.146f, 10.587f, 5.688f, 9.163f)
                curveTo(5.229f, 7.738f, 5f, 6.35f, 5f, 5f)
                curveTo(5f, 4.033f, 5.175f, 3.292f, 5.525f, 2.775f)
                curveTo(5.875f, 2.258f, 6.367f, 2f, 7f, 2f)
                curveTo(7.95f, 2f, 8.8f, 2.458f, 9.55f, 3.375f)
                curveTo(10.3f, 4.292f, 10.867f, 5.133f, 11.25f, 5.9f)
                curveTo(11.4f, 6.233f, 11.538f, 6.571f, 11.663f, 6.912f)
                curveTo(11.788f, 7.254f, 11.9f, 7.608f, 12f, 7.975f)
                curveTo(12.1f, 7.608f, 12.212f, 7.254f, 12.337f, 6.912f)
                curveTo(12.462f, 6.571f, 12.608f, 6.233f, 12.775f, 5.9f)
                curveTo(13.142f, 5.133f, 13.7f, 4.292f, 14.45f, 3.375f)
                curveTo(15.2f, 2.458f, 16.05f, 2f, 17f, 2f)
                curveTo(17.633f, 2f, 18.125f, 2.258f, 18.475f, 2.775f)
                curveTo(18.825f, 3.292f, 19f, 4.033f, 19f, 5f)
                curveTo(19f, 6.35f, 18.771f, 7.738f, 18.313f, 9.163f)
                curveTo(17.854f, 10.587f, 17.2f, 11.95f, 16.35f, 13.25f)
                curveTo(16.5f, 13.433f, 16.621f, 13.579f, 16.712f, 13.688f)
                curveTo(16.804f, 13.796f, 16.9f, 13.9f, 17f, 14f)
                curveTo(17.767f, 14.767f, 18.292f, 15.396f, 18.575f, 15.887f)
                curveTo(18.858f, 16.379f, 19f, 16.917f, 19f, 17.5f)
                curveTo(19f, 18.75f, 18.563f, 19.813f, 17.688f, 20.688f)
                curveTo(16.813f, 21.563f, 15.75f, 22f, 14.5f, 22f)
                curveTo(13.75f, 22f, 13.146f, 21.917f, 12.688f, 21.75f)
                lineTo(12f, 21.5f)
                lineTo(11.313f, 21.75f)
                curveTo(10.854f, 21.917f, 10.25f, 22f, 9.5f, 22f)
                close()
                moveTo(9.5f, 20f)
                curveTo(9.883f, 20f, 10.267f, 19.954f, 10.65f, 19.862f)
                curveTo(11.033f, 19.771f, 11.392f, 19.633f, 11.725f, 19.45f)
                curveTo(11.542f, 19.367f, 11.375f, 19.225f, 11.225f, 19.025f)
                curveTo(11.075f, 18.825f, 11f, 18.65f, 11f, 18.5f)
                curveTo(11f, 18.367f, 11.096f, 18.25f, 11.288f, 18.15f)
                curveTo(11.479f, 18.05f, 11.717f, 18f, 12f, 18f)
                curveTo(12.283f, 18f, 12.521f, 18.05f, 12.712f, 18.15f)
                curveTo(12.904f, 18.25f, 13f, 18.367f, 13f, 18.5f)
                curveTo(13f, 18.65f, 12.925f, 18.825f, 12.775f, 19.025f)
                curveTo(12.625f, 19.225f, 12.458f, 19.367f, 12.275f, 19.45f)
                curveTo(12.608f, 19.633f, 12.967f, 19.771f, 13.35f, 19.862f)
                curveTo(13.733f, 19.954f, 14.117f, 20f, 14.5f, 20f)
                curveTo(15.2f, 20f, 15.792f, 19.758f, 16.275f, 19.275f)
                curveTo(16.758f, 18.792f, 17f, 18.2f, 17f, 17.5f)
                curveTo(17f, 17.2f, 16.917f, 16.908f, 16.75f, 16.625f)
                curveTo(16.583f, 16.342f, 16.333f, 16.058f, 16f, 15.775f)
                curveTo(15.767f, 15.575f, 15.575f, 15.4f, 15.425f, 15.25f)
                curveTo(15.275f, 15.1f, 15.033f, 14.817f, 14.7f, 14.4f)
                curveTo(14.217f, 13.817f, 13.817f, 13.438f, 13.5f, 13.262f)
                curveTo(13.183f, 13.087f, 12.683f, 13f, 12f, 13f)
                curveTo(11.317f, 13f, 10.813f, 13.087f, 10.488f, 13.262f)
                curveTo(10.163f, 13.438f, 9.767f, 13.817f, 9.3f, 14.4f)
                curveTo(8.967f, 14.817f, 8.725f, 15.1f, 8.575f, 15.25f)
                curveTo(8.425f, 15.4f, 8.233f, 15.575f, 8f, 15.775f)
                curveTo(7.667f, 16.058f, 7.417f, 16.342f, 7.25f, 16.625f)
                curveTo(7.083f, 16.908f, 7f, 17.2f, 7f, 17.5f)
                curveTo(7f, 18.2f, 7.242f, 18.792f, 7.725f, 19.275f)
                curveTo(8.208f, 19.758f, 8.8f, 20f, 9.5f, 20f)
                close()
                moveTo(10.5f, 16.75f)
                curveTo(10.367f, 16.75f, 10.25f, 16.675f, 10.15f, 16.525f)
                curveTo(10.05f, 16.375f, 10f, 16.2f, 10f, 16f)
                curveTo(10f, 15.8f, 10.05f, 15.625f, 10.15f, 15.475f)
                curveTo(10.25f, 15.325f, 10.367f, 15.25f, 10.5f, 15.25f)
                curveTo(10.633f, 15.25f, 10.75f, 15.325f, 10.85f, 15.475f)
                curveTo(10.95f, 15.625f, 11f, 15.8f, 11f, 16f)
                curveTo(11f, 16.2f, 10.95f, 16.375f, 10.85f, 16.525f)
                curveTo(10.75f, 16.675f, 10.633f, 16.75f, 10.5f, 16.75f)
                close()
                moveTo(13.5f, 16.75f)
                curveTo(13.367f, 16.75f, 13.25f, 16.675f, 13.15f, 16.525f)
                curveTo(13.05f, 16.375f, 13f, 16.2f, 13f, 16f)
                curveTo(13f, 15.8f, 13.05f, 15.625f, 13.15f, 15.475f)
                curveTo(13.25f, 15.325f, 13.367f, 15.25f, 13.5f, 15.25f)
                curveTo(13.633f, 15.25f, 13.75f, 15.325f, 13.85f, 15.475f)
                curveTo(13.95f, 15.625f, 14f, 15.8f, 14f, 16f)
                curveTo(14f, 16.2f, 13.95f, 16.375f, 13.85f, 16.525f)
                curveTo(13.75f, 16.675f, 13.633f, 16.75f, 13.5f, 16.75f)
                close()
                moveTo(9.075f, 11.775f)
                curveTo(9.258f, 11.642f, 9.467f, 11.525f, 9.7f, 11.425f)
                curveTo(9.933f, 11.325f, 10.192f, 11.233f, 10.475f, 11.15f)
                curveTo(10.442f, 10.35f, 10.321f, 9.554f, 10.113f, 8.762f)
                curveTo(9.904f, 7.971f, 9.642f, 7.25f, 9.325f, 6.6f)
                curveTo(9.008f, 5.933f, 8.658f, 5.371f, 8.275f, 4.912f)
                curveTo(7.892f, 4.454f, 7.508f, 4.158f, 7.125f, 4.025f)
                curveTo(7.092f, 4.125f, 7.063f, 4.254f, 7.037f, 4.412f)
                curveTo(7.012f, 4.571f, 7f, 4.767f, 7f, 5f)
                curveTo(7f, 6.133f, 7.179f, 7.283f, 7.537f, 8.45f)
                curveTo(7.896f, 9.617f, 8.408f, 10.725f, 9.075f, 11.775f)
                close()
                moveTo(14.925f, 11.775f)
                curveTo(15.592f, 10.725f, 16.104f, 9.617f, 16.462f, 8.45f)
                curveTo(16.821f, 7.283f, 17f, 6.133f, 17f, 5f)
                curveTo(17f, 4.767f, 16.987f, 4.571f, 16.962f, 4.412f)
                curveTo(16.938f, 4.254f, 16.908f, 4.125f, 16.875f, 4.025f)
                curveTo(16.492f, 4.158f, 16.108f, 4.454f, 15.725f, 4.912f)
                curveTo(15.342f, 5.371f, 14.992f, 5.933f, 14.675f, 6.6f)
                curveTo(14.375f, 7.25f, 14.121f, 7.971f, 13.913f, 8.762f)
                curveTo(13.704f, 9.554f, 13.575f, 10.35f, 13.525f, 11.15f)
                curveTo(13.775f, 11.217f, 14.017f, 11.304f, 14.25f, 11.413f)
                curveTo(14.483f, 11.521f, 14.708f, 11.642f, 14.925f, 11.775f)
                close()
            }
        }.build()

        return _UnselectedCollection!!
    }

@Suppress("ObjectPropertyName")
private var _UnselectedCollection: ImageVector? = null
