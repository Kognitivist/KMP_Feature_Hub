package com.kognitivist.data.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.AboutAppIcon: ImageVector
    get() {
        if (_AboutAppIcon != null) {
            return _AboutAppIcon!!
        }
        _AboutAppIcon = ImageVector.Builder(
            name = "AboutAppIcon",
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
                    moveTo(27.5f, 23f)
                    curveTo(27.917f, 23f, 28.271f, 22.854f, 28.563f, 22.563f)
                    curveTo(28.854f, 22.271f, 29f, 21.917f, 29f, 21.5f)
                    curveTo(29f, 21.083f, 28.854f, 20.729f, 28.563f, 20.438f)
                    curveTo(28.271f, 20.146f, 27.917f, 20f, 27.5f, 20f)
                    curveTo(27.083f, 20f, 26.729f, 20.146f, 26.438f, 20.438f)
                    curveTo(26.146f, 20.729f, 26f, 21.083f, 26f, 21.5f)
                    curveTo(26f, 21.917f, 26.146f, 22.271f, 26.438f, 22.563f)
                    curveTo(26.729f, 22.854f, 27.083f, 23f, 27.5f, 23f)
                    close()
                    moveTo(20.5f, 23f)
                    curveTo(20.917f, 23f, 21.271f, 22.854f, 21.563f, 22.563f)
                    curveTo(21.854f, 22.271f, 22f, 21.917f, 22f, 21.5f)
                    curveTo(22f, 21.083f, 21.854f, 20.729f, 21.563f, 20.438f)
                    curveTo(21.271f, 20.146f, 20.917f, 20f, 20.5f, 20f)
                    curveTo(20.083f, 20f, 19.729f, 20.146f, 19.438f, 20.438f)
                    curveTo(19.146f, 20.729f, 19f, 21.083f, 19f, 21.5f)
                    curveTo(19f, 21.917f, 19.146f, 22.271f, 19.438f, 22.563f)
                    curveTo(19.729f, 22.854f, 20.083f, 23f, 20.5f, 23f)
                    close()
                    moveTo(24f, 34f)
                    curveTo(22.617f, 34f, 21.317f, 33.737f, 20.1f, 33.213f)
                    curveTo(18.883f, 32.688f, 17.825f, 31.975f, 16.925f, 31.075f)
                    curveTo(16.025f, 30.175f, 15.313f, 29.117f, 14.788f, 27.9f)
                    curveTo(14.262f, 26.683f, 14f, 25.383f, 14f, 24f)
                    curveTo(14f, 22.6f, 14.262f, 21.292f, 14.788f, 20.075f)
                    curveTo(15.313f, 18.858f, 16.033f, 17.8f, 16.95f, 16.9f)
                    curveTo(17.867f, 16f, 18.933f, 15.292f, 20.15f, 14.775f)
                    curveTo(21.367f, 14.258f, 22.658f, 14f, 24.025f, 14f)
                    curveTo(24.292f, 14f, 24.504f, 14.104f, 24.663f, 14.313f)
                    curveTo(24.821f, 14.521f, 24.883f, 14.767f, 24.85f, 15.05f)
                    curveTo(24.817f, 15.333f, 24.7f, 15.558f, 24.5f, 15.725f)
                    curveTo(24.3f, 15.892f, 24.058f, 15.983f, 23.775f, 16f)
                    curveTo(23.192f, 16.017f, 22.621f, 16.096f, 22.063f, 16.237f)
                    curveTo(21.504f, 16.379f, 20.958f, 16.583f, 20.425f, 16.85f)
                    curveTo(19.108f, 17.517f, 18.042f, 18.483f, 17.225f, 19.75f)
                    curveTo(16.408f, 21.017f, 16f, 22.433f, 16f, 24f)
                    curveTo(16f, 26.217f, 16.779f, 28.104f, 18.337f, 29.663f)
                    curveTo(19.896f, 31.221f, 21.783f, 32f, 24f, 32f)
                    curveTo(25.65f, 32f, 27.133f, 31.55f, 28.45f, 30.65f)
                    curveTo(29.767f, 29.75f, 30.733f, 28.583f, 31.35f, 27.15f)
                    curveTo(31.65f, 26.467f, 31.85f, 25.767f, 31.95f, 25.05f)
                    curveTo(32.05f, 24.333f, 32.042f, 23.608f, 31.925f, 22.875f)
                    curveTo(31.892f, 22.592f, 31.942f, 22.337f, 32.075f, 22.112f)
                    curveTo(32.208f, 21.888f, 32.408f, 21.733f, 32.675f, 21.65f)
                    curveTo(32.942f, 21.567f, 33.192f, 21.583f, 33.425f, 21.7f)
                    curveTo(33.658f, 21.817f, 33.8f, 22.008f, 33.85f, 22.275f)
                    curveTo(34.017f, 23.258f, 34.042f, 24.246f, 33.925f, 25.237f)
                    curveTo(33.808f, 26.229f, 33.55f, 27.175f, 33.15f, 28.075f)
                    curveTo(32.367f, 29.842f, 31.163f, 31.271f, 29.538f, 32.362f)
                    curveTo(27.913f, 33.454f, 26.067f, 34f, 24f, 34f)
                    close()
                    moveTo(30.9f, 14.2f)
                    curveTo(31.233f, 13.867f, 31.538f, 13.583f, 31.813f, 13.35f)
                    curveTo(32.088f, 13.117f, 32.467f, 13f, 32.95f, 13f)
                    curveTo(33.567f, 13f, 34.063f, 13.212f, 34.438f, 13.637f)
                    curveTo(34.813f, 14.063f, 35f, 14.542f, 35f, 15.075f)
                    curveTo(35f, 15.325f, 34.95f, 15.575f, 34.85f, 15.825f)
                    curveTo(34.75f, 16.075f, 34.6f, 16.3f, 34.4f, 16.5f)
                    lineTo(31.6f, 19.3f)
                    curveTo(31.4f, 19.5f, 31.167f, 19.6f, 30.9f, 19.6f)
                    curveTo(30.633f, 19.6f, 30.4f, 19.5f, 30.2f, 19.3f)
                    lineTo(27.4f, 16.5f)
                    curveTo(27.183f, 16.283f, 27.029f, 16.05f, 26.938f, 15.8f)
                    curveTo(26.846f, 15.55f, 26.8f, 15.3f, 26.8f, 15.05f)
                    curveTo(26.8f, 14.517f, 26.992f, 14.042f, 27.375f, 13.625f)
                    curveTo(27.758f, 13.208f, 28.25f, 13f, 28.85f, 13f)
                    curveTo(29.317f, 13f, 29.683f, 13.108f, 29.95f, 13.325f)
                    curveTo(30.217f, 13.542f, 30.533f, 13.833f, 30.9f, 14.2f)
                    close()
                    moveTo(24f, 29.5f)
                    curveTo(24.967f, 29.5f, 25.862f, 29.271f, 26.688f, 28.813f)
                    curveTo(27.513f, 28.354f, 28.167f, 27.717f, 28.65f, 26.9f)
                    curveTo(28.767f, 26.717f, 28.763f, 26.521f, 28.638f, 26.313f)
                    curveTo(28.513f, 26.104f, 28.333f, 26f, 28.1f, 26f)
                    horizontalLineTo(19.9f)
                    curveTo(19.667f, 26f, 19.487f, 26.104f, 19.362f, 26.313f)
                    curveTo(19.237f, 26.521f, 19.233f, 26.717f, 19.35f, 26.9f)
                    curveTo(19.833f, 27.717f, 20.492f, 28.354f, 21.325f, 28.813f)
                    curveTo(22.158f, 29.271f, 23.05f, 29.5f, 24f, 29.5f)
                    close()
                }
            }
        }.build()

        return _AboutAppIcon!!
    }

@Suppress("ObjectPropertyName")
private var _AboutAppIcon: ImageVector? = null
