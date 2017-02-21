package by.andrewblinets.videoboardserver.service.implimentation;

import by.andrewblinets.videoboardserver.entity.Subcategory;
import by.andrewblinets.videoboardserver.repository.Subcategories_repository;
import by.andrewblinets.videoboardserver.service.service_interfase.Subcategoty_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Андрей on 17.02.2017.
 */
@Service
public class Subcategoty_cervice_implimentation implements Subcategoty_service {

    @Autowired
    private Subcategories_repository repository;

    public List<Subcategory> getAll() {
        return repository.findAll();
    }

    public Subcategory getByID(long id) {
        return repository.findOne(id);
    }


    public Subcategory save(Subcategory remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }

    public List<Subcategory> getName(long Categories_id) {
        return repository.findByName(Categories_id);
    }


}
