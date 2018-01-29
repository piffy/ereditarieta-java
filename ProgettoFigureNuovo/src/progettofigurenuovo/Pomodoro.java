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
public class Pomodoro implements Pubblicabile{
    private double peso;
    private double prezzoAlKilo;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrezzoAlKilo() {
        return prezzoAlKilo;
    }

    public void setPrezzoAlKilo(double prezzoAlKilo) {
        this.prezzoAlKilo = prezzoAlKilo;
    }

    public Pomodoro(double peso, double prezzoAlKilo) {
        this.peso = peso;
        this.prezzoAlKilo = prezzoAlKilo;
    }
    
    @Override
    public String toString() {
        return "Pomodoro" + this.getPeso()+" "+ this.getPrezzoAlKilo();
    }

    @Override
    public String toHtml() {
        return "<b>Pomodoro" + this.getPeso()+" "+ this.getPrezzoAlKilo()+ "</b> ";
    }

    
    
    
    
}
