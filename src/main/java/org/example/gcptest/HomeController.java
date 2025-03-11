package org.example.gcptest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String mainP()
    {
        return "gijins home";
    }
}
