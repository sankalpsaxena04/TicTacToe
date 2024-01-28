package com.sandeveloper.tictactoe.data

import kotlinx.serialization.Serializable
//tell server at which position client make the turn
@Serializable
data class MakeTurn(
    val x:Int,
    val y:Int
)