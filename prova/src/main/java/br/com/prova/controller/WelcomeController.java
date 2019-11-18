package br.com.prova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */

@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		 return "redirect:/solicitacao/todas";
	}

	 @RequestMapping(value = "/teste", method = RequestMethod.GET)
	public ModelAndView teste() {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("teste", "Olá, teste");
		return view;
	}
}