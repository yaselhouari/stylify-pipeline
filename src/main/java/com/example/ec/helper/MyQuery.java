package com.example.ec.helper;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class MyQuery {
    public MyQuery() {

    }

    public ArrayList<MyResult> getResulst() {
        ArrayList<MyResult> myResults = new ArrayList<>();

        myResults.add(new MyResult("Anwar", "Fikri", 80, 10, "30"));
        myResults.add(new MyResult("Redouane", "Al Asmar", 70, 20, "36"));
        myResults.add(new MyResult("Omar", "Diab", 60, 30, "30"));
        myResults.add(new MyResult("Khalid", "El Achkar", 50, 40, "40"));
        myResults.add(new MyResult("Morad", "Salmi", 40, 94, "50"));
        myResults.add(new MyResult("Walid", "El Kadiri", 30, 60, "20"));
        myResults.add(new MyResult("Samih", "Farsi", 20, 70, "50"));
        myResults.add(new MyResult("Salah", "Briki", 10, 80, "40"));

        return myResults;
    }
}
