public class Main {
    public static void main(String[] args) {

        Book literature1 = new Book("Wiedzmin 1", 120, "Fantasy");
        Book literature2 = new Book("Solaris", 400, "SCI-FI");

        literature1.getinfo(literature1.name, literature1.pages, literature1.genre);
        literature2.getinfo(literature2.name, literature2.pages, literature2.genre);


    }
    }