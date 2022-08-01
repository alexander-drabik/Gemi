package xyz.goatcode.gemi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import xyz.goatcode.gemi.ui.theme.MyApplicationTheme
import xyz.goatcode.gemi.ui.theme.Panel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                TopPanel()
            }
        }
    }
    
    @Composable
    private fun TopPanel() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(50.dp)
                .background(color = MaterialTheme.colors.Panel)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(2.dp)
                    .background(color = MaterialTheme.colors.primary)
                    .align(Alignment.BottomEnd)
            )
        }
    }
}
