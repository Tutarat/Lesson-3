

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book book;
        book = new Book("ivanov","pervaia",30,20);
        books[0] = book;
        Book book1;
        book1 = new Book("Mumu");
        books[0] = book1;

        Reader reader = new Reader();
        Book book2 = new Book("Pushkin","Rasskazi",10,50);

        reader.choiseBook(books);

        reader.readBook(book);

       int res = reader.gradeBook(book1);
        System.out.println("Оценка = "+res);


    }
}

