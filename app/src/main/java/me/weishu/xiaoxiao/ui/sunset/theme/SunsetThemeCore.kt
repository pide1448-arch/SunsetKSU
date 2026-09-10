package me.weishu.xiaoxiao.ui.sunset.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

data class SunsetThemeConfig(

    val darkMode: Boolean = false,

    val primaryColor: Long = 0xFF6750A4,

    val secondaryColor: Long = 0xFF625B71,

    val backgroundColor: Long = 0xFFFDFBFF,

    val cardColor: Long = 0xFFFFFFFF,

    val cardAlpha: Float = 1.0f,

    val cardRadius: Float = 24f,

    val fontScale: Float = 1.0f,

    val animationEnabled: Boolean = true,

    val floatingButtonEnabled: Boolean = true
)

val LocalSunsetTheme =
    staticCompositionLocalOf {
        SunsetThemeConfig()
    }

@Composable
fun SunsetTheme(
    config: SunsetThemeConfig = SunsetThemeConfig(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalSunsetTheme provides config
    ) {
        content()
    }
}
