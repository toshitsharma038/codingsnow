package com.example.demo.Controller;


import com.example.demo.Model.Employee;
import com.example.demo.message.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestWebController {

    List<Employee> emp = new ArrayList<Employee>();

    @RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
    public List<Employee> getResource(){
        return emp;
    }

    @RequestMapping(value="/postcustomer", method=RequestMethod.POST)
    public String postCustomer(@RequestBody Employee employee){
        emp.add(employee);

        return "Sucessful!";
    }
}
