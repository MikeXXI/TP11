package tp11.Repo;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import tp11.Livre;



/**
 * Implémentation simulée du repository (pas de base de données réelle)
 * Dans une application réelle, le repository sera responsable de la
 * persistance et donc de la connexion/gestion de la base de données.
 */


public class LivreRepositoryImpl implements LivreRepository {
    //  à vous de définir les attributs nécéessaires (comment allez-vous gérer la collection de livres ?)
    //  écrivez le constructeur

    private Map<Integer, Livre> livres = new HashMap<>();
    //  écrivez les méthodes définies dans l'interface LivreRepository
    @Override
    public Livre findById(int id) {
        return livres.get(id);
    }
    @Override
    public List<Livre> findAll() {
        return new ArrayList<>(livres.values());
    }
    @Override
    public void save(Livre livre) {
        livres.put(livre.getId(), livre);
    }
    // @Override
    // public List<Livre> getLivresByIds(List<Integer> livreIds) {
    //     return null;
    // }

    

    // écrivez le contenu de cette classe qui implémente LivreRepository

}