package srp.apres;

// Classe ayant une SEULE responsabilité : la logique métier
public class BookBusinessLogic {
    
    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }
    
    // On peut ajouter d'autres règles métier SANS toucher aux autres classes
    public void rendre(BookSRP book, String lecteur) {
        System.out.println("Retour du livre '" + book.getTitle() + "' par " + lecteur);
    }
}