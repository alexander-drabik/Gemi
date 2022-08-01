package xyz.goatcode.gemi.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val darkPurple = Color(49, 44, 56, 255)
val Teal200 = Color(0xFF03DAC5)

val Colors.Panel: Color
    get() = if (isLight) Teal200 else darkPurple
