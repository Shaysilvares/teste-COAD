package br.com.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.prova.dao.SolicitacaoDao;
import br.com.prova.model.Solicitacao;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */

@Controller
@RequestMapping("solicitacao")
public class SolicitacaoController {
	
	@Autowired
    private SolicitacaoDao dao;
	
    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public ModelAndView listaTodas(ModelMap model) {
        model.addAttribute("solicitacoes", dao.getSolicitacoes());
        return new ModelAndView("/solicitacao/listarSolicitacoes", model);
    }
     
    @GetMapping("/cadastrar")
    public String cadastrar(@ModelAttribute("solicitacao") Solicitacao solicitacao, ModelMap model) {
        return "/solicitacao/adicionarSolicitacao";
    }
    
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("solicitacao") Solicitacao solicitacao, RedirectAttributes attr) {
        dao.salvar(solicitacao);
        attr.addFlashAttribute("message", "Solicitação salva com sucesso.");
        return "redirect:/solicitacao/todas";
    }
}