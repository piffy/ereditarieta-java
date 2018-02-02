package progettofiguretrans;

public class Figura {
    private String colore;

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String toString(){
        return " colore = "+this.getColore();
    }

}
