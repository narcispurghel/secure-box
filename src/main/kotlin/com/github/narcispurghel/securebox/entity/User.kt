package com.github.narcispurghel.securebox.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("users")
data class User(
    @Id
    val id: Long? = null,

    val email: String,

    val passwordHash: String,

    val updatedAt: LocalDateTime? = LocalDateTime.now(),

    val createdAt: LocalDateTime? = LocalDateTime.now()
)
