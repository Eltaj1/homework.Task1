package com.latesthomework.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sup {
    @GetMapping(value = "/mercedes")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Mercedes") String name, Model model) {
        model.addAttribute("name", name);
        return "mercedes";
    }
}