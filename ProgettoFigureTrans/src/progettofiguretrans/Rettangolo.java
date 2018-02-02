package progettofiguretrans;

public class Rettangolo extends Quadrato {
   private double altezza;

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

  
    public Rettangolo(double x1, double y1, double b, double h)
    {   super(x1,y1,b);  altezza=h;  }

    public Rettangolo()
    { 
        this(0,0,2,1);
    }

    public double Perimetro() {
        return 2*(this.getBase()+this.getAltezza());
    }

    public double Area() {
        return this.getBase()*this.getAltezza();
    }
    
    public String toString(){
        return super.toString()+" altezza = "+this.getAltezza();
    }


}