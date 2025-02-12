package com.example.NotesApp.controller;

import com.example.NotesApp.model.Note;
import com.example.NotesApp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();

    }

    @PostMapping
    public Note createNote(@Valid @RequestBody Note note, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid note data");

        }
        return noteRepository.save(note);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable String id, @Valid @RequestBody Note noteDetails, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid note data");
        }
        Note note = noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found"));
        note.setTitle(noteDetails.getTitle());
        note.setDescription(noteDetails.getDescription());
        note.setTag(noteDetails.getTag());
        return noteRepository.save(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable String id) {
        noteRepository.deleteById(id);
    }
}


