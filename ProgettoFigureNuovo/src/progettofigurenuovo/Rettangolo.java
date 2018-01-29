/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progettofigurenuovo;

public class Rettangolo extends Quadrato implements Cloneable {
    private double altezza;
    
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

  
    public Rettangolo(double x1, double y1, double b, double h)
    {   
        super(x1,y1,b);  
        altezza=h;
    }

    public Rettangolo()
    { 
        this(0,0,2,1);
    }


    public double perimetro() {
        return 2*(this.getBase()+this.getAltezza());
    }

    public double area() {
        return this.getBase()*this.getAltezza();
    }
    
    public Rettangolo Clone()
    {
        Rettangolo r=new Rettangolo();
        r.setAltezza(this.getAltezza());
        return r;
    }
    
    public String toString(){
        return super.toString()+" altezza = "+this.getAltezza();
    }


}