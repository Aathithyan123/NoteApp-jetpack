package com.love.noteapp.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState
import com.love.noteapp.feature_note.domain.use_case.AddNote
import com.love.noteapp.feature_note.domain.util.NoteOrder

sealed class AddEditNoteEvent{
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote:AddEditNoteEvent()
}
