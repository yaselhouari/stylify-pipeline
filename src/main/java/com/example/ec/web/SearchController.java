package com.example.ec.web;

import com.example.ec.helper.MyQuery;
import com.example.ec.helper.MyResult;
import com.example.ec.service.MySearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SearchController {
    @PostMapping("/search")
    public ArrayList<MyResult> postSearch(
            @RequestParam(value="searchDate") String searchDate,
            @RequestParam(value="searchServices") String searchServices,
            @RequestParam(value="searchKeywords")String searchKeywords,
            @RequestParam(value="locationType")String locationType) {
        MySearchService searchService = new MySearchService(new MyQuery());
        return searchService.getResulst();
    }
}
