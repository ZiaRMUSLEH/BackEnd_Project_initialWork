package com.techproeducation.backendproject.initialwork.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessageUpdateRequest {


    private String name;


   
    @Email(message = "please provide a valid email!")
    private String email;



    private String subject;



    private String message;


}
