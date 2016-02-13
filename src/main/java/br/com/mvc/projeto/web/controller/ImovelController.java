/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.web.controller;

import br.com.mvc.projeto.dto.Imovel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/imovel")
public class ImovelController {
    
  @RequestMapping("/novo")
  public String imovel(Model model) {
    return "imovel";
  }
  
    @RequestMapping(value = "/saveimovel_json", method = RequestMethod.POST)
    public @ResponseBody
    String saveCompany_JSON(@RequestBody Imovel imovel) {
	//
        // Code processing the input parameters
        //	
        return "JSON: The imovel descricao: " + imovel.getDescricao() + 
                ", bairro: " + imovel.getBairro() + 
                ", valor: " + imovel.getValor()+
                ", tipo: " +imovel.getTipo()+
                ", area: " +imovel.getArea()+
                ", quartos: " +imovel.getQuartos()+
                ", salas: " +imovel.getSalas()+
                ", garagens: " + imovel.getGaragens()+
                ", banheiros: "+ imovel.getBanheiros();
    }  
    
    
    @RequestMapping(value = "/users/all", method = RequestMethod.GET)
    public @ResponseBody
    String getAllUsers(ModelMap model) {
        String jsonData = "[{\"id\":\"3253123\",\"firstname\":\"Chris\",\"lastname\":\"Johnson\",\"address\":\"211, Geoffrey Drive\",\"city\":\"Newark\",\"phone\":\"999-888-6666\",\"email\":\"chrisj@yahoo.com\"},{\"id\":\"67643837\",\"firstname\":\"Bill\",\"lastname\":\"Derkson\",\"address\":\"201, Sleepy Hollow Drive\",\"city\":\"Newark\",\"phone\":\"999-777-2222\",\"email\":\"billd@gmail.com\"}]";
        return jsonData;
    }    
  
}
