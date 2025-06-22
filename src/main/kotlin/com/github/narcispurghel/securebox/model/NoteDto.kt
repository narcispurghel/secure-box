package com.github.narcispurghel.securebox.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime

@Schema(description = "Notes")
data class NoteDto(
    @field:Schema(readOnly = true, description = "Auto Generated")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    val id: Long? = null,
    @field:Schema(defaultValue = "1")
    val userId: Long,
    @field:Schema(defaultValue = "My first note")
    val title: String? = null,
    @field:Schema(defaultValue = "This is my first note")
    val content: String? = null,
    val autoDestroyAfterRead: Boolean? = false,
    val expiresAt: LocalDateTime? = LocalDateTime.now().plusYears(10),
    @field:Schema(readOnly = true, description = "Auto Generated")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    val updatedAt: LocalDateTime? = LocalDateTime.now(),
    @field:Schema(readOnly = true, description = "Auto Generated")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    val createdAt: LocalDateTime? = LocalDateTime.now(),
)
