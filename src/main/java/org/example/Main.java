package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        MyName I = new MyName("Artem", "Ostapchuk");

        ObjectMapper om = new ObjectMapper();

        try {
            System.out.println(om.writeValueAsString(I));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
