package tp11;

import tp11.Dto.Entity;
import tp11.Dto.LivreDTO;

/******************************************************************
 * Il s'agit d'une entit� (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique m�tier.
 * Cet objet propose une m�thode toDTO() qui fournira la version l�g�re
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Livre implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private String titre;
    private String auteur;
    private double poids ;

    // TODO � vous d'�crire les getters/setters, le(s) constructeur(s) et tout ce dont vous aurez besoin
    // GETTERS / SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }

    public LivreDTO toDTO() {
        // TODO � �crire
        return null ;
    }
}
