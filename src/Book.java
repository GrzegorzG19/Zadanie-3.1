public class Book {
    String name;
    int pages;
    String genre;

    Book(String tl, int st, String rj){
        name = tl;
        pages = st;
        genre = rj;
    }


    void getinfo(String tl, int pg, String gr){
        System.out.println("book: " + tl + " pages: " + pg + " genre: " + gr);
    }
}
