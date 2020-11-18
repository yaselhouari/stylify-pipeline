package com.example.ec.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @PostMapping("/search")
    public String postSearch(@RequestParam(value="searchDate") String searchDate) {
        return "searchDate";
    }


}
