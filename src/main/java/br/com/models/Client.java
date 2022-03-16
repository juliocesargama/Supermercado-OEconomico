package br.com.models;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {
    private Integer id;
    private String name;
    private String lastname;
    private LocalDate createdAt;
}
