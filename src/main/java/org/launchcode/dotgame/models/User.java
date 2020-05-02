package org.launchcode.dotgame.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    int id;

    @NotBlank(message = "Name is required")
    @Size(min = 1, max = 150, message = "Name must be between 1 and 150 characters")
    private String name;

    public User(int id, @NotBlank(message = "Name is required") @Size(min = 1, max = 150, message = "Name must be between 1 and 150 characters") String name) {
        this.id = id;
        this.name = name;
    }

    public User() {};

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
