package com.github.narcispurghel.securebox.mapper

import com.github.narcispurghel.securebox.entity.User
import com.github.narcispurghel.securebox.model.SignupRequest

object UserMapper {

    fun toEntity(req: SignupRequest): User {
        return User(
            email = req.email,
            passwordHash = req.password
        )
    }

}