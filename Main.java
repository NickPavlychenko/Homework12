import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println();
        Author author1 = new Author("Лев Толстой");
        Author author2 = new Author("Михаил Булгаков");

        Book book1 = new Book("Война и Мир ", author1, 1867);
        Book book2 = new Book("Мастер и Маргарита", author2, 1940);

        System.out.println(book1);
        System.out.println();

        System.out.println(book2);
        System.out.println();

        book2.setPublishingYear(1950);
        System.out.println(book2);
        System.out.println();

        Book book3 = new Book("Война и Мир ", new Author("Лев Толстой"), 1867);
        System.out.println("Книга 1 равна Книге 2? " + book1.equals(book3));
        System.out.println();

        HashSet<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println("Количество уникальных книг в HashSet: " + books.size());
    }
}