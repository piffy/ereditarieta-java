/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofiguretrans;

/**
 *
 * @author gabri_
 */
public class ProgettoFigureOrig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rettangolo r=new Rettangolo();
        Quadrato q=new Quadrato(0.1,2.4,12.5);
//        System.out.println(r);
        System.out.println(q);
        Triangolo t1, t2;
        t1=new Triangolo();
        t2=new Triangolo(t1.getP1(),t1.getP2(),t1.getP3());
        
        
        
    }
    
}
