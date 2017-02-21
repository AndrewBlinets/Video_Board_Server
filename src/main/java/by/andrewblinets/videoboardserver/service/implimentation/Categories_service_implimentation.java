package by.andrewblinets.videoboardserver.service.implimentation;

import by.andrewblinets.videoboardserver.entity.Categories;
import by.andrewblinets.videoboardserver.repository.Categories_repository;
import by.andrewblinets.videoboardserver.service.service_interfase.Categories_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Андрей on 16.02.2017.
 */
@Service
public class Categories_service_implimentation implements Categories_service {

    @Autowired
    private Categories_repository repository;

    public List<Categories> getAll() {
        return repository.findAll();
    }

    public Categories getByID(long id) {
        return repository.findOne(id);
    }


    public Categories save(Categories remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
