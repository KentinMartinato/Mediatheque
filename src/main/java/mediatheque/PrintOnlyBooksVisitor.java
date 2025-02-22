package mediatheque;

public class PrintOnlyBooksVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book :" + book.getTitle() + "-" + book.getAuthor());
    }

    @Override
    public void visit(CD disque) {
    }
}