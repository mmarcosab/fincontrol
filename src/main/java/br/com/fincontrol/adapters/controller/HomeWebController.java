package br.com.fincontrol.adapters.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class HomeWebController {

    @GetMapping
    public String home(){
        return "index";
    }

}
