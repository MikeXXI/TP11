package tp11.state;

import tp11.Commande;
import tp11.state.CommandeEnCours;

/**
 * Etat repr�sentant la commande nouvellement cr��e.
 * Son �tat suivant est : En cours
 */
public class CommandeNouvelle implements CommandeState {
    // TODO � vous d'�crire ce qu'il faut
    Commande commande;
    public CommandeNouvelle(Commande commande) {
        this.commande = commande;
    }
    public void enCours() {
        commande.setState(commande.getEnCours());
    }
}