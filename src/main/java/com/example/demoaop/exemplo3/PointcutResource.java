package com.example.demoaop.exemplo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pointcut")
public class PointcutResource {

    @GetMapping
    public String pointcut() {
        return "Exemplo pointcut executado com sucesso...";
    }

}
