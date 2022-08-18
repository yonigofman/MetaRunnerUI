package com.yonigofman.metarunner_bottom_nav.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yonigofman.metarunner_bottom_nav.BottomNavScreen

@Composable
fun MetaRunnerBottomNavigation(
    items: List<BottomNavScreen>,
    backgroundColor: Color,
    itemColor: Color,
    itemSelectedColor: Color,
    shape: RoundedCornerShape = RoundedCornerShape(15.dp),
    selectedRoute :String,
    onItemSelected: (BottomNavScreen) -> Unit

) {




    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(backgroundColor)
            .padding(vertical = 5.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,

    ){

        items.forEach{

            val isSelected = it.route==selectedRoute
            val color = if(isSelected) itemColor else itemSelectedColor
            
            IconButton(onClick = {

                if(!isSelected)
                    onItemSelected(it)

            }) {
                Icon(
                    imageVector = it.icon,
                    contentDescription = null,
                    tint = color
                )

            }
        }
    }

}

//@Preview
//@Composable
//fun MetaRunnerBottomNavigationPrev() {
//
//    val home = BottomNavScreen(route = "home","Home",Icons.Rounded.Home)
//    val profile = BottomNavScreen(route = "profile","Profile",Icons.Rounded.Person)
//    val settings = BottomNavScreen(route = "settings","Settings",Icons.Rounded.Settings)
//
//    val items = listOf<BottomNavScreen>(home, profile,settings)
//
//
//    MetaRunnerBottomNavigation(
//        items = items,
//        backgroundColor = Color.White,
//        itemColor = Color.Blue,
//        itemSelectedColor = Color.Red
//    )
//
//
//}
