/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettofigurenuovo;

/** classe che consente di pubblicare una serie di articoli sul web
 *
 * @author gabri_
 */
public class Pubblicatore {
    private Pubblicabile[] articoli;
    /** costruttore istanzia l'array di articoli
     * 
     * @param dimensione dimensione dell'array 
     */
    public Pubblicatore(int dimensione) {
        this.articoli = new Pubblicabile[dimensione];
    }
    /** consente di aggiungere un articolo all'array
     * 
     * @param p articolo da aggiungere
     * @return 
     */
    public boolean  aggiungi(Pubblicabile p){
        boolean inserito=false;
        for (int i=0;i<articoli.length && !inserito;i++){
            if (articoli[i]==null){
                articoli[i]=p;
                inserito=true;
            }
        }
        return inserito;
        
    }
    
    /** pubblica sul web gli articoli esistenti
     * 
     */
    public void pubblica(){
        for (int i=0;i<articoli.length;i++){
            if (this.articoli[i]!=null){
                //........
                System.out.println(this.articoli[i].toHtml());
            }
        }
    }
    
    
    
    
}
