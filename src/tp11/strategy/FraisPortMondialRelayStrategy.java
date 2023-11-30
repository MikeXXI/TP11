package tp11.strategy;

import tp11.Commande;
import tp11.Dto.LivreDTO;
import tp11.Livre;
import tp11.Repo.LivreRepository;

import java.util.List;

/*****
 * Stratégie correspondant au mode d'expédition : Mondial Relay
 */
public class FraisPortMondialRelayStrategy implements FraisPortStrategy {
    // TODO à vous de déterminer s'il y a besoin d'attributs
    private Commande contexte;
    private List<Livre> livres;
    private LivreRepository livreRepository;

    public FraisPortMondialRelayStrategy(Commande contexte) {
        // TODO
        this.contexte = contexte;
    }

    /***
     * Regles de calcul :
     * - si le poids total de la commande est inférieur ou égal à 3kg, fdp = 4€
     * - au delà de 3kg, fdp = 8€
     */
    @Override
    public double calculerFraisPort() {
        // TODO Calcul basé sur le poids des livres
        double fraisPort = 0;
        double poidsTotal = 0;
        livres = this.contexte.getLivres(livreRepository);
        for(Livre livre : livres) {
            poidsTotal += livre.getPoids();
        }
        if(poidsTotal <= 3) {
            fraisPort = 4;
        } else {
            fraisPort = 8;
        }
        return fraisPort;
    }
}
