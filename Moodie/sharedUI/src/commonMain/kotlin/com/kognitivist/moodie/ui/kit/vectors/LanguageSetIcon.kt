package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.LanguageSetIcon: ImageVector
    get() {
        if (_LanguageSetIcon != null) {
            return _LanguageSetIcon!!
        }
        _LanguageSetIcon = ImageVector.Builder(
            name = "LanguageSetIcon",
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
                    moveTo(20.125f, 33.213f)
                    curveTo(18.908f, 32.688f, 17.846f, 31.971f, 16.938f, 31.063f)
                    curveTo(16.029f, 30.154f, 15.313f, 29.092f, 14.788f, 27.875f)
                    curveTo(14.262f, 26.658f, 14f, 25.362f, 14f, 23.987f)
                    curveTo(14f, 22.612f, 14.262f, 21.321f, 14.788f, 20.112f)
                    curveTo(15.313f, 18.904f, 16.029f, 17.846f, 16.938f, 16.938f)
                    curveTo(17.846f, 16.029f, 18.908f, 15.313f, 20.125f, 14.788f)
                    curveTo(21.342f, 14.262f, 22.638f, 14f, 24.013f, 14f)
                    curveTo(25.388f, 14f, 26.679f, 14.262f, 27.888f, 14.788f)
                    curveTo(29.096f, 15.313f, 30.154f, 16.029f, 31.063f, 16.938f)
                    curveTo(31.971f, 17.846f, 32.688f, 18.904f, 33.213f, 20.112f)
                    curveTo(33.737f, 21.321f, 34f, 22.612f, 34f, 23.987f)
                    curveTo(34f, 25.362f, 33.737f, 26.658f, 33.213f, 27.875f)
                    curveTo(32.688f, 29.092f, 31.971f, 30.154f, 31.063f, 31.063f)
                    curveTo(30.154f, 31.971f, 29.096f, 32.688f, 27.888f, 33.213f)
                    curveTo(26.679f, 33.737f, 25.388f, 34f, 24.013f, 34f)
                    curveTo(22.638f, 34f, 21.342f, 33.737f, 20.125f, 33.213f)
                    close()
                    moveTo(24f, 31.95f)
                    curveTo(24.433f, 31.35f, 24.808f, 30.725f, 25.125f, 30.075f)
                    curveTo(25.442f, 29.425f, 25.7f, 28.733f, 25.9f, 28f)
                    horizontalLineTo(22.1f)
                    curveTo(22.3f, 28.733f, 22.558f, 29.425f, 22.875f, 30.075f)
                    curveTo(23.192f, 30.725f, 23.567f, 31.35f, 24f, 31.95f)
                    close()
                    moveTo(21.4f, 31.55f)
                    curveTo(21.1f, 31f, 20.837f, 30.429f, 20.612f, 29.837f)
                    curveTo(20.388f, 29.246f, 20.2f, 28.633f, 20.05f, 28f)
                    horizontalLineTo(17.1f)
                    curveTo(17.583f, 28.833f, 18.188f, 29.558f, 18.913f, 30.175f)
                    curveTo(19.638f, 30.792f, 20.467f, 31.25f, 21.4f, 31.55f)
                    close()
                    moveTo(26.6f, 31.55f)
                    curveTo(27.533f, 31.25f, 28.362f, 30.792f, 29.087f, 30.175f)
                    curveTo(29.813f, 29.558f, 30.417f, 28.833f, 30.9f, 28f)
                    horizontalLineTo(27.95f)
                    curveTo(27.8f, 28.633f, 27.612f, 29.246f, 27.388f, 29.837f)
                    curveTo(27.163f, 30.429f, 26.9f, 31f, 26.6f, 31.55f)
                    close()
                    moveTo(16.25f, 26f)
                    horizontalLineTo(19.65f)
                    curveTo(19.6f, 25.667f, 19.563f, 25.337f, 19.538f, 25.013f)
                    curveTo(19.513f, 24.688f, 19.5f, 24.35f, 19.5f, 24f)
                    curveTo(19.5f, 23.65f, 19.513f, 23.313f, 19.538f, 22.987f)
                    curveTo(19.563f, 22.663f, 19.6f, 22.333f, 19.65f, 22f)
                    horizontalLineTo(16.25f)
                    curveTo(16.167f, 22.333f, 16.104f, 22.663f, 16.063f, 22.987f)
                    curveTo(16.021f, 23.313f, 16f, 23.65f, 16f, 24f)
                    curveTo(16f, 24.35f, 16.021f, 24.688f, 16.063f, 25.013f)
                    curveTo(16.104f, 25.337f, 16.167f, 25.667f, 16.25f, 26f)
                    close()
                    moveTo(21.65f, 26f)
                    horizontalLineTo(26.35f)
                    curveTo(26.4f, 25.667f, 26.438f, 25.337f, 26.462f, 25.013f)
                    curveTo(26.487f, 24.688f, 26.5f, 24.35f, 26.5f, 24f)
                    curveTo(26.5f, 23.65f, 26.487f, 23.313f, 26.462f, 22.987f)
                    curveTo(26.438f, 22.663f, 26.4f, 22.333f, 26.35f, 22f)
                    horizontalLineTo(21.65f)
                    curveTo(21.6f, 22.333f, 21.563f, 22.663f, 21.538f, 22.987f)
                    curveTo(21.513f, 23.313f, 21.5f, 23.65f, 21.5f, 24f)
                    curveTo(21.5f, 24.35f, 21.513f, 24.688f, 21.538f, 25.013f)
                    curveTo(21.563f, 25.337f, 21.6f, 25.667f, 21.65f, 26f)
                    close()
                    moveTo(28.35f, 26f)
                    horizontalLineTo(31.75f)
                    curveTo(31.833f, 25.667f, 31.896f, 25.337f, 31.938f, 25.013f)
                    curveTo(31.979f, 24.688f, 32f, 24.35f, 32f, 24f)
                    curveTo(32f, 23.65f, 31.979f, 23.313f, 31.938f, 22.987f)
                    curveTo(31.896f, 22.663f, 31.833f, 22.333f, 31.75f, 22f)
                    horizontalLineTo(28.35f)
                    curveTo(28.4f, 22.333f, 28.438f, 22.663f, 28.462f, 22.987f)
                    curveTo(28.487f, 23.313f, 28.5f, 23.65f, 28.5f, 24f)
                    curveTo(28.5f, 24.35f, 28.487f, 24.688f, 28.462f, 25.013f)
                    curveTo(28.438f, 25.337f, 28.4f, 25.667f, 28.35f, 26f)
                    close()
                    moveTo(27.95f, 20f)
                    horizontalLineTo(30.9f)
                    curveTo(30.417f, 19.167f, 29.813f, 18.442f, 29.087f, 17.825f)
                    curveTo(28.362f, 17.208f, 27.533f, 16.75f, 26.6f, 16.45f)
                    curveTo(26.9f, 17f, 27.163f, 17.571f, 27.388f, 18.163f)
                    curveTo(27.612f, 18.754f, 27.8f, 19.367f, 27.95f, 20f)
                    close()
                    moveTo(22.1f, 20f)
                    horizontalLineTo(25.9f)
                    curveTo(25.7f, 19.267f, 25.442f, 18.575f, 25.125f, 17.925f)
                    curveTo(24.808f, 17.275f, 24.433f, 16.65f, 24f, 16.05f)
                    curveTo(23.567f, 16.65f, 23.192f, 17.275f, 22.875f, 17.925f)
                    curveTo(22.558f, 18.575f, 22.3f, 19.267f, 22.1f, 20f)
                    close()
                    moveTo(17.1f, 20f)
                    horizontalLineTo(20.05f)
                    curveTo(20.2f, 19.367f, 20.388f, 18.754f, 20.612f, 18.163f)
                    curveTo(20.837f, 17.571f, 21.1f, 17f, 21.4f, 16.45f)
                    curveTo(20.467f, 16.75f, 19.638f, 17.208f, 18.913f, 17.825f)
                    curveTo(18.188f, 18.442f, 17.583f, 19.167f, 17.1f, 20f)
                    close()
                }
            }
        }.build()

        return _LanguageSetIcon!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageSetIcon: ImageVector? = null
