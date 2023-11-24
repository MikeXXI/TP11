package tp11.Dto;

/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
 **********************************************************/
public class LivreDTO  implements TransferableObject{
    // A vous de d�finir les attributs, le constructeur et les getters/setters
    // n'oubliez pas : aucune logique m�tier ici !!
    private int id;
    private String titre;
    private String auteur;
    private double poids ;

    public LivreDTO(int id, String titre, String auteur, double poids) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.poids = poids;
    }

    public LivreDTO() {
    }

    public int getId() {
        return id;
    }
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public double getPoids() {
        return poids;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }
}



