package by.andrewblinets.videoboardserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Андрей on 10.02.2017.
 */

@Controller
@RequestMapping("/")
public class Admin_panel_controller {

    @RequestMapping( method = RequestMethod.GET)
    public String start()
    {
        return "index";
    }
}
