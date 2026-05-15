package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.HintStartIcon: ImageVector
    get() {
        if (_HintStartIcon != null) {
            return _HintStartIcon!!
        }
        _HintStartIcon = ImageVector.Builder(
            name = "HintStartIcon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFB6872A))) {
                moveTo(10.587f, 21.413f)
                curveTo(10.196f, 21.021f, 10f, 20.55f, 10f, 20f)
                horizontalLineTo(14f)
                curveTo(14f, 20.55f, 13.804f, 21.021f, 13.413f, 21.413f)
                curveTo(13.021f, 21.804f, 12.55f, 22f, 12f, 22f)
                curveTo(11.45f, 22f, 10.979f, 21.804f, 10.587f, 21.413f)
                close()
                moveTo(9f, 19f)
                curveTo(8.717f, 19f, 8.479f, 18.904f, 8.288f, 18.712f)
                curveTo(8.096f, 18.521f, 8f, 18.283f, 8f, 18f)
                curveTo(8f, 17.717f, 8.096f, 17.479f, 8.288f, 17.288f)
                curveTo(8.479f, 17.096f, 8.717f, 17f, 9f, 17f)
                horizontalLineTo(15f)
                curveTo(15.283f, 17f, 15.521f, 17.096f, 15.712f, 17.288f)
                curveTo(15.904f, 17.479f, 16f, 17.717f, 16f, 18f)
                curveTo(16f, 18.283f, 15.904f, 18.521f, 15.712f, 18.712f)
                curveTo(15.521f, 18.904f, 15.283f, 19f, 15f, 19f)
                horizontalLineTo(9f)
                close()
                moveTo(8.25f, 16f)
                curveTo(7.1f, 15.317f, 6.188f, 14.4f, 5.512f, 13.25f)
                curveTo(4.838f, 12.1f, 4.5f, 10.85f, 4.5f, 9.5f)
                curveTo(4.5f, 7.417f, 5.229f, 5.646f, 6.688f, 4.188f)
                curveTo(8.146f, 2.729f, 9.917f, 2f, 12f, 2f)
                curveTo(14.083f, 2f, 15.854f, 2.729f, 17.313f, 4.188f)
                curveTo(18.771f, 5.646f, 19.5f, 7.417f, 19.5f, 9.5f)
                curveTo(19.5f, 10.85f, 19.163f, 12.1f, 18.487f, 13.25f)
                curveTo(17.813f, 14.4f, 16.9f, 15.317f, 15.75f, 16f)
                horizontalLineTo(8.25f)
                close()
                moveTo(8.85f, 14f)
                horizontalLineTo(15.15f)
                curveTo(15.9f, 13.467f, 16.479f, 12.808f, 16.888f, 12.025f)
                curveTo(17.296f, 11.242f, 17.5f, 10.4f, 17.5f, 9.5f)
                curveTo(17.5f, 7.967f, 16.967f, 6.667f, 15.9f, 5.6f)
                curveTo(14.833f, 4.533f, 13.533f, 4f, 12f, 4f)
                curveTo(10.467f, 4f, 9.167f, 4.533f, 8.1f, 5.6f)
                curveTo(7.033f, 6.667f, 6.5f, 7.967f, 6.5f, 9.5f)
                curveTo(6.5f, 10.4f, 6.704f, 11.242f, 7.113f, 12.025f)
                curveTo(7.521f, 12.808f, 8.1f, 13.467f, 8.85f, 14f)
                close()
            }
        }.build()

        return _HintStartIcon!!
    }

@Suppress("ObjectPropertyName")
private var _HintStartIcon: ImageVector? = null
