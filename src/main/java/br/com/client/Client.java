package br.com.client;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter @Setter Integer id;
    @Getter @Setter String name;
    @Getter @Setter String CPF;
    @Getter @Setter String phone;
    @Getter @Setter LocalDateTime createdAt;
    
    public Client(int id, String name, String CPF, String phone, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.phone = phone;
        this.createdAt = createdAt;
    }
}
