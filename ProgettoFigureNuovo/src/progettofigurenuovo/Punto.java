package progettofigurenuovo;
/**
 *
 * @author gabri
 */
public class Punto implements Pubblicabile{
    private   double x;
    private   double y;
    static final private double EPSILON=0.0000001;
    
    /**
     * costruttore di default
     */
    public Punto() {
        this.x=0.0;
        this.y=0.0;
    } 
    /**
     * costrutore con parametri
     * @param x ascissa
     * @param y ordinata
     */
    public Punto(double x, double y) { 
        setX(x);
        setY(y);
    }
    /**
     * costruttore di copia
     * @param px punto
     */
    public Punto(Punto px) {
        this.x=px.getX();
        this.y=px.getY();
    }
    public void setX (double x){ 
        this.x=x;
    }
    public void setY (double y){ 
        this.y=y; 
    }
    public double getX(){ 
        return x; 
    }
    public double getY(){ 
        return y; 
    }
    /**
     * metodo che calcola la distanza tra due punti
     * @param p secondo punto
     * @return distanza tra due punti
     */
    public double distanza (Punto p) {
        double dx = x-p.getX();
        double dy = y-p.getY();
        return Math.sqrt((dx*dx)+(dy*dy));
    }
    public boolean equals (Punto p) {
        return (Math.abs(x-p.x)<EPSILON && Math.abs(y-p.y)<EPSILON);
    } 
    @Override
    public String toString(){
        return "("+x+";"+y+")";
    }
    
    public Punto clone() 
    {
        Punto p=new Punto();
        p.setX(this.getX());
        p.setY(this.getY());
        return p;
    }

    public String toHtml() {
        return "<b>("+x+";"+y+")</b>";
    }


 }

