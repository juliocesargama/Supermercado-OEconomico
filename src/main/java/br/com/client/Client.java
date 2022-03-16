package br.com.client;

import java.time.LocalDateTime;

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
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCPF() {
        return CPF;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
