/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.web.controller;

import br.com.mvc.projeto.dto.Company;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Michel A. Medeiros
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayHome(Model model) {
        return "/home";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView httpServicePostJSONDataExample(ModelMap model) {
    //    return new ModelAndView("httpservice_post_json");
                return new ModelAndView("/hello");
    }

    @RequestMapping(value = "/savecompany_json", method = RequestMethod.POST)
    public @ResponseBody
    String saveCompany_JSON(@RequestBody Company company) {
	//
        // Code processing the input parameters
        //	
        return "JSON: The company name: " + company.getName() + ", Employees count: " + company.getEmployees() + ", Headoffice: " + company.getHeadoffice();
    }

    @RequestMapping(value = "/users/all", method = RequestMethod.GET)
    public @ResponseBody
    String getAllUsers(ModelMap model) {
        String jsonData = "[{\"id\":\"3253123\",\"firstname\":\"Chris\",\"lastname\":\"Johnson\",\"address\":\"211, Geoffrey Drive\",\"city\":\"Newark\",\"phone\":\"999-888-6666\",\"email\":\"chrisj@yahoo.com\"},{\"id\":\"67643837\",\"firstname\":\"Bill\",\"lastname\":\"Derkson\",\"address\":\"201, Sleepy Hollow Drive\",\"city\":\"Newark\",\"phone\":\"999-777-2222\",\"email\":\"billd@gmail.com\"}]";
        return jsonData;
    }

}
