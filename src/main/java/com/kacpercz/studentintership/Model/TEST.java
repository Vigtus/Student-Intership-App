package com.kacpercz.studentintership.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TEST {
    @Id
    private long id;
    private String name;
    private int age;

}

