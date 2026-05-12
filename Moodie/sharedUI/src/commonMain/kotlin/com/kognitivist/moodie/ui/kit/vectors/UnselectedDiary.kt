package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.UnselectedDiary: ImageVector
    get() {
        if (_UnselectedDiary != null) {
            return _UnselectedDiary!!
        }
        _UnselectedDiary = ImageVector.Builder(
            name = "UnselectedDiary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF725D78))) {
                moveTo(6.5f, 16f)
                curveTo(7.283f, 16f, 8.046f, 16.087f, 8.788f, 16.263f)
                curveTo(9.529f, 16.438f, 10.267f, 16.7f, 11f, 17.05f)
                verticalLineTo(7.2f)
                curveTo(10.317f, 6.8f, 9.592f, 6.5f, 8.825f, 6.3f)
                curveTo(8.058f, 6.1f, 7.283f, 6f, 6.5f, 6f)
                curveTo(5.9f, 6f, 5.304f, 6.058f, 4.713f, 6.175f)
                curveTo(4.121f, 6.292f, 3.55f, 6.467f, 3f, 6.7f)
                verticalLineTo(16.6f)
                curveTo(3.583f, 16.4f, 4.162f, 16.25f, 4.738f, 16.15f)
                curveTo(5.313f, 16.05f, 5.9f, 16f, 6.5f, 16f)
                close()
                moveTo(13f, 17.05f)
                curveTo(13.733f, 16.7f, 14.471f, 16.438f, 15.212f, 16.263f)
                curveTo(15.954f, 16.087f, 16.717f, 16f, 17.5f, 16f)
                curveTo(18.1f, 16f, 18.688f, 16.05f, 19.263f, 16.15f)
                curveTo(19.837f, 16.25f, 20.417f, 16.4f, 21f, 16.6f)
                verticalLineTo(6.7f)
                curveTo(20.45f, 6.467f, 19.879f, 6.292f, 19.288f, 6.175f)
                curveTo(18.696f, 6.058f, 18.1f, 6f, 17.5f, 6f)
                curveTo(16.717f, 6f, 15.942f, 6.1f, 15.175f, 6.3f)
                curveTo(14.408f, 6.5f, 13.683f, 6.8f, 13f, 7.2f)
                verticalLineTo(17.05f)
                close()
                moveTo(11.337f, 19.388f)
                curveTo(11.129f, 19.329f, 10.933f, 19.25f, 10.75f, 19.15f)
                curveTo(10.1f, 18.767f, 9.417f, 18.479f, 8.7f, 18.288f)
                curveTo(7.983f, 18.096f, 7.25f, 18f, 6.5f, 18f)
                curveTo(5.8f, 18f, 5.113f, 18.092f, 4.438f, 18.275f)
                curveTo(3.763f, 18.458f, 3.117f, 18.717f, 2.5f, 19.05f)
                curveTo(2.15f, 19.233f, 1.813f, 19.225f, 1.487f, 19.025f)
                curveTo(1.163f, 18.825f, 1f, 18.533f, 1f, 18.15f)
                verticalLineTo(6.1f)
                curveTo(1f, 5.917f, 1.046f, 5.742f, 1.138f, 5.575f)
                curveTo(1.229f, 5.408f, 1.367f, 5.283f, 1.55f, 5.2f)
                curveTo(2.317f, 4.8f, 3.117f, 4.5f, 3.95f, 4.3f)
                curveTo(4.783f, 4.1f, 5.633f, 4f, 6.5f, 4f)
                curveTo(7.467f, 4f, 8.413f, 4.125f, 9.337f, 4.375f)
                curveTo(10.262f, 4.625f, 11.15f, 5f, 12f, 5.5f)
                curveTo(12.85f, 5f, 13.738f, 4.625f, 14.663f, 4.375f)
                curveTo(15.587f, 4.125f, 16.533f, 4f, 17.5f, 4f)
                curveTo(18.367f, 4f, 19.217f, 4.1f, 20.05f, 4.3f)
                curveTo(20.883f, 4.5f, 21.683f, 4.8f, 22.45f, 5.2f)
                curveTo(22.633f, 5.283f, 22.771f, 5.408f, 22.862f, 5.575f)
                curveTo(22.954f, 5.742f, 23f, 5.917f, 23f, 6.1f)
                verticalLineTo(18.15f)
                curveTo(23f, 18.533f, 22.837f, 18.825f, 22.513f, 19.025f)
                curveTo(22.188f, 19.225f, 21.85f, 19.233f, 21.5f, 19.05f)
                curveTo(20.883f, 18.717f, 20.237f, 18.458f, 19.563f, 18.275f)
                curveTo(18.888f, 18.092f, 18.2f, 18f, 17.5f, 18f)
                curveTo(16.75f, 18f, 16.017f, 18.096f, 15.3f, 18.288f)
                curveTo(14.583f, 18.479f, 13.9f, 18.767f, 13.25f, 19.15f)
                curveTo(13.067f, 19.25f, 12.871f, 19.329f, 12.663f, 19.388f)
                curveTo(12.454f, 19.446f, 12.233f, 19.475f, 12f, 19.475f)
                curveTo(11.767f, 19.475f, 11.546f, 19.446f, 11.337f, 19.388f)
                close()
            }
        }.build()

        return _UnselectedDiary!!
    }

@Suppress("ObjectPropertyName")
private var _UnselectedDiary: ImageVector? = null
