package lsp.apres;

public class Mainlsp2 {
    public static void main(String[] args) {
        System.out.println("=== RESPECT LSP (Square et Rectangle implémentent Shape) ===");
        
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(5);
        
        System.out.println("Rectangle(5,4) : Aire = " + rectangle.getArea());
        System.out.println("Square(5) : Aire = " + square.getArea());
        
        // Maintenant on peut les utiliser polymophiquement
        Shape[] formes = { new Rectangle(3, 7), new Square(4) };
        for (Shape forme : formes) {
            System.out.println("Aire de la forme : " + forme.getArea());
        }
    }
}