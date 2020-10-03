package Objects_and_Classes_Exercise_06.Articles_02;

public class Commands {
    private String title;
    private String content;
    private String author;

    public Commands(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String content) {

        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void rename(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",
                this.getTitle(),
                this.getContent(),
                this.getAuthor()
        );
    }
}
