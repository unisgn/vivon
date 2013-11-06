package com.sink.service.core;

import java.util.List;


import com.sink.domain.core.Attachment;
import com.sink.domain.core.CustomProperty;
import com.sink.domain.core.Customer;
import com.sink.domain.core.CustomerLabel;
import com.sink.domain.core.DroidAssistant;
import com.sink.domain.core.Note;
import com.sink.domain.core.User;


public interface CustomerService {
    
    public Customer findCustomerByName(String name);
    
    public Customer findCustomerByNumber(String number);
    
    public Customer findCustomerByCode(String code);
    
    public Customer findCustomerById(int id);
    
    public List<Customer> findAllCustomers();
    
    public List<Customer> findCustomersByAssistant(DroidAssistant assistant);

    public List<Customer> searchCustomers(String keyword);

    public List<Customer> searchCustomersWithinAssistant(DroidAssistant assistant, String keyword);
    


    public int addCustomer(Customer customer);
    
    public void updateCustomer(Customer customer);

    public void toggleActiveOfCustomer(int id);    

    public void addLabelToCustomer(CustomerLabel label, Customer customer);
    
    public void assignCustomerToAssistant(Customer customer, DroidAssistant assistant);
    
    public void addPrivateNoteToCustomer(Note note, Customer customer);
    public void addPublicNoteToCustomer(Note note, Customer customer);
    
    public void addPrivateAttachmentToCustomer(Attachment attachment, Customer customer);
    public void addPublicAttachmentToCustomer(Attachment attachment, Customer customer);
    
    public void addPrivateCustomPropertyToCustomer(CustomProperty property, Customer customer);
    public void addPublicCustomPropertyToCustomer(CustomProperty property, Customer customer);

}
