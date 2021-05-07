package model;

public enum CategoryName {
    WORKNOTES("Task to do"),
    LECTURENOTES("Course, date, topic"),
    TRAININGNOTES("Day of week, training type"),
    SHOPINGNOTES("What to buy"),
    OTHERNOTES("Different notes");

    private String name;

    CategoryName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
