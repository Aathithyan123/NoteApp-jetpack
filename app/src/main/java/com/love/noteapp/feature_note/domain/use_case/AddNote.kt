package com.love.noteapp.feature_note.domain.use_case

import com.love.noteapp.feature_note.domain.model.InvalidNoteException
import com.love.noteapp.feature_note.domain.model.Note
import com.love.noteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
){

    suspend operator fun invoke(note: Note){
        @Throws(InvalidNoteException:: class)
        if (note.title.isBlank()){
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }

}