// Fichier : SRP/avant/Book.java
// Exemple VIOLANT le principe SRP

package srp.avant;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Responsabilité 1 : Gérer les données du livre
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }

    // Responsabilité 2 : Afficher le livre (présentation) -> NE DEVRAIT PAS ÊTRE ICI
    public void printToScreen() {
        System.out.println("Titre: " + title);
        System.out.println("Auteur: " + author);
        System.out.println("Contenu: " + content);
    }

    // Responsabilité 3 : Sauvegarder le livre (persistance) -> NE DEVRAIT PAS ÊTRE ICI
    public void saveToDatabase() {
        System.out.println("Sauvegarde du livre '" + title + "' en base de données...");
    }

    // Responsabilité 4 : Logique métier (emprunt) -> NE DEVRAIT PAS ÊTRE ICI
    public void emprunter(String lecteur) {
        System.out.println("Emprunt du livre '" + title + "' par " + lecteur);
    }
}