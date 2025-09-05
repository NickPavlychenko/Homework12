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

        System.out.println("Название книги - " + book1.getBookName() + " Автор - " + book1.getAuthor() + " Год публикаци - " + book1.getPublishingYear() + "г.");
        System.out.println();

        System.out.println("Название книги - " + book2.getBookName() + " Автор - " + book2.getAuthor() + " Год публикаци - " + book2.getPublishingYear() +"г.");
        System.out.println();

        book2.setPublishingYear(1950);
        System.out.println("Название книги - " + book2.getBookName() + " Автор - " + book2.getAuthor() + " Год публикаци - " + book2.getPublishingYear() + "г.");
    }
}