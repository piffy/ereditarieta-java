package progettofigureorig;

public class Rettangolo  {
    private Punto AngoloUpSx=null;
    private double altezza;
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

  
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

  
    public Rettangolo(double x1, double y1, double b, double h)
    {   
        AngoloUpSx = new Punto(x1,y1);  
        base=b;
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
    
    public String toString(){
        return " colore = "+this.getColore()+" "+this.getAngoloUpSx().toString()+" base = "+this.getBase()+" altezza = "+this.getAltezza();
    }


}