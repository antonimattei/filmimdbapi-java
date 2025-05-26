package com.filmimdbapi.dto;

import lombok.Data;

@Data
public class ErrorResponseDTO {
    private String message;
    private String details;

    public ErrorResponseDTO(String message, String details) {
        this.message = message;
        this.details = details;
    }
    
}
