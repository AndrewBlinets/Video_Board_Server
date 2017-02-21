package by.andrewblinets.videoboardserver.service.service_interfase;

import by.andrewblinets.videoboardserver.entity.Account;

import java.util.List;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface Account_service {

    List<Account> getAll();
    Account getByID(long id);
    Account save(Account remind);
    void remove(long id);

}
