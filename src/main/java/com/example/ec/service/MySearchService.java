package com.example.ec.service;

import com.example.ec.helper.MyQuery;
import com.example.ec.helper.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

@Service
public class MySearchService{
    @Autowired
    MyQuery myQuery;

    public MySearchService(MyQuery myQuery) {
        this.myQuery = myQuery;
    }

    public ArrayList<MyResult> getResulst() {
        return myQuery.getResulst();
    }

    public ArrayList<MyResult> getResultsByPrice() {
        ArrayList<MyResult> myResults = myQuery.getResulst();
        myResults.sort((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        Collections.reverse(myResults);
        return myResults;
    }

    public ArrayList<MyResult> getResulstsByRating() {
        ArrayList<MyResult> myResults = myQuery.getResulst();
        myResults.sort((o1, o2) -> Double.compare(o2.getRate(), o1.getRate()));
        return myResults;
    }

    public ArrayList<MyResult> getResultsByLocation() {
        ArrayList<MyResult> myResults = myQuery.getResulst();
        myResults.sort((o1, o2) -> Double.compare(o2.getLocationDifference(), o1.getLocationDifference()));
        Collections.reverse(myResults);
        return myResults;
    }
}
