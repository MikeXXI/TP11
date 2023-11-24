package tp11.adapter;

import tp11.Dto.CommandeDTO;

public interface NotificationService {
    void envoyerNotification(CommandeDTO commande);
}