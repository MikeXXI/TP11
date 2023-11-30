package tp11;

import tp11.Dto.CommandeDTO;
import tp11.Dto.Entity;
import tp11.Repo.LivreRepository;
import tp11.state.CommandeState;
import tp11.strategy.FraisPortStrategy;

import java.util.ArrayList;
import java.util.List;

/******************************************************************
 * Il s'agit d'une entité (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique métier.
 * Cet objet propose une méthode toDTO() qui fournira la version légère
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Commande implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private Utilisateur utilisateur;
    private String status;
    private CommandeState currentState = null ; // état actuel de la commande
    private double fraisDePort ;

    //  à vous d'écrire les getters/setters, le(s) constructeur(s) et tout ce dont vous aurez besoin notamment pour le lazy loading
    // GETTERS / SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public CommandeState getCurrentState() {
        return currentState;
    }
    public void setCurrentState(CommandeState currentState) {
        this.currentState = currentState;
    }
    public double getFraisDePort() {
        return fraisDePort;
    }
    public void setFraisDePort(double fraisDePort) {
        this.fraisDePort = fraisDePort;
    }


    // Attributs liés au LazyLoading
    private List<Integer> livreIds = new ArrayList<>();
    private transient List<Livre> livres; // Chargé à la demande

    /**
     * Dans cette implémentation, addLivreId() ajoute simplement l'ID d'un livre à la liste livreIds. Lorsque getLivres()
     * est appelé, il utilise cette liste pour charger les livres correspondants depuis le LivreRepository, en implémentant ainsi le lazy loading.
     * Les livres sont chargés uniquement lors de la première invocation de getLivres(), et les appels ultérieurs retournent la liste déjà chargée.
     */
    public void addLivreId(int livreId) {
        livreIds.add(livreId);
        //  à verifier si suffisant
    }
    public List<Livre> getLivres(LivreRepository repo) {
        //  à verifier si suffisant
        if (livres == null) {
            livres = new ArrayList<>();
            for (int livreId : livreIds) {
                Livre livre = repo.findById(livreId);
                if (livre != null){
                    livres.add(livre);
                }
            }
        }
        return livres;
    }
    // Fin Lazyloading


    // Pattern Strategy
    public double calculerFraisDePort(FraisPortStrategy strategy)
    {
         return strategy.calculerFraisPort();
    }

    // Pattern State
    public void etatSuivant()
    {
        //  à coder
    }
    public CommandeDTO toDTO() {
        //  à coder
        return null;
    }
}