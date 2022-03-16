package br.com.client;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private Integer id;
    private String name;
    private String lastname;
    private LocalDateTime createdAt;
    
    public Client(int id, String name, String lastname, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.lastname = lastname
        this.createdAt = createdAt;
    }
}
