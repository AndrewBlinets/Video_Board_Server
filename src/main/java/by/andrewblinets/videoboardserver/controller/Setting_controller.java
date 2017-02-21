package by.andrewblinets.videoboardserver.controller;

import by.andrewblinets.videoboardserver.entity.Setting;
import by.andrewblinets.videoboardserver.service.service_interfase.Setting_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Андрей on 20.02.2017.
 */

@RestController
public class Setting_controller {

    @Autowired
    private Setting_service setting;

    @RequestMapping(value = "/setting", method = RequestMethod.GET)
    @ResponseBody
    public List<Setting> getAllCategories()
    {
        return setting.getAll();
    }

    @RequestMapping(value = "/setting/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Setting getCategories(@PathVariable("id") long setting_id)
    {
        return setting.getByID(setting_id);
    }

    @RequestMapping(value = "/setting", method = RequestMethod.POST)
    @ResponseBody
    public Setting saveCategories(@RequestBody Setting setting)
    {
        return this.setting.save(setting);
    }

    // delete
    /*@RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }*/
    // update из save выходит

}
