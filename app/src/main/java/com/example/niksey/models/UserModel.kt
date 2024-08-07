package com.example.niksey.models

/* Модель для User*/

data class UserModel(
    val id: String = "",
    var username: String = "",
    var bio: String = "",
    var fullname: String = "",
    var state: String = "",
    var phone: String = "",
    var photoUrl: String = "empty",
    var email: String = "",
    var password: String = ""
)