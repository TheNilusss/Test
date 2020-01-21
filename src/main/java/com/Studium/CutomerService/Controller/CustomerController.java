package com.Studium.CutomerService.Controller;

import com.Studium.CutomerService.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    @GetMapping("/Hello")
    public Customer hallo()
    {
        Customer l_customer = new Customer("Nils","Heinisch");
        return l_customer;
    }

    /*@Autowired
    private RestTemplate restTemplate;
*/



    @GetMapping("/gatsby")
    public ResponseEntity<Customer> hallo2()
    {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8080/Hello";
        ResponseEntity<Customer> response = restTemplate.getForEntity(fooResourceUrl, Customer.class);
        System.out.println(response);
        return response;
    }

}
