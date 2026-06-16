package com.springproject.store;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    ArrayList<String>products=new ArrayList<>(Arrays.asList("Iphone","Camera","Smart watch"));
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
    @GetMapping("/products")
    public List<String> pro(){
        return products;
    }
    
}
