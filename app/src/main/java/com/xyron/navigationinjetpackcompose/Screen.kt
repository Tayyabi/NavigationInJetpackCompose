package com.xyron.navigationinjetpackcompose


const val DETAIL_ARGUMENTS_KEY = "id"
const val DETAIL_ARGUMENTS_KEY2 = "name"

sealed class Screen(val route: String){

    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENTS_KEY}"){

        /*fun passId(id: Int): String {
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENTS_KEY}", newValue = id.toString())
        }*/

        fun passNameAndId(
            id: Int,
            name: String
        ): String{
            return "detail_screen/$id/$name"
        }
    }

}
