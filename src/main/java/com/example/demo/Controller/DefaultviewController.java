package com.example.demo.Controller;

import com.example.demo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultviewController
{

//        @GetMapping("/index")
//        public String getindex()
//        {
//            return "index";
//        }



        @PostMapping("/customer")
        public String getcustomer(Customer customer)
        {
                System.out.println("Customer information is:->"+customer);
                return null;
        }

        @GetMapping("/form")
        public String getform()
        {
                return "form";
        }
        @GetMapping("/hello")
        public String gethello()
        {
                return "hello";
        }
}
