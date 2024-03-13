import java.util.Random;


public class Reader {


    public Book choiseBook(Book[] massiv) {
        Random book = new Random();
        return massiv[book.nextInt(2)];
    }


    public String readBook(Book book) {
        return book.toString();
    }

    public int gradeBook(Book book) {
        int grade;
        int bookname = 0;
        int bookauthor = 0;
        int bookseries = 0;
        int bookletters = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (book.getName() != null) {
            bookname = book.getName().length();
        } else {
            bookname = -randomNumber;
        }
        if (book.getAuthor() != null) {
            bookauthor = book.getAuthor().length();
        } else {
            bookauthor = -randomNumber;
        }
        if (book.getnumberOfSeries() != 0) {
            bookseries = book.getnumberOfSeries();
        } else {
            bookseries = randomNumber;
        }
        if (book.getNumberOfLetters() != 0) {
            bookletters = book.getNumberOfLetters();
        } else {
            bookletters = -randomNumber;
        }

            grade = bookname + bookauthor - bookseries + bookletters;
            return grade;

    }
}
