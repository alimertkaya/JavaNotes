public class Reader {
    String name;
    int age;
    char gender;
    Book[] booksRead;

    public Reader(String name, int age, char gender, Book[] booksRead) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.booksRead = booksRead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Book[] getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(Book[] booksRead) {
        this.booksRead = booksRead;
    }

    public void read(Book book) {
        System.out.println("The name of the book read is " + book.title);
    }

}
