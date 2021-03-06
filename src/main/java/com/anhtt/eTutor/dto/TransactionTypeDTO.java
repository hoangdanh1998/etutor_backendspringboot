package com.anhtt.eTutor.dto;

import java.util.UUID;

public class TransactionTypeDTO {
    private UUID id;
    private String name;

    public TransactionTypeDTO() {
    }

    public TransactionTypeDTO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
