package xyz.goatcode.gemi.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Color(60, 59, 61, 255),
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color(38, 37, 43, 255)
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val (colors, systemUIColor) = if (darkTheme) {
        Pair(DarkColorPalette, darkPurple)
    } else {
        Pair(LightColorPalette, Teal200)
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
    ) {
        Scaffold(
            content = {
                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(systemUIColor)
                content()
            },
            backgroundColor = colors.background
        )
    }
}
