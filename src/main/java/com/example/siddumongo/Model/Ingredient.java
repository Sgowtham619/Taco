package com.example.siddumongo.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Ingredient {

    @Id
    private final String id;

    private final String name;

    public final Type type;

    public static enum Type{
        WRAP,PROTEIN,CHEESE,VEGGIES,SAUCE;
    }
}
