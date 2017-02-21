package by.andrewblinets.videoboardserver.service.service_interfase;

import by.andrewblinets.videoboardserver.entity.User_account;

import java.util.List;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface User_account_service {

    List<User_account> getAll();
    User_account getByID(long id);
    User_account save(User_account remind);
    void remove(long id);

}
