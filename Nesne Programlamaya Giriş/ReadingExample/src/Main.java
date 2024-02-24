public class Main {

    public static void main(String[] args) {

        Reader reader1 = new Reader();
        reader1.name = "Galadriel";

        Book book1 = new Book();
        book1.title = "The Lord of The Rings";

        Author author1 = new Author();
        author1.name = "Tolkien";

        book1.author = author1;
        reader1.booksRead = new Book[5];
        reader1.booksRead[0] = book1;

        reader1.read(book1);

        System.out.println("Name of reader reader1's first book is " + reader1.booksRead[0].title);
        System.out.println("Name of reader reader1's first book's author is " + reader1.booksRead[0].author.name);

    }
}