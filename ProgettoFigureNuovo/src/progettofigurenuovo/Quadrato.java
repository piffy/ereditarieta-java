/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofigurenuovo;


public class Quadrato extends Figura implements Cloneable,Pubblicabile{
    private Punto AngoloUpSx=null;
    private double base;
    
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
        super();
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
    
    public Quadrato Clone()
    {
        Quadrato q=new Quadrato();
        q.setBase(this.getBase());
        q.setAngoloUpSx(this.getAngoloUpSx().clone());
        return q;
    }
    

    public String toString(){
        return super.toString()+" "+this.getAngoloUpSx().toString()+" lato = "+this.getBase();
    }
    
    public String toHtml(){
        return "<b>"+super.toString()+"</b><br><b>"+this.getAngoloUpSx().toString()+"</b><br></b>lato = "+this.getBase()+"</b>";
    } 		 
}
