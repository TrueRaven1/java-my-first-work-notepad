import model.*;

public class WorkWithNote {
    public static void main(String[] args) {

        User den = new User("den@inbox.lv", "1234");
        User dana = new User("dana@one.lv", "krasotka");

        Category workNotes = new Category(CategoryName.WORKNOTES);
        Category lectureNotes = new Category(CategoryName.LECTURENOTES);
        Category trainingNotes = new Category(CategoryName.TRAININGNOTES);
        Category shoppingNotes = new Category(CategoryName.SHOPINGNOTES);
        Category differentNotes = new Category(CategoryName.OTHERNOTES);

        NotesConstructor fistNote = new NotesConstructor(den, CategoryName.WORKNOTES);
        NotesConstructor secondNote = new NotesConstructor(dana, CategoryName.SHOPINGNOTES);
        NotesConstructor thirdNote = new NotesConstructor(den, CategoryName.TRAININGNOTES);

        NoteText tasksToDoOnWork = new NoteText();
        tasksToDoOnWork.setText("Sdelatj otcheti, proveritj plan, soglasovatj eksport");

        NoteText secondWorkShop = new NoteText();
        secondWorkShop.setText("WorkShop, 04.04.2021, JavaScript");

        NoteText shoditjVKachalku = new NoteText();
        shoditjVKachalku.setText("Ponedeljnik: Kardio trenirovka. Sreda: Nogi, plechi. Pjatnica: Grudj, ruki.");

        System.out.println(den.getEmail() + " " + den.getPassword());
        System.out.println("Work notes : " + workNotes.getName());
        System.out.println(tasksToDoOnWork.getText());
        dana.printUserInfo();
        System.out.println("Lecture notes : " + lectureNotes.getName());
        secondWorkShop.printText();
        System.out.println("Training notes : " + trainingNotes.getName());
        shoditjVKachalku.printText();
        System.out.println("Shopping notes : " + shoppingNotes.getName());
        System.out.println("Different notes : " + differentNotes.getName());

        fistNote.getUser().printUserInfo();

    }
}
