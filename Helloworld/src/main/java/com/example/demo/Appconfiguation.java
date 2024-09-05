package com.example.demo;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class Appconfiguation   
{  
@RequestMapping("/")  
public String hello()   
{  
return "HELLO WORLD!,I have speed 1TB Memory:160GBPS";  
}  
}  
