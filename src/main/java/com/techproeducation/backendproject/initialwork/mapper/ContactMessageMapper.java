package com.techproeducation.backendproject.initialwork.mapper;


import com.techproeducation.backendproject.initialwork.dto.ContactMessageRequest;
import com.techproeducation.backendproject.initialwork.dto.ContactMessageResponse;
import com.techproeducation.backendproject.initialwork.dto.ContactMessageUpdateRequest;
import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ContactMessageMapper {

    public ContactMessageResponse contactMessageToContactMessageResponse(ContactMessage contactMessage){
        ContactMessageResponse contactMessageResponse = new ContactMessageResponse();
        contactMessageResponse.setName(contactMessage.getName());
        contactMessageResponse.setEmail(contactMessage.getEmail());
        contactMessageResponse.setSubject(contactMessage.getSubject());
        contactMessageResponse.setMessage(contactMessage.getMessage());
        String date = String.valueOf(contactMessage.getCreationDate()).replaceAll("[A-Z]"," ").substring(0,16);
        contactMessageResponse.setCreationDate(date);
        return contactMessageResponse;
    }

    public ContactMessage contactMessageRequestToContactMessage(ContactMessageRequest contactMessageRequest){
        ContactMessage contactMessage = new ContactMessage();
        contactMessage.setName(contactMessageRequest.getName());
        contactMessage.setEmail(contactMessageRequest.getEmail());
        contactMessage.setSubject(contactMessageRequest.getSubject());
        contactMessage.setMessage(contactMessageRequest.getMessage());
        return contactMessage;
    }

    public ContactMessageRequest contactMessageTocontactMessageRequest(ContactMessage contactMessage){
        ContactMessageRequest contactMessageRequest = new ContactMessageRequest();
        contactMessageRequest.setName(contactMessage.getName());
        contactMessageRequest.setEmail(contactMessage.getEmail());
        contactMessageRequest.setSubject(contactMessage.getSubject());
        contactMessageRequest.setMessage(contactMessage.getMessage());
        return contactMessageRequest;
    }






    public Page<ContactMessageResponse> contactMessagePageToContactMessageResponse(Page<ContactMessage> contactMessagePage) {
        List<ContactMessageResponse> contactMessageResponseList = new ArrayList<>();

        for (ContactMessage contactMessage : contactMessagePage.getContent()) {
            ContactMessageResponse contactMessageResponse = new ContactMessageResponse();


            contactMessageResponse.setName(contactMessage.getName());
            contactMessageResponse.setMessage(contactMessage.getMessage());
            contactMessageResponse.setEmail(contactMessage.getEmail());
            contactMessageResponse.setSubject(contactMessage.getSubject());
            String date = String.valueOf(contactMessage.getCreationDate()).substring(0,16);
            contactMessageResponse.setCreationDate(date);

            contactMessageResponseList.add(contactMessageResponse);
        }

        return new PageImpl<>(contactMessageResponseList, contactMessagePage.getPageable(), contactMessagePage.getTotalElements());
    }


    public ContactMessage contactMessageUpdateRequestToContactMessage(ContactMessageUpdateRequest contactMessageUpdateRequest){
        ContactMessage contactMessage = new ContactMessage();
        contactMessage.setName(contactMessageUpdateRequest.getName());
        contactMessage.setEmail(contactMessageUpdateRequest.getEmail());
        contactMessage.setSubject(contactMessageUpdateRequest.getSubject());
        contactMessage.setMessage(contactMessageUpdateRequest.getMessage());
        return contactMessage;
    }




}
