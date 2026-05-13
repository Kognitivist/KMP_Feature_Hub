package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.LightThemeSelectedIcon: ImageVector
    get() {
        if (_LightThemeSelectedIcon != null) {
            return _LightThemeSelectedIcon!!
        }
        _LightThemeSelectedIcon = ImageVector.Builder(
            name = "LightThemeSelectedIcon",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 30f,
            viewportHeight = 30f
        ).apply {
            path(fill = SolidColor(Color(0xFFB24F9C))) {
                moveTo(10.578f, 19.422f)
                curveTo(9.359f, 18.203f, 8.75f, 16.729f, 8.75f, 15f)
                curveTo(8.75f, 13.271f, 9.359f, 11.797f, 10.578f, 10.578f)
                curveTo(11.797f, 9.359f, 13.271f, 8.75f, 15f, 8.75f)
                curveTo(16.729f, 8.75f, 18.203f, 9.359f, 19.422f, 10.578f)
                curveTo(20.641f, 11.797f, 21.25f, 13.271f, 21.25f, 15f)
                curveTo(21.25f, 16.729f, 20.641f, 18.203f, 19.422f, 19.422f)
                curveTo(18.203f, 20.641f, 16.729f, 21.25f, 15f, 21.25f)
                curveTo(13.271f, 21.25f, 11.797f, 20.641f, 10.578f, 19.422f)
                close()
                moveTo(2.5f, 16.25f)
                curveTo(2.146f, 16.25f, 1.849f, 16.13f, 1.609f, 15.891f)
                curveTo(1.37f, 15.651f, 1.25f, 15.354f, 1.25f, 15f)
                curveTo(1.25f, 14.646f, 1.37f, 14.349f, 1.609f, 14.109f)
                curveTo(1.849f, 13.87f, 2.146f, 13.75f, 2.5f, 13.75f)
                horizontalLineTo(5f)
                curveTo(5.354f, 13.75f, 5.651f, 13.87f, 5.891f, 14.109f)
                curveTo(6.13f, 14.349f, 6.25f, 14.646f, 6.25f, 15f)
                curveTo(6.25f, 15.354f, 6.13f, 15.651f, 5.891f, 15.891f)
                curveTo(5.651f, 16.13f, 5.354f, 16.25f, 5f, 16.25f)
                horizontalLineTo(2.5f)
                close()
                moveTo(25f, 16.25f)
                curveTo(24.646f, 16.25f, 24.349f, 16.13f, 24.109f, 15.891f)
                curveTo(23.87f, 15.651f, 23.75f, 15.354f, 23.75f, 15f)
                curveTo(23.75f, 14.646f, 23.87f, 14.349f, 24.109f, 14.109f)
                curveTo(24.349f, 13.87f, 24.646f, 13.75f, 25f, 13.75f)
                horizontalLineTo(27.5f)
                curveTo(27.854f, 13.75f, 28.151f, 13.87f, 28.391f, 14.109f)
                curveTo(28.63f, 14.349f, 28.75f, 14.646f, 28.75f, 15f)
                curveTo(28.75f, 15.354f, 28.63f, 15.651f, 28.391f, 15.891f)
                curveTo(28.151f, 16.13f, 27.854f, 16.25f, 27.5f, 16.25f)
                horizontalLineTo(25f)
                close()
                moveTo(14.109f, 5.891f)
                curveTo(13.87f, 5.651f, 13.75f, 5.354f, 13.75f, 5f)
                verticalLineTo(2.5f)
                curveTo(13.75f, 2.146f, 13.87f, 1.849f, 14.109f, 1.609f)
                curveTo(14.349f, 1.37f, 14.646f, 1.25f, 15f, 1.25f)
                curveTo(15.354f, 1.25f, 15.651f, 1.37f, 15.891f, 1.609f)
                curveTo(16.13f, 1.849f, 16.25f, 2.146f, 16.25f, 2.5f)
                verticalLineTo(5f)
                curveTo(16.25f, 5.354f, 16.13f, 5.651f, 15.891f, 5.891f)
                curveTo(15.651f, 6.13f, 15.354f, 6.25f, 15f, 6.25f)
                curveTo(14.646f, 6.25f, 14.349f, 6.13f, 14.109f, 5.891f)
                close()
                moveTo(14.109f, 28.391f)
                curveTo(13.87f, 28.151f, 13.75f, 27.854f, 13.75f, 27.5f)
                verticalLineTo(25f)
                curveTo(13.75f, 24.646f, 13.87f, 24.349f, 14.109f, 24.109f)
                curveTo(14.349f, 23.87f, 14.646f, 23.75f, 15f, 23.75f)
                curveTo(15.354f, 23.75f, 15.651f, 23.87f, 15.891f, 24.109f)
                curveTo(16.13f, 24.349f, 16.25f, 24.646f, 16.25f, 25f)
                verticalLineTo(27.5f)
                curveTo(16.25f, 27.854f, 16.13f, 28.151f, 15.891f, 28.391f)
                curveTo(15.651f, 28.63f, 15.354f, 28.75f, 15f, 28.75f)
                curveTo(14.646f, 28.75f, 14.349f, 28.63f, 14.109f, 28.391f)
                close()
                moveTo(7.063f, 8.813f)
                lineTo(5.719f, 7.5f)
                curveTo(5.469f, 7.271f, 5.349f, 6.979f, 5.359f, 6.625f)
                curveTo(5.37f, 6.271f, 5.49f, 5.969f, 5.719f, 5.719f)
                curveTo(5.969f, 5.469f, 6.271f, 5.344f, 6.625f, 5.344f)
                curveTo(6.979f, 5.344f, 7.271f, 5.469f, 7.5f, 5.719f)
                lineTo(8.813f, 7.063f)
                curveTo(9.042f, 7.313f, 9.156f, 7.604f, 9.156f, 7.938f)
                curveTo(9.156f, 8.271f, 9.042f, 8.563f, 8.813f, 8.813f)
                curveTo(8.583f, 9.063f, 8.297f, 9.182f, 7.953f, 9.172f)
                curveTo(7.609f, 9.161f, 7.313f, 9.042f, 7.063f, 8.813f)
                close()
                moveTo(22.5f, 24.281f)
                lineTo(21.188f, 22.938f)
                curveTo(20.958f, 22.688f, 20.844f, 22.391f, 20.844f, 22.047f)
                curveTo(20.844f, 21.703f, 20.958f, 21.417f, 21.188f, 21.188f)
                curveTo(21.417f, 20.938f, 21.703f, 20.818f, 22.047f, 20.828f)
                curveTo(22.391f, 20.838f, 22.688f, 20.958f, 22.938f, 21.188f)
                lineTo(24.281f, 22.5f)
                curveTo(24.531f, 22.729f, 24.651f, 23.021f, 24.641f, 23.375f)
                curveTo(24.63f, 23.729f, 24.51f, 24.031f, 24.281f, 24.281f)
                curveTo(24.031f, 24.531f, 23.729f, 24.656f, 23.375f, 24.656f)
                curveTo(23.021f, 24.656f, 22.729f, 24.531f, 22.5f, 24.281f)
                close()
                moveTo(21.188f, 8.813f)
                curveTo(20.938f, 8.583f, 20.818f, 8.297f, 20.828f, 7.953f)
                curveTo(20.838f, 7.609f, 20.958f, 7.313f, 21.188f, 7.063f)
                lineTo(22.5f, 5.719f)
                curveTo(22.729f, 5.469f, 23.021f, 5.349f, 23.375f, 5.359f)
                curveTo(23.729f, 5.37f, 24.031f, 5.49f, 24.281f, 5.719f)
                curveTo(24.531f, 5.969f, 24.656f, 6.271f, 24.656f, 6.625f)
                curveTo(24.656f, 6.979f, 24.531f, 7.271f, 24.281f, 7.5f)
                lineTo(22.938f, 8.813f)
                curveTo(22.688f, 9.042f, 22.396f, 9.156f, 22.063f, 9.156f)
                curveTo(21.729f, 9.156f, 21.438f, 9.042f, 21.188f, 8.813f)
                close()
                moveTo(5.719f, 24.281f)
                curveTo(5.469f, 24.031f, 5.344f, 23.729f, 5.344f, 23.375f)
                curveTo(5.344f, 23.021f, 5.469f, 22.729f, 5.719f, 22.5f)
                lineTo(7.063f, 21.188f)
                curveTo(7.313f, 20.958f, 7.609f, 20.844f, 7.953f, 20.844f)
                curveTo(8.297f, 20.844f, 8.583f, 20.958f, 8.813f, 21.188f)
                curveTo(9.063f, 21.417f, 9.182f, 21.703f, 9.172f, 22.047f)
                curveTo(9.161f, 22.391f, 9.042f, 22.688f, 8.813f, 22.938f)
                lineTo(7.5f, 24.281f)
                curveTo(7.271f, 24.531f, 6.979f, 24.651f, 6.625f, 24.641f)
                curveTo(6.271f, 24.63f, 5.969f, 24.51f, 5.719f, 24.281f)
                close()
            }
        }.build()

        return _LightThemeSelectedIcon!!
    }

@Suppress("ObjectPropertyName")
private var _LightThemeSelectedIcon: ImageVector? = null
