package Objects_and_Classes_Exercise_06.Articles_2_04;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
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
