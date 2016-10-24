
/* Classe Carte décrivant l'envionnement
 * [0][0]  désigne le coin supérieur gauche de la matrice
 * [nbLignes][0]   le coin inférieur gauche et
 * [0][nbColonnes] le coin supérieur droit
 */

public class Carte {

    /* Attributs */
    private int tailleCases;

    private int nbLignes;

    private int nbColonnes;

    private Case[][] matrice;


    /* Accesseurs */
    public int getTailleCases(){
        return this.tailleCases;
    }

    public int getNbLignes(){
        return this.nbLignes;
    }

    public int getNbColonnes(){
        return this.nbColonnes;
    }

    public Case getCase(int ligne, int colonne){
        if (ligne > this.getNbLignes())
            throw new IllegalArgumentException("ligne > NbLignes");
        if (colonne > this.getNbColonnes())
            throw new IllegalArgumentException("colonne > nbColonnes");
        return this.matrice[ligne][colonne];
    }


    /**
     * Constructeur
     * Modification de la carte interdite après création
     * @param t taille d'une Case
     * @param l nombre de ligne de la carte
     * @param c nombre de colonnes de la carte
     */
    public Carte(int t, int l, int c){
        this.tailleCases = t;
        this.nbLignes = l;
        this.nbColonnes = c;
        this.matrice = new Case[l][c];
    }


    /* Méthodes particulières */

    /**
     * Booléen : Existance du voisin dans la direction spécifiée
     * @param src Case de départ
     * @param dir Direction du voisin à tester
     */
    public boolean voisinExiste(Case src, Direction dir){
        switch (dir){
            case NORD:
                if (src.getLigne() - 1 < 0) return false;
                break;
            case SUD:
                if (src.getLigne() + 1 > this.getNbLignes()) return false;
                break;
            case EST:
                if (src.getColonne() + 1 > this.getNbColonnes()) return false;
                break;
            case OUEST:
                if (src.getColonne() - 1 < 0) return false;
                break;
            default:
                // Cas impossible
        }
        return true;
    }

    /**
     * Renvoie le voisin de la case donnée dans la direction spécifiée
     * @param src Case de départ
     * @param dir Direction de recherche du Voisin
     */
    public Case getVoisin(Case src, Direction dir){
        if ( !voisinExiste(src, dir) )
            throw new IllegalArgumentException("Ce voisin n'existe pas");
        else {
            switch (dir){
                case NORD:
                    return this.getCase(src.getLigne() - 1, src.getColonne());
                case SUD:
                    return this.getCase(src.getLigne() + 1, src.getColonne());
                case EST:
                    return this.getCase(src.getLigne(), src.getColonne() + 1);
                case OUEST:
                    return this.getCase(src.getLigne(), src.getColonne() - 1);
                default:
                    // Cas impossible
            }
        }
    }
}
