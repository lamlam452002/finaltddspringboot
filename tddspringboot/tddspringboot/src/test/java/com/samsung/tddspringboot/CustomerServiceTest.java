package com.samsung.tddspringboot;


import com.samsung.tddspringboot.repository.models.Customer;
import com.samsung.tddspringboot.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
    }

    @Test
    void testAddCustomerSuccessfully() {
        Customer customer = Customer.builder().name("Mike").number("C001").email("mike@gmail.com").build();
        customerService.addCustomer(customer);
        assertEquals(1, customerService.getAllCustomers().size());
        assertEquals("Duke", customerService.getAllCustomers().get(0).getName());
    }

    @Test
    void testAddCustomerWithDuplicateEmail() {
        Customer customer1 = Customer.builder().name("Mike").number("C001").email("mike@gmail.com").build();
        Customer customer2 = Customer.builder().name("Dobe").number("C001").email("mike@gmail.com").build();

        customerService.addCustomer(customer1);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            customerService.addCustomer(customer2);
        });

        String expectedMessage = "Email already exists!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
