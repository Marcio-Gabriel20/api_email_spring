package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.ms.email.enums.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEmail;
    private String ownerRef; // Referência do proprietária que está mandando a mensagem
    private String emailFrom; // De quem está mandando o e-mail
    private String emailTo; // Para quem está mandando o e-mail
    private String subject; // Título do e-mail

    @Column(columnDefinition = "TEXT")
    private String text; // Corpo do e-mail
    private LocalDateTime sendDateEmail; // Data que o e-mail será enviado
    private StatusEmail statusEmail; // status do e-mail (se foi enviado corretamente ou se ocorreu algum erro)

}