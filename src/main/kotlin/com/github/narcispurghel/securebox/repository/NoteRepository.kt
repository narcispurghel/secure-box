package com.github.narcispurghel.securebox.repository

import com.github.narcispurghel.securebox.entity.Note
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface NoteRepository : ReactiveCrudRepository<Note, Long> {

    suspend fun save(note: Note): Note

}