package com.learn.designpatterns.builder;

import com.learn.designpatterns.builder.dto.UserDTO;
import com.learn.designpatterns.builder.dto.UserWebDTO;

public class BuilderDemo {

    public static void main(String[] args) {

        UserDTO userWebDTO = new UserDTOWebBuilder().withFirstName("vishnu").withLastName("chalil").build();
    }
}
