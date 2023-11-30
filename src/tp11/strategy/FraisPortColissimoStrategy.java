package tp11.strategy;

import tp11.Commande;
import tp11.Dto.LivreDTO;
import tp11.Livre;
import tp11.Repo.LivreRepository;

import java.util.List;

/*****
 * Stratégie correspondant au mode d'expédition : Colissimo
 */
public class FraisPortColissimoStrategy implements FraisPortStrategy {
    // TODO à vous de déterminer s'il y a besoin d'attributs
    private Commande contexte;
    private List<Livre> livres;
    private LivreRepository livreRepository;

    public FraisPortColissimoStrategy(Commande contexte) {
        // TODO
        this.contexte = contexte;
    }

    /***
     * Regles de calcul :
     * - si le poids total de la commande est inférieur ou égal à 1kg, fdp = 3€
     * - si le poids total de la commande est compris entre 1kg et 3kg, fdp = 5€
     * - au delà de 3kg, fdp = 15€
     */
    @Override
    public double calculerFraisPort() {
        // TODO Calcul basé sur le poids des livres
        double fraisPort = 0;
        double poidsTotal = 0;
        //il faut que je retrouve le poids, mais pour ça je dois utiliser
        //le repo non ???
        livres = this.contexte.getLivres(livreRepository);
        for(Livre livre : livres) {
            poidsTotal += livre.getPoids();
        }
        if(poidsTotal <= 1) {
            fraisPort = 3;
        } else if(poidsTotal <= 3) {
            fraisPort = 5;
        } else {
            fraisPort = 15;
        }
        return fraisPort;
    }
}
