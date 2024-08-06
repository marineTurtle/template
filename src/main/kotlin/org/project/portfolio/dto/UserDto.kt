package org.project.portfolio.dto

import org.project.portfolio.entity.User

data class UserDto (
    val email: String,
    val phone: String,
    val name: String,
    val password: String
)
{
    fun toEntity(): User {
        return User(email = email, phone = phone, name = name, password = password)
    }
}