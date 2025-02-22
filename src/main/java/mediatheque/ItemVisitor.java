package mediatheque;

public interface ItemVisitor {
    void visit(Book livre);
    void visit(CD disque);
}