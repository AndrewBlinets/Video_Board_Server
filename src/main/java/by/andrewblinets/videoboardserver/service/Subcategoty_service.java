package by.andrewblinets.videoboardserver.service;


import by.andrewblinets.videoboardserver.entity.Subcategory;

import java.util.List;

/**
 * Created by Андрей on 17.02.2017.
 */
public interface Subcategoty_service {

    List<Subcategory> getAll();
    Subcategory getByID(long id);
    Subcategory save(Subcategory remind);
    void remove(long id);
    List<Subcategory> getName(long Categories_id);

}
