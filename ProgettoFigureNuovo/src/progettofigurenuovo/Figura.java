/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofigurenuovo;

/**
 *
 * @author gabri_
 */
public abstract class Figura {
    private String colore;

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public Figura(String colore) {
        this.colore = colore;
    }
    public Figura(){
        this.colore="Nero";
    }
    
    public abstract double Perimetro();
    
    public abstract double Area();
    
    public String toString(){
        return " colore = "+this.getColore();
    }
    
}
