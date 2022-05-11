package com.example.userinfo

import com.google.firebase.database.Exclude

class adduser(
    var name: String? = "",
    var username: String? = "",
    var email: String? = "",
    var phone: String? = "",
    var password: String? = "",
)
{

    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "name" to name,
            "username" to username,
            "email" to email,
            "phone" to phone,
            "password" to password
        )
    }
}
