package com.github.narcispurghel.securebox.service

import com.github.narcispurghel.securebox.model.NoteDto

interface NoteService {

    suspend fun persist(req: NoteDto): NoteDto

}