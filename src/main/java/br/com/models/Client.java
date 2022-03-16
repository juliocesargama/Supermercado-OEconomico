package br.com.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Integer id;
    private String name;
    private String lastname;
    private LocalDate createdAt;
}
