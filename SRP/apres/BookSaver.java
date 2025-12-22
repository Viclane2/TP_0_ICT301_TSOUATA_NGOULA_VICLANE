package srp.apres;

// Classe ayant une SEULE responsabilité : la sauvegarde
public class BookSaver {
    
    public void saveToDatabase(BookSRP book) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' en base de données...");
    }
    
    // On peut ajouter d'autres méthodes de sauvegarde SANS toucher aux autres classes
    public void saveToFile(BookSRP book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans le fichier: " + filename);
    }
}