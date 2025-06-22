package com.github.narcispurghel.securebox.service

import com.github.narcispurghel.securebox.entity.User
import com.github.narcispurghel.securebox.model.SignupRequest

interface UserService {

    suspend fun persist(req: SignupRequest): User

}