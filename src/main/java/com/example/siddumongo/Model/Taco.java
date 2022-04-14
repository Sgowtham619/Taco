package com.example.siddumongo.Model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Data
@Document
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @MongoId
    private String id;

    @CreatedDate
    private Date createdAt;

    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
