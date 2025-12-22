package ocp.apres;

// CLASSE FERMÉE À LA MODIFICATION : on ne la modifiera JAMAIS pour de nouvelles formes
public class AreaCalculator2 {
    
    // Méthode OUVERTE À L'EXTENSION via l'interface Shape
    public double calculateArea(Shape shape) {
        return shape.calculateArea();  // Délégation au polymorphisme
    }
}