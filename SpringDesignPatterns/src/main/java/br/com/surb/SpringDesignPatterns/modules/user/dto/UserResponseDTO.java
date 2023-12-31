package br.com.surb.SpringDesignPatterns.modules.user.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseDTO {

	private String id;
	private String name;
	private String email;

	private String zipCode;
	private String address;
	private String district;
	private String city;
	private String state;

	private CovidDTO covidInfo;

	private LocalDateTime createdAt;
}
