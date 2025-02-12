package com.example.NotesApp.repository;

import com.example.NotesApp.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
