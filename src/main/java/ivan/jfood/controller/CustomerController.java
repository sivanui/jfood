package ivan.jfood.controller;

import ivan.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class CustomerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Customer> getDatabaseCustomer(){
        return DatabaseCustomerPostgre.getDatabaseCustomer();
    }

    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return DatabaseCustomerPostgre.getCustomer(id);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                     @RequestParam(value="email") String email,
                                     @RequestParam(value="password") String password)
    {
        return DatabaseCustomerPostgre.insertCustomer(name, email, password);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        return DatabaseCustomerPostgre.getCustomer(email, password);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeCustomer(@RequestParam(value="id") int id){
        Boolean customer =  DatabaseCustomerPostgre.removeCustomer(id);
        return customer;
    }

}