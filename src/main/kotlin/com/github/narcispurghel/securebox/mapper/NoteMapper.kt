package com.github.narcispurghel.securebox.mapper

import com.github.narcispurghel.securebox.entity.Note
import com.github.narcispurghel.securebox.model.NoteDto
import java.time.LocalDateTime

object NoteMapper {

    fun toEntity(req: NoteDto): Note {
        return Note(
            userId = req.userId,
            title = req.title,
            encryptedContent = req.content,
            autoDestroyAfterRead = req.autoDestroyAfterRead == true,
            expiresAt = req.expiresAt,
            updatedAt = LocalDateTime.now(),
            createdAt = LocalDateTime.now(),
        )
    }

    fun toDto(note: Note): NoteDto {
        return NoteDto(
            id = note.id,
            userId = note.userId,
            title = note.title,
            autoDestroyAfterRead = note.autoDestroyAfterRead,
            content = note.encryptedContent,
            expiresAt = note.expiresAt,
            updatedAt = note.updatedAt,
            createdAt = note.createdAt
        )
    }

}