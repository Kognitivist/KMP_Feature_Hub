package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.LookOnboardingAgainIcon: ImageVector
    get() {
        if (_LookOnboardingAgainIcon != null) {
            return _LookOnboardingAgainIcon!!
        }
        _LookOnboardingAgainIcon = ImageVector.Builder(
            name = "LookOnboardingAgainIcon",
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
                    moveTo(22.65f, 27.75f)
                    lineTo(27.525f, 24.625f)
                    curveTo(27.758f, 24.475f, 27.875f, 24.267f, 27.875f, 24f)
                    curveTo(27.875f, 23.733f, 27.758f, 23.525f, 27.525f, 23.375f)
                    lineTo(22.65f, 20.25f)
                    curveTo(22.4f, 20.083f, 22.146f, 20.071f, 21.888f, 20.212f)
                    curveTo(21.629f, 20.354f, 21.5f, 20.575f, 21.5f, 20.875f)
                    verticalLineTo(27.125f)
                    curveTo(21.5f, 27.425f, 21.629f, 27.646f, 21.888f, 27.788f)
                    curveTo(22.146f, 27.929f, 22.4f, 27.917f, 22.65f, 27.75f)
                    close()
                    moveTo(24f, 34f)
                    curveTo(22.617f, 34f, 21.317f, 33.737f, 20.1f, 33.213f)
                    curveTo(18.883f, 32.688f, 17.825f, 31.975f, 16.925f, 31.075f)
                    curveTo(16.025f, 30.175f, 15.313f, 29.117f, 14.788f, 27.9f)
                    curveTo(14.262f, 26.683f, 14f, 25.383f, 14f, 24f)
                    curveTo(14f, 22.617f, 14.262f, 21.317f, 14.788f, 20.1f)
                    curveTo(15.313f, 18.883f, 16.025f, 17.825f, 16.925f, 16.925f)
                    curveTo(17.825f, 16.025f, 18.883f, 15.313f, 20.1f, 14.788f)
                    curveTo(21.317f, 14.262f, 22.617f, 14f, 24f, 14f)
                    curveTo(25.383f, 14f, 26.683f, 14.262f, 27.9f, 14.788f)
                    curveTo(29.117f, 15.313f, 30.175f, 16.025f, 31.075f, 16.925f)
                    curveTo(31.975f, 17.825f, 32.688f, 18.883f, 33.213f, 20.1f)
                    curveTo(33.737f, 21.317f, 34f, 22.617f, 34f, 24f)
                    curveTo(34f, 25.383f, 33.737f, 26.683f, 33.213f, 27.9f)
                    curveTo(32.688f, 29.117f, 31.975f, 30.175f, 31.075f, 31.075f)
                    curveTo(30.175f, 31.975f, 29.117f, 32.688f, 27.9f, 33.213f)
                    curveTo(26.683f, 33.737f, 25.383f, 34f, 24f, 34f)
                    close()
                    moveTo(24f, 32f)
                    curveTo(26.233f, 32f, 28.125f, 31.225f, 29.675f, 29.675f)
                    curveTo(31.225f, 28.125f, 32f, 26.233f, 32f, 24f)
                    curveTo(32f, 21.767f, 31.225f, 19.875f, 29.675f, 18.325f)
                    curveTo(28.125f, 16.775f, 26.233f, 16f, 24f, 16f)
                    curveTo(21.767f, 16f, 19.875f, 16.775f, 18.325f, 18.325f)
                    curveTo(16.775f, 19.875f, 16f, 21.767f, 16f, 24f)
                    curveTo(16f, 26.233f, 16.775f, 28.125f, 18.325f, 29.675f)
                    curveTo(19.875f, 31.225f, 21.767f, 32f, 24f, 32f)
                    close()
                }
            }
        }.build()

        return _LookOnboardingAgainIcon!!
    }

@Suppress("ObjectPropertyName")
private var _LookOnboardingAgainIcon: ImageVector? = null
