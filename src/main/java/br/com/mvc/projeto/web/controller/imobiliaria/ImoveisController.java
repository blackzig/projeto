/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.web.controller.imobiliaria;

import br.com.mvc.projeto.model.Imovel;
import br.com.mvc.projeto.model.TipoImovel;
import br.com.mvc.projeto.repository.Imoveis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/imoveis")
public class ImoveisController {

//    @RequestMapping(value = "/novo", method = RequestMethod.GET)
//    public String displayHome(Model model) {
//        return "/imobiliaria/cadastro_imovel";
//    }
    
    @Autowired
    private Imoveis imoveis;  
    
    @RequestMapping("/novo")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("CadastroImovel");
        mv.addObject(new Imovel());
        mv.addObject(TipoImovel.values());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView adicionar(Imovel imovel, RedirectAttributes attributes) {
        ModelAndView mv = new ModelAndView();
        imoveis.guardar(imovel);
        mv.setViewName("redirect:/imoveis/novo");
        attributes.addFlashAttribute("mensagem", "Imóvel cadastrado com sucesso!");
        return mv;
    }
}
