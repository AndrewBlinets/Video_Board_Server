package by.andrewblinets.videoboardserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Андрей on 10.02.2017.
 */

@Controller
@RequestMapping("/")
public class Advertisement {

    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public String getRem(ModelMap model)
    {
        return "Hello World";
    }
}
