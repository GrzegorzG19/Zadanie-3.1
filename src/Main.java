public class Main {
    public static void main(String[] args) {

        Book ksiazka1 = new Book("Wiedzmin 1", 120, "Fantasy");
        Book ksiazka2 = new Book("Solaris", 400, "SCI-FI");

        System.out.println("książka: " + ksiazka1.tytul + " strony: " + ksiazka1.strony + " rodzaj: " + ksiazka1.rodzaj);
        System.out.println("książka: " + ksiazka2.tytul + " strony: " + ksiazka2.strony + " rodzaj: " + ksiazka2.rodzaj);

    }
    }