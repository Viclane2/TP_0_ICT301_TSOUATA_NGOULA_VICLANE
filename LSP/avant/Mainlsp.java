package lsp.avant;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== VIOLATION LSP (Square extends Rectangle) ===");
        
        // Test avec un Rectangle normal
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Rectangle 5x4 : Aire = " + rectangle.getArea() + " (OK)");
        
        // Test avec un Square utilisé comme Rectangle
        Rectangle carreCommeRectangle = new Square(); // Substitution
        carreCommeRectangle.setWidth(5);
        carreComqueRectangle.setHeight(4); // On s'attend à 5x4=20
        
        System.out.println("Square(5) utilisé comme Rectangle.setHeight(4) : Aire = " + 
                          carreCommeRectangle.getArea() + " (PROBLEME!)");
        System.out.println("Attendu: 20 (5x4), Obtenu: " + carreCommeRectangle.getArea());
    }
}