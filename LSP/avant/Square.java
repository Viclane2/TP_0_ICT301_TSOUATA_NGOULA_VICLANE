package lsp.avant;

// CARRE qui hérite de RECTANGLE - VIOLATION LSP
public class Square extends Rectangle {
    
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // VIOLATION : change aussi la hauteur
    }
    
    @Override
    public void setHeight(int height) {
        super.setWidth(height);  // VIOLATION : change aussi la largeur
        super.setHeight(height);
    }
}