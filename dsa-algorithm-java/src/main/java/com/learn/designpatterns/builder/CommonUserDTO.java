package com.learn.designpatterns.builder;

import com.learn.designpatterns.builder.dto.Address;

import java.time.LocalDate;
import java.time.Period;

//Product class
public class CommonUserDTO {

	private String name;
	
	private String address;
	
	private String age;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
	//Get builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}
	//Builder
	public static class UserDTOBuilder {
		
		private String firstName;
		
		private String lastName;
		
		private String age;
		
		private String address;
		
		private CommonUserDTO userDTO;
		
		public UserDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}
		
		public UserDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}
		
		public UserDTOBuilder withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}
		
		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + " " +address.getStreet()
						+ "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode(); 

			return this;
		}
		
		public CommonUserDTO build() {
			this.userDTO = new CommonUserDTO();
			userDTO.setName(firstName+" " + lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}
		
		public CommonUserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
