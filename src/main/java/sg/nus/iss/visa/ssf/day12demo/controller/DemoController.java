package sg.nus.iss.visa.ssf.day12demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class DemoController {
    
    @GetMapping("/home/{name}")
    public HelloWorld getHome(@PathVariable String name){
        return new HelloWorld("Hello World");
    }


    @GetMapping("/home2")
    public String getHome2(@RequestParam String name){
        return "Hello World2";
    }

}
