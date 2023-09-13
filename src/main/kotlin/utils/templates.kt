package utils

import java.awt.Graphics2D

var currID: Int = 0

/*
 * Remember to call register() inside the init{...} block of a drawObject or physicsObject
 * ---> override val uuid: Int = register()
 * This sets the object with a UUID and updates the global UUID
 * If an object's UUID isn't set, the window get very confused and scared (no good)
 */

fun register() : Int {
    ++currID
    return (currID - 1)
}

interface drawObject {
    fun draw(wind: epWindow)
    val uuid: Int
}

interface physicsObject {
    val uuid: Int
}