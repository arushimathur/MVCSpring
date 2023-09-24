package org.example.MVCSpring;

import org.example.MVCSpring.dao.AlienDAO;
import org.example.MVCSpring.model.Aliens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private AlienDAO dao;

    @ModelAttribute
    public void modelData(Model m)
    {
        m.addAttribute("name","Aliens");
    }

    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @GetMapping("getAliens")
    public String getAliens(Model m)
    {
//        List<Aliens> aliens = Arrays.asList(
//                new Aliens(101,"Arushi"),
//                new Aliens(102,"Harshita"),
//                new Aliens(103,"Kartik"),
//                new Aliens(104,"Manasvi")
//        );

        m.addAttribute("result",dao.getAliens());

        return "showAlien";
    }


    @GetMapping("getAlienById")
    public String getAlienById(@RequestParam int aid, Model m)
    {

        m.addAttribute("result",dao.getAlienById(aid));

        return "showAlien";
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute("result") Aliens a)
    {
        dao.addAliens(a);
        return "showAlien";
    }
}
