package by.andrewblinets.videoboardserver.service.service_interfase;

import by.andrewblinets.videoboardserver.entity.Setting;

import java.util.List;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface Setting_service {

    List<Setting> getAll();
    Setting getByID(long id);
    Setting save(Setting remind);
    void remove(long id);

}
