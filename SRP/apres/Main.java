package srp.apres;

// Programme de test pour la solution SRP
public class Main {
    public static void main(String[] args) {
        // 1. Création du livre (données seulement)
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        // 2. Affichage (responsabilité séparée)
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);
        
        // 3. Sauvegarde (responsabilité séparée)
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "mon_livre.txt");
        
        // 4. Logique métier (responsabilité séparée)
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Marcial");
        logic.rendre(book, "Marcial");
    }
}