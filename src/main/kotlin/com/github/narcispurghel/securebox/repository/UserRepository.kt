package com.github.narcispurghel.securebox.repository

import com.github.narcispurghel.securebox.entity.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : ReactiveCrudRepository<User, Long> {

    suspend fun save(user: User): User

}