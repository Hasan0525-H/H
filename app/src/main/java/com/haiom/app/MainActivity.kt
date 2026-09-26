package com.haiom.app

import android.graphics.Color as AndroidColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.haiom.app.ui.HAgentApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                AndroidColor.TRANSPARENT,
                AndroidColor.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                AndroidColor.TRANSPARENT,
                AndroidColor.TRANSPARENT
            )
        )
        setContent {
            val colors = lightColorScheme(
                primary = Color(0xFF111827),
                onPrimary = Color.White,
                primaryContainer = Color(0xFFE8ECEF),
                onPrimaryContainer = Color(0xFF111827),
                secondary = Color(0xFF3F4854),
                secondaryContainer = Color(0xFFF0F2F4),
                background = Color(0xFFF7F8FA),
                surface = Color.White,
                surfaceVariant = Color(0xFFF1F3F5),
                onSurface = Color(0xFF101214),
                onSurfaceVariant = Color(0xFF69717C),
                outline = Color(0xFFD9DEE4),
                error = Color(0xFFC53F50)
            )
            MaterialTheme(colorScheme = colors) {
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    HAgentApp()
                }
            }
        }
    }

}
