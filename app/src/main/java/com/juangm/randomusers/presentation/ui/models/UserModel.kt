package com.juangm.randomusers.presentation.ui.models

import java.io.Serializable

data class UserModel(
    val id: String,
    val name: String,
    val surname: String,
    val email: String,
    val smallPicture: String,
    val normalPicture: String,
    val largePicture: String,
    val phone: String,
    val gender: String,
    val street: String,
    val city: String,
    val state: String,
    val registered: String,
    var favorite: Boolean = false
): Serializable