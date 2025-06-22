package com.github.narcispurghel.securebox.controller

import com.github.narcispurghel.securebox.model.NoteDto
import com.github.narcispurghel.securebox.service.NoteService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/notes")
class NoteController(
    private val noteService: NoteService
) {

    @PostMapping
    suspend fun create(@RequestBody req: NoteDto): ResponseEntity<NoteDto> {
        return ResponseEntity.status(201).body(noteService.persist(req))
    }

}