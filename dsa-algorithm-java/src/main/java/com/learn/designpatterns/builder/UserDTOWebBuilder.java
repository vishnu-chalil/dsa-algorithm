package com.learn.designpatterns.builder;

import com.learn.designpatterns.builder.dto.Address;
import com.learn.designpatterns.builder.dto.UserDTO;
import com.learn.designpatterns.builder.dto.UserWebDTO;

import java.time.LocalDate;
import java.time.Period;

public class UserDTOWebBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private  String age;
    private  String address;
    private UserWebDTO dto;
    @Override
    public UserDTOBuilder withFirstName(String name) {
        firstName = name;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String name) {
        lastName = name;
        return this;
    }

    @Override
    public UserDTOBuilder withAddrress(Address address) {
        this.address = address.getHouseNumber()+ ",  "+ address.getStreet()+"\n "+ address.getState()
                + "\n "+ address.getCity() + "\n "+ address.getZipcode();
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " "+ lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
