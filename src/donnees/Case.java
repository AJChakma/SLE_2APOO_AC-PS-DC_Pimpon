
/* Classe Case servant à définir le terrain de manière discrète.
 */

public class Case {

    /* Attributs */
    private int ligne;

    private int colonne;

    private NatureTerrain nature;


    /* Accesseurs */
    public int getLigne(){
        return this.ligne;
    }

    public int getColonne(){
        return this.colonne;
    }

    public NatureTerrain getNature(){
        return this.nature;
    }


    /* Mutateurs */
    public void setLigne(int l){
        this.ligne = l;
    }

    public void setColonne(int c){
        this.colonne = c;
    }

    public void setNature(NatureTerrain n){
        this.nature = n;
    }


    /* Constructeur */
    public Case(int l, int c, NatureTerrain n){
        setLigne(l);
        setColonne(c);
        setNature(n);
    }


    /* toString */
    public String toString(){
        return new String("Case : (" + this.getLigne() + ";" + this.getColonne() + ") - " + this.getNature());
    }

}
