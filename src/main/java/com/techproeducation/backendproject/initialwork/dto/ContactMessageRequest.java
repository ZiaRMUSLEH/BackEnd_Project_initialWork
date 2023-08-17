package com.techproeducation.backendproject.initialwork.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.print.attribute.DateTimeSyntax;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessageRequest {


    @NotNull(message = "Name cannot be null!")
    private String name;


    @NotNull(message = "Email cannot be null!")
    @Email(message = "please provide a valid email!")
    private String email;


    @NotNull(message = "Subject cannot be null!")
    private String subject;


    @NotNull(message = "Message cannot be null!")
    private String message;




}
