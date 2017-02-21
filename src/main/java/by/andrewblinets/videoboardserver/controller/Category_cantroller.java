package by.andrewblinets.videoboardserver.controller;

import by.andrewblinets.videoboardserver.entity.Categories;
import by.andrewblinets.videoboardserver.service.service_interfase.Categories_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Андрей on 16.02.2017.
 */
@RestController
//@RequestMapping("/categories")
public class Category_cantroller {

    @Autowired
    private Categories_service categories;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ResponseBody
    public List<Categories> getAllCategories()
    {
        return categories.getAll();
    }

    @RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Categories getCategories(@PathVariable("id") long categories_id)
    {
        return categories.getByID(categories_id);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    @ResponseBody
    public Categories saveCategories(@RequestBody Categories category)
    {
        return categories.save(category);
    }

    // delete
    /*@RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }*/
    // update из save выходит

}
