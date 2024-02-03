package com.learn.designpatterns.builder;

import com.learn.designpatterns.builder.dto.Address;
import com.learn.designpatterns.builder.dto.UserDTO;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String name);
    UserDTOBuilder withLastName(String name);
    UserDTOBuilder withAddrress(Address address);
    UserDTOBuilder withBirthday(LocalDate date);

    // method to assemble final product
    UserDTO build();

    // (optional) method to fetch already built project
    UserDTO getUserDTO();



}
