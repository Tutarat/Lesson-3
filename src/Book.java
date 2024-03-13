public class Book {

    private final String name;
    private String author;
    private int numberOfSeries;
    private int numberOfLetters;

    public Book(String name, String author, int numberOfSeries, int numberOfLetters){
        this.name = name;
        this.author = author;
        this.numberOfLetters = numberOfLetters;
        this.numberOfSeries = numberOfSeries;
    }
    public Book(String name, String author, int numberOfLetters){
        this.name = name;
        this.author = author;
        this.numberOfLetters = numberOfLetters;
    }
    public Book(String name){
        this.name = name;
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String toString(){

        return "Название книги - " +name + ", автор - " +author + ", серия № - " + numberOfSeries +", количество страниц - " +numberOfLetters;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getnumberOfSeries(){
        return numberOfSeries;
    }

    public int getNumberOfLetters(){
        return numberOfLetters;
    }

}
