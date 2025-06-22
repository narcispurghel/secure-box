package com.github.narcispurghel.securebox.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("notes")
data class Note(
    @Id
    val id: Long? = null,

    val userId: Long,

    val title: String? = null,

    val encryptedContent: String? = null,

    val autoDestroyAfterRead: Boolean = false,

    val expiresAt: LocalDateTime? = LocalDateTime.now().plusYears(10),

    val updatedAt: LocalDateTime? = LocalDateTime.now(),

    val createdAt: LocalDateTime? = LocalDateTime.now()
)