package hello.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller

public class MyFirstController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/ecco")
    @ResponseBody
    public String ecco(@RequestParam String input){
        return input.toUpperCase();
    }

    @GetMapping("/calc")
    @ResponseBody
    public String calc(@RequestParam int input){
        return "" + input*input;
    }
}
