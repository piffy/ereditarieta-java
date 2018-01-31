/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofigureorig;


public class Triangolo
{    
    private Punto p1;
    private Punto p2;
    private Punto p3;    
    private String colore;

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }


    
    
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
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
        this.colore="Nero";
    }

    public Triangolo(Punto p1, Punto p2, Punto p3, String colore) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.colore = colore;
    }
    

    public double Perimetro()  
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
        return " colore = "+this.getColore()+"PERIMETRO: "+this.Perimetro();
    }
    
    public String toHtml(){
        return "<b>colore = "+this.getColore()+"</b><br></b>PERIMETRO: "+this.Perimetro() + "</b>";
    }
    
    
}