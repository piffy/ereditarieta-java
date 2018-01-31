/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofigureorig;


public class Quadrato{
    private Punto AngoloUpSx=null;
    private double base;
    private String colore;

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }    
    
    public Punto getAngoloUpSx() {
        return AngoloUpSx;
    }

    public void setAngoloUpSx(Punto AngoloUpSx) {
        this.AngoloUpSx = AngoloUpSx;
    }

    public Quadrato() {
        this(0,0,10);      
    }

    public Quadrato(double x1, double y1, double lato) 
    {	
        AngoloUpSx = new Punto(x1,y1); 
        base=lato;
    }

    public double Perimetro()  //overrides overriding 
    { 
        return this.getBase()*4;
    }     
    
    public double Area()
    {
        return this.getBase()*this.getBase();
    }
    

    public String toString(){
        return " colore = "+this.getColore()+" "+this.getAngoloUpSx().toString()+" lato = "+this.getBase();
    }
    
    public String toHtml(){
        return " <b>colore = "+this.getColore()+"</b><br><b> "+this.getAngoloUpSx().toString()+" lato = "+this.getBase()+" </b>";
    } 		 
}
