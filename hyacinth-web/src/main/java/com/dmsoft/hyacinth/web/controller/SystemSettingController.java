package com.dmsoft.hyacinth.web.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This is a Index Page Controler
 */
@Controller
@RequestMapping(value = "/views")
public class SystemSettingController {
    /**
     * @return
     */

    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

    @RequestMapping(value = "/systemSetting")
    @RequiresRoles("admin")
    public String index() {
        return "views/systemSetting";
    }

}
