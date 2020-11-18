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

        myResults.add(new MyResult("Anwar", "Fikri", "30", "94", "30"));
        myResults.add(new MyResult("Redouane", "Al Asmar", "40", "90", "36"));
        myResults.add(new MyResult("Omar", "Diab", "50", "90", "15"));
        myResults.add(new MyResult("Khalid", "El Achkar", "50", "92", "40"));
        myResults.add(new MyResult("Morad", "Salmi", "60", "94", "25"));
        myResults.add(new MyResult("Walid", "El Kadiri", "65", "88", "20"));
        myResults.add(new MyResult("Samih", "Farsi", "70", "90", "50"));
        myResults.add(new MyResult("Salah", "Briki", "75", "91", "40"));

        return myResults;
    }
}
