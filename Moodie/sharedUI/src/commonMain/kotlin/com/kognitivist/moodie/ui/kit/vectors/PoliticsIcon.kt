package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.PoliticsIcon: ImageVector
    get() {
        if (_PoliticsIcon != null) {
            return _PoliticsIcon!!
        }
        _PoliticsIcon = ImageVector.Builder(
            name = "PoliticsIcon",
            defaultWidth = 48.dp,
            defaultHeight = 48.dp,
            viewportWidth = 48f,
            viewportHeight = 48f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(24f, 4f)
                    lineTo(24f, 4f)
                    arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 24f)
                    lineTo(44f, 24f)
                    arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 44f)
                    lineTo(24f, 44f)
                    arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 24f)
                    lineTo(4f, 24f)
                    arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF725D78))) {
                    moveTo(24f, 31.9f)
                    curveTo(25.617f, 31.4f, 26.967f, 30.413f, 28.05f, 28.938f)
                    curveTo(29.133f, 27.462f, 29.767f, 25.817f, 29.95f, 24f)
                    horizontalLineTo(24f)
                    verticalLineTo(16.125f)
                    lineTo(18f, 18.375f)
                    verticalLineTo(23.55f)
                    curveTo(18f, 23.667f, 18.017f, 23.817f, 18.05f, 24f)
                    horizontalLineTo(24f)
                    verticalLineTo(31.9f)
                    close()
                    moveTo(23.675f, 33.875f)
                    curveTo(23.575f, 33.858f, 23.475f, 33.833f, 23.375f, 33.8f)
                    curveTo(21.125f, 33.05f, 19.333f, 31.663f, 18f, 29.638f)
                    curveTo(16.667f, 27.612f, 16f, 25.433f, 16f, 23.1f)
                    verticalLineTo(18.375f)
                    curveTo(16f, 17.958f, 16.121f, 17.583f, 16.362f, 17.25f)
                    curveTo(16.604f, 16.917f, 16.917f, 16.675f, 17.3f, 16.525f)
                    lineTo(23.3f, 14.275f)
                    curveTo(23.533f, 14.192f, 23.767f, 14.15f, 24f, 14.15f)
                    curveTo(24.233f, 14.15f, 24.467f, 14.192f, 24.7f, 14.275f)
                    lineTo(30.7f, 16.525f)
                    curveTo(31.083f, 16.675f, 31.396f, 16.917f, 31.638f, 17.25f)
                    curveTo(31.879f, 17.583f, 32f, 17.958f, 32f, 18.375f)
                    verticalLineTo(23.1f)
                    curveTo(32f, 25.433f, 31.333f, 27.612f, 30f, 29.638f)
                    curveTo(28.667f, 31.663f, 26.875f, 33.05f, 24.625f, 33.8f)
                    curveTo(24.525f, 33.833f, 24.425f, 33.858f, 24.325f, 33.875f)
                    curveTo(24.225f, 33.892f, 24.117f, 33.9f, 24f, 33.9f)
                    curveTo(23.883f, 33.9f, 23.775f, 33.892f, 23.675f, 33.875f)
                    close()
                }
            }
        }.build()

        return _PoliticsIcon!!
    }

@Suppress("ObjectPropertyName")
private var _PoliticsIcon: ImageVector? = null
