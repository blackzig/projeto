/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michel A. Medeiros
 */
public class Customer extends AbstractEntity {

//private Long id;
//private String firstname;
//private String lastname;
//private EmailAddress email;
//private Address address; 
    private String firstName;
    private String lastName;
    private EmailAddress emailAddress;
    private Set<Address> addresses = new HashSet<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Set<Address> getAddresses() {
        return Collections.unmodifiableSet(addresses);
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public void clearAddresses() {
        this.addresses.clear();
    }

}
