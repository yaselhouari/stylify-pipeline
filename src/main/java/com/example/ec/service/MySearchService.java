package com.example.ec.service;

import com.example.ec.helper.MyQuery;
import com.example.ec.helper.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MySearchService {
    @Autowired
    MyQuery myQuery;

    public MySearchService(MyQuery myQuery) {
        this.myQuery = myQuery;
    }

    public ArrayList<MyResult> getResulst() {
        return myQuery.getResulst();
    }
}
