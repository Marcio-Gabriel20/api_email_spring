package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef; // Referência do proprietária que está mandando a mensagem

    @NotBlank
    @Email
    private String emailFrom; // De quem está mandando o e-mail

    @NotBlank
    @Email
    private String emailTo; // Para quem está mandando o e-mail

    @NotBlank
    private String subject; // Título do e-mail

    @NotBlank
    private String text; // Corpo do e-mail

}