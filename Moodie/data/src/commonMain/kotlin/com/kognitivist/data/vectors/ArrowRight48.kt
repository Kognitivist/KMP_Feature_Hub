package com.kognitivist.data.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.ArrowRight48: ImageVector
    get() {
        if (_ArrowRight48 != null) {
            return _ArrowRight48!!
        }
        _ArrowRight48 = ImageVector.Builder(
            name = "ArrowRight48",
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
                path(fill = SolidColor(Color(0xFF49454F))) {
                    moveTo(24.6f, 24f)
                    lineTo(20f, 19.4f)
                    lineTo(21.4f, 18f)
                    lineTo(27.4f, 24f)
                    lineTo(21.4f, 30f)
                    lineTo(20f, 28.6f)
                    lineTo(24.6f, 24f)
                    close()
                }
            }
        }.build()

        return _ArrowRight48!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight48: ImageVector? = null
