package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.FunResultIcon: ImageVector
    get() {
        if (_FunResultIcon != null) {
            return _FunResultIcon!!
        }
        _FunResultIcon = ImageVector.Builder(
            name = "FunResultIcon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF725D78))) {
                    moveTo(12f, 17.5f)
                    curveTo(12.967f, 17.5f, 13.858f, 17.267f, 14.675f, 16.8f)
                    curveTo(15.492f, 16.333f, 16.15f, 15.7f, 16.65f, 14.9f)
                    curveTo(16.75f, 14.7f, 16.742f, 14.5f, 16.625f, 14.3f)
                    curveTo(16.508f, 14.1f, 16.333f, 14f, 16.1f, 14f)
                    horizontalLineTo(7.9f)
                    curveTo(7.667f, 14f, 7.492f, 14.1f, 7.375f, 14.3f)
                    curveTo(7.258f, 14.5f, 7.25f, 14.7f, 7.35f, 14.9f)
                    curveTo(7.85f, 15.7f, 8.512f, 16.333f, 9.337f, 16.8f)
                    curveTo(10.163f, 17.267f, 11.05f, 17.5f, 12f, 17.5f)
                    close()
                    moveTo(8.9f, 9.95f)
                    lineTo(9.425f, 10.475f)
                    curveTo(9.575f, 10.625f, 9.75f, 10.7f, 9.95f, 10.7f)
                    curveTo(10.15f, 10.7f, 10.325f, 10.625f, 10.475f, 10.475f)
                    curveTo(10.625f, 10.325f, 10.696f, 10.15f, 10.688f, 9.95f)
                    curveTo(10.679f, 9.75f, 10.608f, 9.575f, 10.475f, 9.425f)
                    lineTo(9.6f, 8.525f)
                    curveTo(9.4f, 8.325f, 9.163f, 8.225f, 8.887f, 8.225f)
                    curveTo(8.613f, 8.225f, 8.375f, 8.325f, 8.175f, 8.525f)
                    lineTo(7.275f, 9.425f)
                    curveTo(7.125f, 9.575f, 7.05f, 9.75f, 7.05f, 9.95f)
                    curveTo(7.05f, 10.15f, 7.125f, 10.325f, 7.275f, 10.475f)
                    curveTo(7.408f, 10.608f, 7.579f, 10.679f, 7.787f, 10.688f)
                    curveTo(7.996f, 10.696f, 8.175f, 10.633f, 8.325f, 10.5f)
                    lineTo(8.9f, 9.95f)
                    close()
                    moveTo(15.1f, 9.95f)
                    lineTo(15.675f, 10.5f)
                    curveTo(15.825f, 10.633f, 16f, 10.7f, 16.2f, 10.7f)
                    curveTo(16.4f, 10.7f, 16.575f, 10.625f, 16.725f, 10.475f)
                    curveTo(16.875f, 10.325f, 16.95f, 10.15f, 16.95f, 9.95f)
                    curveTo(16.95f, 9.75f, 16.875f, 9.575f, 16.725f, 9.425f)
                    lineTo(15.825f, 8.525f)
                    curveTo(15.625f, 8.325f, 15.387f, 8.225f, 15.113f, 8.225f)
                    curveTo(14.837f, 8.225f, 14.6f, 8.325f, 14.4f, 8.525f)
                    lineTo(13.5f, 9.425f)
                    curveTo(13.367f, 9.575f, 13.3f, 9.75f, 13.3f, 9.95f)
                    curveTo(13.3f, 10.15f, 13.375f, 10.325f, 13.525f, 10.475f)
                    curveTo(13.675f, 10.625f, 13.85f, 10.7f, 14.05f, 10.7f)
                    curveTo(14.25f, 10.7f, 14.425f, 10.625f, 14.575f, 10.475f)
                    lineTo(15.1f, 9.95f)
                    close()
                    moveTo(8.1f, 21.212f)
                    curveTo(6.883f, 20.688f, 5.825f, 19.975f, 4.925f, 19.075f)
                    curveTo(4.025f, 18.175f, 3.313f, 17.117f, 2.787f, 15.9f)
                    curveTo(2.263f, 14.683f, 2f, 13.383f, 2f, 12f)
                    curveTo(2f, 10.617f, 2.263f, 9.317f, 2.787f, 8.1f)
                    curveTo(3.313f, 6.883f, 4.025f, 5.825f, 4.925f, 4.925f)
                    curveTo(5.825f, 4.025f, 6.883f, 3.313f, 8.1f, 2.787f)
                    curveTo(9.317f, 2.263f, 10.617f, 2f, 12f, 2f)
                    curveTo(13.383f, 2f, 14.683f, 2.263f, 15.9f, 2.787f)
                    curveTo(17.117f, 3.313f, 18.175f, 4.025f, 19.075f, 4.925f)
                    curveTo(19.975f, 5.825f, 20.688f, 6.883f, 21.212f, 8.1f)
                    curveTo(21.737f, 9.317f, 22f, 10.617f, 22f, 12f)
                    curveTo(22f, 13.383f, 21.737f, 14.683f, 21.212f, 15.9f)
                    curveTo(20.688f, 17.117f, 19.975f, 18.175f, 19.075f, 19.075f)
                    curveTo(18.175f, 19.975f, 17.117f, 20.688f, 15.9f, 21.212f)
                    curveTo(14.683f, 21.737f, 13.383f, 22f, 12f, 22f)
                    curveTo(10.617f, 22f, 9.317f, 21.737f, 8.1f, 21.212f)
                    close()
                    moveTo(17.675f, 17.675f)
                    curveTo(19.225f, 16.125f, 20f, 14.233f, 20f, 12f)
                    curveTo(20f, 9.767f, 19.225f, 7.875f, 17.675f, 6.325f)
                    curveTo(16.125f, 4.775f, 14.233f, 4f, 12f, 4f)
                    curveTo(9.767f, 4f, 7.875f, 4.775f, 6.325f, 6.325f)
                    curveTo(4.775f, 7.875f, 4f, 9.767f, 4f, 12f)
                    curveTo(4f, 14.233f, 4.775f, 16.125f, 6.325f, 17.675f)
                    curveTo(7.875f, 19.225f, 9.767f, 20f, 12f, 20f)
                    curveTo(14.233f, 20f, 16.125f, 19.225f, 17.675f, 17.675f)
                    close()
                }
            }
        }.build()

        return _FunResultIcon!!
    }

@Suppress("ObjectPropertyName")
private var _FunResultIcon: ImageVector? = null
