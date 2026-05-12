package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.HowItWorksIcon: ImageVector
    get() {
        if (_HowItWorksIcon != null) {
            return _HowItWorksIcon!!
        }
        _HowItWorksIcon = ImageVector.Builder(
            name = "HowItWorksIcon",
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
                    moveTo(18f, 29.7f)
                    curveTo(17.05f, 28.833f, 16.313f, 27.821f, 15.788f, 26.663f)
                    curveTo(15.262f, 25.504f, 15f, 24.283f, 15f, 23f)
                    curveTo(15f, 20.5f, 15.875f, 18.375f, 17.625f, 16.625f)
                    curveTo(19.375f, 14.875f, 21.5f, 14f, 24f, 14f)
                    curveTo(26.083f, 14f, 27.929f, 14.613f, 29.538f, 15.837f)
                    curveTo(31.146f, 17.063f, 32.192f, 18.658f, 32.675f, 20.625f)
                    lineTo(33.975f, 25.75f)
                    curveTo(34.058f, 26.067f, 34f, 26.354f, 33.8f, 26.612f)
                    curveTo(33.6f, 26.871f, 33.333f, 27f, 33f, 27f)
                    horizontalLineTo(31f)
                    verticalLineTo(30f)
                    curveTo(31f, 30.55f, 30.804f, 31.021f, 30.413f, 31.413f)
                    curveTo(30.021f, 31.804f, 29.55f, 32f, 29f, 32f)
                    horizontalLineTo(27f)
                    verticalLineTo(33f)
                    curveTo(27f, 33.283f, 26.904f, 33.521f, 26.712f, 33.713f)
                    curveTo(26.521f, 33.904f, 26.283f, 34f, 26f, 34f)
                    curveTo(25.717f, 34f, 25.479f, 33.904f, 25.288f, 33.713f)
                    curveTo(25.096f, 33.521f, 25f, 33.283f, 25f, 33f)
                    verticalLineTo(31f)
                    curveTo(25f, 30.717f, 25.096f, 30.479f, 25.288f, 30.288f)
                    curveTo(25.479f, 30.096f, 25.717f, 30f, 26f, 30f)
                    horizontalLineTo(29f)
                    verticalLineTo(26f)
                    curveTo(29f, 25.717f, 29.096f, 25.479f, 29.288f, 25.288f)
                    curveTo(29.479f, 25.096f, 29.717f, 25f, 30f, 25f)
                    horizontalLineTo(31.7f)
                    lineTo(30.75f, 21.125f)
                    curveTo(30.367f, 19.608f, 29.55f, 18.375f, 28.3f, 17.425f)
                    curveTo(27.05f, 16.475f, 25.617f, 16f, 24f, 16f)
                    curveTo(22.067f, 16f, 20.417f, 16.675f, 19.05f, 18.025f)
                    curveTo(17.683f, 19.375f, 17f, 21.017f, 17f, 22.95f)
                    curveTo(17f, 23.95f, 17.204f, 24.9f, 17.612f, 25.8f)
                    curveTo(18.021f, 26.7f, 18.6f, 27.5f, 19.35f, 28.2f)
                    lineTo(20f, 28.8f)
                    verticalLineTo(33f)
                    curveTo(20f, 33.283f, 19.904f, 33.521f, 19.712f, 33.713f)
                    curveTo(19.521f, 33.904f, 19.283f, 34f, 19f, 34f)
                    curveTo(18.717f, 34f, 18.479f, 33.904f, 18.288f, 33.713f)
                    curveTo(18.096f, 33.521f, 18f, 33.283f, 18f, 33f)
                    verticalLineTo(29.7f)
                    close()
                    moveTo(24f, 28f)
                    curveTo(24.283f, 28f, 24.521f, 27.904f, 24.712f, 27.712f)
                    curveTo(24.904f, 27.521f, 25f, 27.283f, 25f, 27f)
                    curveTo(25f, 26.717f, 24.904f, 26.479f, 24.712f, 26.288f)
                    curveTo(24.521f, 26.096f, 24.283f, 26f, 24f, 26f)
                    curveTo(23.717f, 26f, 23.479f, 26.096f, 23.288f, 26.288f)
                    curveTo(23.096f, 26.479f, 23f, 26.717f, 23f, 27f)
                    curveTo(23f, 27.283f, 23.096f, 27.521f, 23.288f, 27.712f)
                    curveTo(23.479f, 27.904f, 23.717f, 28f, 24f, 28f)
                    close()
                    moveTo(24.075f, 19.425f)
                    curveTo(24.442f, 19.425f, 24.746f, 19.525f, 24.987f, 19.725f)
                    curveTo(25.229f, 19.925f, 25.35f, 20.183f, 25.35f, 20.5f)
                    curveTo(25.35f, 20.767f, 25.279f, 21.021f, 25.138f, 21.263f)
                    curveTo(24.996f, 21.504f, 24.717f, 21.842f, 24.3f, 22.275f)
                    curveTo(23.983f, 22.608f, 23.754f, 22.904f, 23.612f, 23.163f)
                    curveTo(23.471f, 23.421f, 23.375f, 23.717f, 23.325f, 24.05f)
                    curveTo(23.292f, 24.25f, 23.346f, 24.425f, 23.487f, 24.575f)
                    curveTo(23.629f, 24.725f, 23.808f, 24.8f, 24.025f, 24.8f)
                    curveTo(24.208f, 24.8f, 24.379f, 24.737f, 24.538f, 24.612f)
                    curveTo(24.696f, 24.487f, 24.8f, 24.317f, 24.85f, 24.1f)
                    curveTo(24.9f, 23.9f, 24.979f, 23.704f, 25.087f, 23.513f)
                    curveTo(25.196f, 23.321f, 25.367f, 23.1f, 25.6f, 22.85f)
                    curveTo(26.133f, 22.267f, 26.483f, 21.825f, 26.65f, 21.525f)
                    curveTo(26.817f, 21.225f, 26.9f, 20.883f, 26.9f, 20.5f)
                    curveTo(26.9f, 19.8f, 26.629f, 19.208f, 26.087f, 18.725f)
                    curveTo(25.546f, 18.242f, 24.875f, 18f, 24.075f, 18f)
                    curveTo(23.542f, 18f, 23.038f, 18.129f, 22.563f, 18.388f)
                    curveTo(22.087f, 18.646f, 21.708f, 19f, 21.425f, 19.45f)
                    curveTo(21.325f, 19.617f, 21.321f, 19.792f, 21.413f, 19.975f)
                    curveTo(21.504f, 20.158f, 21.642f, 20.292f, 21.825f, 20.375f)
                    curveTo(22.008f, 20.458f, 22.188f, 20.471f, 22.362f, 20.413f)
                    curveTo(22.538f, 20.354f, 22.692f, 20.233f, 22.825f, 20.05f)
                    curveTo(22.992f, 19.85f, 23.183f, 19.696f, 23.4f, 19.587f)
                    curveTo(23.617f, 19.479f, 23.842f, 19.425f, 24.075f, 19.425f)
                    close()
                }
            }
        }.build()

        return _HowItWorksIcon!!
    }

@Suppress("ObjectPropertyName")
private var _HowItWorksIcon: ImageVector? = null
