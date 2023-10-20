package lab1.task13;

import lab1.task16.Book;

import java.util.Objects;

public class ProgramerBook extends Book {

    private String language;
    private int level;

    public ProgramerBook(){

    }

    public ProgramerBook(String title, String author, int price, int edition, String language, int level){
        super(title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + language + "][" + level + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgramerBook that = (ProgramerBook) o;
        return level == that.level && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }
}

