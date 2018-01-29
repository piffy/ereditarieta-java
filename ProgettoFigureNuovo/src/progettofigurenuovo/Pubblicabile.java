package progettofigurenuovo;

/** Interfaccia che indica i metodi obbligatori perchè una classe sia pubblicabile
 * sul web.
 *
 * @author gabri_
 */
public interface Pubblicabile {
    /** Restituisce la stringa che rappresenta in HTML l'oggetto da pubblicare
     * 
     * @return stringa HTML 
     */
    public String toHtml();   
}
