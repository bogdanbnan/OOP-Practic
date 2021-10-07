package Task3;

public class Main
{
    public static void main(String[] args)
    {
        //INITILIZATION
        Reader[] arrayReader = new Reader[2];
        arrayReader[0] = new Reader("Vasya", "Shishkin", "Molodec", 3, "Slizarin", "02.12.1848", "22323");
        arrayReader[1] = new Reader("Sasha", "Bambook", "Sosus", 5, "Slizarin", "06.05.1843", "36791");

        Book[] books = new Book[3];
        books[0] = new Book("Buratino", "Tolstoy");
        books[1] = new Book("Hoking", "Hoking");
        books[2] = new Book("SteelLikeAnArtist", "Ostin");

//RUN METHODS
        arrayReader[0].takeBook(5);
        arrayReader[0].takeBook("Buratino", "Hoking", "SteelLikeAnArtist");
        arrayReader[1].takeBook(books[0],books[1],books[2]);
        arrayReader[1].returnBook(3);
    }
}
class Reader
{
    public String firstName, lastName, middleName, faculty, birthday, phone;
    public int readNum;


    void takeBook(int bookTakeNum)
    {
        System.out.printf("%s %s. %s. take %d Books", firstName, lastName.charAt(0), middleName.charAt(0), bookTakeNum);
        System.out.println();
    }
    void takeBook(String bookFirstName, String bookSecondName, String bookThirdName)
    {
        System.out.printf("%s %s. %s. take books: %s, %s, %s", firstName, lastName.charAt(0), middleName.charAt(0), bookFirstName, bookSecondName, bookThirdName);
        System.out.println();
    }
    void takeBook(Book bookFirst, Book bookSecond, Book bookThird)
    {
        System.out.printf("%s %s. %s. take books: %s, %s, %s", firstName, lastName.charAt(0), middleName.charAt(0), bookFirst.name, bookSecond.name, bookThird.name);
        System.out.println();
    }

    void returnBook(int bookTakeNum)
    {
        System.out.printf("%s %s. %s. return %d Books", firstName, lastName.charAt(0), middleName.charAt(0), bookTakeNum);
        System.out.println();
    }

    //CONSTRUCT
    public Reader(String firstName, String middleName, String lastName, int readNum, String faculty, String birthday, String phone)
    {
        this.firstName = firstName;
        this.lastName = lastName ;
        this.middleName = middleName;
        this.readNum = readNum;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

}

class Book
{
    String name;
    String author;

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }
}