package srp.apres;

// Classe ayant une SEULE responsabilité : l'affichage
public class BookPrinter {
    
    public void printToScreen(BookSRP book) {
        System.out.println("=== Affichage à l'écran ===");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }
    
    // On peut ajouter d'autres méthodes d'affichage SANS toucher à BookSRP
    public void printToHTML(BookSRP book) {
        System.out.println("\n=== Génération HTML ===");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}