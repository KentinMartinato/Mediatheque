package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new Book("J.K. Rowling", "Harry Potter"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));
        mediatheque.addItem(new CD(10, "All In A Blaze"));
        mediatheque.addItem(new CD(5, "YellowJacket"));
        mediatheque.printCatalog();
        System.out.println("LIST OF AVAILABLE BOOKS");
        mediatheque.printOnlyBooks();
        System.out.println("LIST OF AVAILABLE CDS");
        mediatheque.printOnlyCDs();
    }
}
