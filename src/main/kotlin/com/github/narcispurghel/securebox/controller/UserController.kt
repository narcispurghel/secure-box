package com.github.narcispurghel.securebox.controller

import com.github.narcispurghel.securebox.entity.User
import com.github.narcispurghel.securebox.model.SignupRequest
import com.github.narcispurghel.securebox.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {

    @PostMapping
    suspend fun signup(@RequestBody req: SignupRequest): User {
        return userService.persist(req)
    }

}