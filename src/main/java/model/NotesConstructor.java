package model;

import java.util.ArrayList;
import java.util.List;

public class NotesConstructor {

    private User user;
    private CategoryName category;
    private List<NoteText> noteTexts = new ArrayList<>();

    public NotesConstructor(User user, CategoryName category) {
        this.user = user;
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public CategoryName getCategory() {
        return category;
    }

    public List<NoteText> getNoteTexts() {
        return noteTexts;

//        public void addNoteText(NoteText noteText) {
//            noteTexts.add(noteText);
//        }
    }
}
