package tp11;

import tp11.Dto.Entity;
import tp11.Dto.UtilisateurDTO;

/******************************************************************
 * Il s'agit d'une entité (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique métier.
 * Cet objet propose une méthode toDTO() qui fournira la version légère
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Utilisateur implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private String nom;
    private String email;
    private boolean isPremium = false ;

    // TODO à vous d'écrire les getters/setters, le(s) constructeur(s) et tout ce dont vous aurez besoin
    // GETTERS / SETTERS
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
    public boolean isPremium() {
        return isPremium;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPremium(boolean premium) {
        isPremium = premium;
    }
    public UtilisateurDTO toDTO() {
        // TODO a coder
        
        return null;
    }
}