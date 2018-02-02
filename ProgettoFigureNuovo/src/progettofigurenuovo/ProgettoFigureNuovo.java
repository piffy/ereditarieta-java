package progettofigurenuovo;

/**
 *
 * @author gabri_
 */
public class ProgettoFigureNuovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rettangolo r=new Rettangolo();
        Quadrato q=new Quadrato();
//        System.out.println(r);
//        System.out.println(q);
        Triangolo t1, t2;
        t2=new Triangolo();
        t1=t2.Clone();
        Pomodoro pomodoro=new Pomodoro(100,2);
        
        Pubblicatore p=new Pubblicatore(100);
        p.aggiungi(q);
        p.aggiungi(pomodoro);
        p.pubblica();
        
        
        
    }
    
}
