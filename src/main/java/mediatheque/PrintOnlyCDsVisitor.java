package mediatheque;

public class PrintOnlyCDsVisitor implements ItemVisitor {

    @Override
    public void visit(CD cd) {
        System.out.println("CD : " + cd.getTitle() + " " + cd.getNumberOfTracks());
    }

    @Override
    public void visit(Book livre) {
    }

}