package com.myprojects.customerservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Customer{
    private long id;
    private String name;
    private String email;
    public Customer(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
