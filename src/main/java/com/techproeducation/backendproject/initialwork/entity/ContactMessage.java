package com.techproeducation.backendproject.initialwork.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;


    @Column(nullable = false)
    private String name;



    @Column(nullable = false)
    private String email;


    @Column(nullable = false)
    private String subject;


    @Column(nullable = false)
    private String message;


    @Column(nullable = false)
    private Timestamp creationDate = Timestamp.valueOf(LocalDateTime.now(ZoneId.of("America/New_York")));







}
