package com.github.narcispurghel.securebox.service.impl

import com.github.narcispurghel.securebox.entity.User
import com.github.narcispurghel.securebox.mapper.UserMapper
import com.github.narcispurghel.securebox.model.SignupRequest
import com.github.narcispurghel.securebox.repository.UserRepository
import com.github.narcispurghel.securebox.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepo: UserRepository
) : UserService {

    override suspend fun persist(req: SignupRequest): User {
        return userRepo.save(UserMapper.toEntity(req))
    }

}