package com.github.narcispurghel.securebox.service.impl

import com.github.narcispurghel.securebox.entity.Note
import com.github.narcispurghel.securebox.model.NoteDto
import com.github.narcispurghel.securebox.repository.NoteRepository
import com.github.narcispurghel.securebox.service.NoteService
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.any
import org.mockito.kotlin.whenever

const val ID = 1L
const val USER_ID = 2L
const val TITLE = "mock-title"
const val CONTENT = "mock-content"
const val AUTO_DESTROY = false


@ExtendWith(MockitoExtension::class)
class NoteServiceImplTest {
    private val noteRepository: NoteRepository = mock()
    private val noteService: NoteService = NoteServiceImpl(noteRepository)

    @Test
    fun `test if note is saved`() {
        runBlocking {
            val note = Note(
                id = ID,
                userId = USER_ID,
                title = TITLE,
                encryptedContent = CONTENT,
                autoDestroyAfterRead = AUTO_DESTROY
            )
            whenever(noteRepository.save(any())).thenReturn(note)
            val dto = NoteDto(
                userId = USER_ID,
                title = TITLE,
                content = CONTENT
            )
            val saved = noteService.persist(dto)
            assertNotNull(saved)
            assertNotNull(saved.updatedAt)
            assertNotNull(saved.createdAt)
            assertEquals(ID, saved.id)
            assertEquals(USER_ID, saved.userId)
            assertEquals(TITLE, saved.title)
            assertEquals(CONTENT, saved.content)
            assertFalse(saved.autoDestroyAfterRead)
        }
    }
}