/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofigurenuovo;

/**
 *
 * @author p.cerchiari
 */
public class Triangolo extends Figura implements Cloneable
{    
    private Punto p1;
    private Punto p2;
    private Punto p3;    

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = new Punto(p1);
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = new Punto(p2);
    }

    public Punto getP3() {
        return p3;
    }

    public void setP3(Punto p3) {
        this.p3 = new Punto(p3);
    }
    
    public Triangolo()
    {
        this(new Punto(1,1),new Punto(0,1),new Punto(1,0));
    }

    public Triangolo(Punto p1, Punto p2, Punto p3) 
    {	
        super();
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
    }

    public double Perimetro()  //overrides overriding 
    { 
        double l1= this.p1.distanza(this.getP2());
        double l2= this.p1.distanza(this.getP3());
        double l3= this.p2.distanza(this.getP3());
        return l1+l2+l3;
    } 
    
    public double Area()
    {
        double p=this.Perimetro();
        return Math.sqrt(p/2*(p/2-this.p1.distanza(this.getP2()))*(p/2-this.p1.distanza(this.getP3()))*(p/2-this.p2.distanza(this.getP3())));
    }
    

    public String toString(){
        return super.toString()+"PERIMETRO: "+this.Perimetro();
    }
    
    public Triangolo Clone()
    {
        Triangolo t= new Triangolo();
        t.setP1(this.getP1().clone());
        t.setP2(this.getP2().clone());
        t.setP3(this.getP3().clone());
        return t;
    }
    
}