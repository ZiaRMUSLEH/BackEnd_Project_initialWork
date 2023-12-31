package com.techproeducation.backendproject.initialwork.repository;


import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {

    // get ContactMessage by email

    List<ContactMessage> findByEmail (String email);




    // search ContactMessage by subject

    @Query("SELECT c FROM ContactMessage c WHERE c.subject LIKE %:pSubject%")
    List<ContactMessage> getBySubject(@Param("pSubject") String subject);

    boolean existsByEmail (String email);


    // search ContactMessage by creation date

    @Query("SELECT c FROM ContactMessage c WHERE c.creationDate BETWEEN :in_startDate AND :in_endDate")
    List<ContactMessage> getByDate(@Param("in_startDate") Timestamp startDateTime,
                                   @Param("in_endDate") Timestamp endDateTime);

}
