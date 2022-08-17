package com.yesser.holamundo.web;

import com.yesser.holamundo.dao.PersonaDao;
import com.yesser.holamundo.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaDao.findAll();

        log.info("Entrando en el controlador inicio");
        model.addAttribute("personas", personas);

        return "index";
    }

}
