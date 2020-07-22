package Objects_and_Classes_Exercise_06.Articles_2_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        List<Article> articles = new ArrayList<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String input = reader.readLine();

        switch (input) {
            case "title":
                articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .forEach(System.out::println);
                break;
            case "content":
                articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getContent))
                        .forEach(System.out::println);
                break;
            case "author":
                articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(System.out::println);
                break;
        }
    }
}
