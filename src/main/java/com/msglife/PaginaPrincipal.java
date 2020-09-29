package com.msglife;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msglife.model.Mortalidade2016;
import com.msglife.repository.Repositorio;

@Controller
public class PaginaPrincipal 
{	
	@Autowired
	Repositorio repo;
	
	@GetMapping("/")
	public String paginaprincipal(Model modulo) 
	{
		modulo.addAttribute("message","Taxa de mortalidade por País.");
		return "paginaprincipal";
	}
	
	@RequestMapping("/listar")
	public String addMortalidade2016(Mortalidade2016 mortalidade2016)
	{
		repo.save(mortalidade2016);
		return "listar";
	}
    /* It updates model object. */    
    @RequestMapping(value="/editar",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("Mortalidade2016") Mortalidade2016 m2016){    
        repo.save(m2016);    
        return "editar";    
    }    

}	
