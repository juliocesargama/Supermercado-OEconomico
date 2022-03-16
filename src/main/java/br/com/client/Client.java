package br.com.client;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private Integer id;
    private String name;
    private String CPF;
    private String phone;
    private LocalDateTime createdAt;
    
    public Client(int id, String name, String CPF, String phone, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.phone = phone;
        this.createdAt = createdAt;
    }
}
