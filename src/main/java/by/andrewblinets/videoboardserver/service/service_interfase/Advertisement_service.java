package by.andrewblinets.videoboardserver.service.service_interfase;

import by.andrewblinets.videoboardserver.entity.Advertisement;

import java.util.List;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface Advertisement_service {

    List<Advertisement> getAll();
    Advertisement getByID(long id);
    Advertisement save(Advertisement remind);
    void remove(long id);

}
