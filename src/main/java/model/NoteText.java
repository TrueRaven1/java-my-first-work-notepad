package model;

public class NoteText {
private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void printText() {
        System.out.println(text);
        System.out.println("__________________________");
    }
}
