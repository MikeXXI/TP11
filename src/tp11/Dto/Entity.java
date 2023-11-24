package tp11.Dto;

/**
 * Les entit�s sont les objets complexes contenant de la
 * logique m�tier que l'on cherche � transformer � DTO
 * pour des raisons de communication. Tout objet de ce genre
 * devra impl�menter cette interface et proposer une m�thode
 * toDTO() renvoyant la "version DTO" de l'objet.
 */
public interface Entity {

    public TransferableObject toDTO();
}
