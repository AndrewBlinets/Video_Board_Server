package by.andrewblinets.videoboardserver.controller;


import by.andrewblinets.videoboardserver.entity.Subcategory;
import by.andrewblinets.videoboardserver.service.service_interfase.Subcategoty_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Андрей on 17.02.2017.
 */

@RestController
public class Subcategories_controller {

    @Autowired
    private Subcategoty_service subcategories;

    @RequestMapping(value = "/subcategories", method = RequestMethod.GET)
    @ResponseBody
    public List<Subcategory> getAllCategories()
    {
        return subcategories.getAll();
    }

    @RequestMapping(value = "/subcategories/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Subcategory getCategories(@PathVariable("id") long categories_id)
    {
        return subcategories.getByID(categories_id);
    }

    @RequestMapping(value = "/subcategories", method = RequestMethod.POST)
    @ResponseBody
    public Subcategory saveCategories(@RequestBody Subcategory category)
    {
        return subcategories.save(category);
    }

    @RequestMapping(value = "/subcategoriesname/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Subcategory> getNameCategories(@PathVariable("id") long categories_id)
    {
        return subcategories.getName(categories_id);
    }
}
