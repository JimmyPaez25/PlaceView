package com.PlaceView.web;

import com.PlaceView.Dao.IUsuarioDao;
import com.PlaceView.domain.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class Controlador {

    @Autowired
    private IUsuarioDao usuarioDao;
    
    @GetMapping("/")
    public String comienzo (Model model) { 
        Iterable<Usuario> usuarios = usuarioDao.findAll();  
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
