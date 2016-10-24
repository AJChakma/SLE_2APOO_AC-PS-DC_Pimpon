
/* Classe Incendie utilisant la classe Case pour la position
 * et un entier pour définir le nombre de litres nécessaires pour l'extinction
 */

public class Incendie {

    /* Attributs */
    // Ici référence vers une case de la carte (pas de nouvelle allocation)
    private Case position;

    private int intensite;


    /* Accesseurs */
    public int getIntensite(){
        return this.intensite;
    }

    public Case getPosition(){
        return this.position;
    }

    /* Mutateurs (en privé) */
    private void setIntensite(int i){
        this.intensite = i;
    }

    private void setPosition(Case c){
        this.position = c;
    }

    /**
     * Constructeur
     * @param c référence de la case ou est positionné l'incendies
     * @param i intensite d'incendie ou le nombre de litres necessaires à son extinction
     */
    public Incendie(Case c, int i){
        setPosition(c);
        setIntensite(i);
    }


}
