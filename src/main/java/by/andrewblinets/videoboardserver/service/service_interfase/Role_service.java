package by.andrewblinets.videoboardserver.service.service_interfase;

import by.andrewblinets.videoboardserver.entity.Role;

import java.util.List;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface Role_service {

    List<Role> getAll();
    Role getByID(long id);
    Role save(Role remind);
    void remove(long id);

}
