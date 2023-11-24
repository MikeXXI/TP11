package tp11.Dto;
import java.util.List;

import tp11.state.CommandeState;

/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
 **********************************************************/
public class CommandeDTO implements TransferableObject{

    private int id;
    private String status;
    private List<LivreDTO> livres;
    private UtilisateurDTO utilisateur ;
    private CommandeState currentState = null ; // état actuel de la commande
    private double fraisDePort ;

    // A vous de d�finir les attributs, le constructeur et les getters/setters
    // Pour vous aider, je vous ai laiss� 2 attributs utilisant les autres DTO. A vous de faire le reste
    // n'oubliez pas : aucune logique m�tier ici !!
    public CommandeDTO(int id, String status, List<LivreDTO> livres, UtilisateurDTO utilisateur, CommandeState currentState, double fraisDePort) {
        this.id = id;
        this.status = status;
        this.livres = livres;
        this.utilisateur = utilisateur;
        this.currentState = currentState;
        this.fraisDePort = fraisDePort;
    }
    public CommandeDTO() {
    }
    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<LivreDTO> getLivres() {
        return livres;
    }
    public void setLivres(List<LivreDTO> livres) {
        this.livres = livres;
    }
    public UtilisateurDTO getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(UtilisateurDTO utilisateur) {
        this.utilisateur = utilisateur;
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
    

}