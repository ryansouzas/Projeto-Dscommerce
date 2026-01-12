package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ClientDTO {

    private Long id;
    private String email;

    public ClientDTO(){

    }

    public ClientDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public ClientDTO(User entity) {
        id = entity.getId();
        email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
