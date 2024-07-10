public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("J.R.R. Tolkien");

        Book book1 = new Book("The Lord of The Rings",1026,"Fantasy Fiction",true,524,author1);

        Reader reader1 = new Reader("Galadreil",8000,'F', new Book[5]);

        reader1.booksRead[0] = book1;

        reader1.read(book1);

        System.out.println("Name of reader reader1's first book is " + reader1.booksRead[0].title);
        System.out.println("Name of reader reader1's first book's author is " + reader1.booksRead[0].author.name);

    }
}