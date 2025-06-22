package com.github.narcispurghel.securebox.service.impl

import com.github.narcispurghel.securebox.mapper.NoteMapper
import com.github.narcispurghel.securebox.model.NoteDto
import com.github.narcispurghel.securebox.repository.NoteRepository
import com.github.narcispurghel.securebox.service.NoteService
import org.springframework.stereotype.Service

@Service
class NoteServiceImpl(
    private val noteRepository: NoteRepository,
) : NoteService {

    override suspend fun persist(req: NoteDto): NoteDto {
        val saved = noteRepository.save(NoteMapper.toEntity(req))
        return NoteMapper.toDto(saved)
    }

}