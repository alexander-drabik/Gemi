package xyz.goatcode.gemi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xyz.goatcode.gemi.ui.theme.Cursor
import xyz.goatcode.gemi.ui.theme.MyApplicationTheme
import xyz.goatcode.gemi.ui.theme.Panel
import xyz.goatcode.gemi.ui.theme.Search

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
                .size(60.dp)
                .background(color = MaterialTheme.colors.Panel)
        ) {
            Box(
                modifier = Modifier
                    .width(300.dp)
                    .height(45.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .align(Alignment.Center)
                    .background(MaterialTheme.colors.Search)
            ) {
                SearchBox()
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(2.dp)
                    .background(color = MaterialTheme.colors.primary)
                    .align(Alignment.BottomEnd)
            )
        }
    }
    
    @Composable
    private fun SearchBox() {
        var input by rememberSaveable {
            mutableStateOf("")
        }
        Row(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                imageVector = Icons.Filled.Search,
                modifier = Modifier
                    .align(CenterVertically),
                contentDescription = null
            )
            BasicTextField(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.9.dp),
                value = input,
                onValueChange = {
                    input = it
                },
                textStyle = TextStyle(
                    color = Color.White
                ),
                cursorBrush = SolidColor(MaterialTheme.colors.Cursor),
                decorationBox = { innerTextField ->
                    Row(modifier = Modifier.fillMaxWidth()) {
                        if (input.isEmpty()) {
                            Text(
                                text = "Search",
                                color = Color.Gray,
                                fontSize = 14.sp
                            )
                        }
                    }
                    innerTextField()
                }
            )
        }
    }
}
