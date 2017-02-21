package by.andrewblinets.videoboardserver.service.service_interfase;

import by.andrewblinets.videoboardserver.entity.Categories;

import java.util.List;

/**
 * Created by Андрей on 16.02.2017.
 */
public interface Categories_service {


    List<Categories> getAll();
    Categories getByID(long id);
    Categories save(Categories remind);
    void remove(long id);

}
