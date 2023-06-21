package src.Project;

public class BookInfo_2020011767 {

    private String title;
    private String genre;
    private String author;
    private String publisher;
    private int yearPublication;
    private int count;

    public BookInfo_2020011767(String genre, String author, String publisher, int yearPublication, int count) {
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
        this.yearPublication = yearPublication;
        this.count = count;
    }

    public String getTitle() {
        return this.title;
    }
    public String getGenre() {
        return this.genre;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getPublisher() {
        return this.publisher;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public int getCount() {
        return this.count;
    }
    public void addCount(int addingCount) {
        this.count += addingCount;
    }
    public void subCount(int subCount) {
        this.count -= subCount;
    }
}
