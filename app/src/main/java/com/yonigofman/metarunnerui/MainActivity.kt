package com.yonigofman.metarunnerui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yonigofman.metarunner_bottom_nav.BottomNavScreen
import com.yonigofman.metarunner_bottom_nav.ui.MetaRunnerBottomNavigation
import com.yonigofman.metarunner_bottom_nav.ui.MetaRunnerButton
import com.yonigofman.metarunnerui.ui.theme.MetaRunnerUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview()
@Composable
fun DefaultPreview() {
    val home = BottomNavScreen(route = "home","Home", Icons.Rounded.Home)
    val profile = BottomNavScreen(route = "profile","Profile", Icons.Rounded.Person)
    val settings = BottomNavScreen(route = "settings","Settings", Icons.Rounded.Settings)

    val items = listOf<BottomNavScreen>(home, profile,settings)
    val currentRoute by remember { mutableStateOf(home.route) }



    Column(Modifier.fillMaxSize()) {
        MetaRunnerButton(
            text = "Hello",
            textColor = Color.White,
            color = Color.Blue,
            onClick = { /*TODO*/ }
        )

        MetaRunnerBottomNavigation(
            items = items,
            backgroundColor = MaterialTheme.colors.surface,
            itemColor = MaterialTheme.colors.onSurface.copy(0.7f),
            itemSelectedColor = MaterialTheme.colors.primary,
            shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp),
            selectedRoute = currentRoute
        ){

        }

    }


}