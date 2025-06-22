package com.github.narcispurghel.securebox.repository

import com.github.narcispurghel.securebox.entity.Note
import com.github.narcispurghel.securebox.entity.User
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest
import org.springframework.test.context.ActiveProfiles

const val USER_EMAIL = "test@email.com"
const val USER_PASSWORD = "test1234"
const val NOTE_TITLE = "first note"
const val NOTE_CONTENT = "this is my first note"

@ActiveProfiles("test")
@DataR2dbcTest
class NoteRepositoryTest @Autowired constructor(
    private val noteRepository: NoteRepository,
    private val userRepository: UserRepository
) {
    @Test
    fun `should save a note`() {
        runBlocking {
            val user = User(email = USER_EMAIL, passwordHash = USER_PASSWORD)
            val savedUser = userRepository.save(user)
            assertNotNull(savedUser)
            assertNotNull(savedUser.id)
            assertEquals(USER_EMAIL, savedUser.email)
            assertEquals(USER_PASSWORD, savedUser.passwordHash)
            assertNotNull(savedUser.updatedAt)
            assertNotNull(savedUser.createdAt)
            val note = Note(
                userId = savedUser.id!!,
                title = NOTE_TITLE,
                encryptedContent = NOTE_CONTENT
            )
            val savedNote = noteRepository.save(note)
            assertNotNull(savedNote)
            assertNotNull(savedNote.id)
            assertNotNull(savedNote.expiresAt)
            assertNotNull(savedNote.updatedAt)
            assertNotNull(savedNote.createdAt)
            assertEquals(NOTE_TITLE, savedNote.title)
            assertEquals(NOTE_CONTENT, savedNote.encryptedContent)
        }
    }
}