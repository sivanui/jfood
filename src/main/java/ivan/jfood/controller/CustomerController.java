package ivan.jfood.controller;

import ivan.jfood.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customer")
@RestController
public class CustomerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        Customer customer = null;
        try {
            customer = DatabaseCustomer.getCustomerById(id);
        } catch (CustomerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Customer addCustomer(@RequestParam(value="name") String name,
                                @RequestParam(value="email") String email,
                                @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomer.getLastId()+1, name, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }
}