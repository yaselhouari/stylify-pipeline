package com.example.ec.apis;

import com.example.ec.helper.MyQuery;
import com.example.ec.helper.MyResult;
import com.example.ec.service.MySearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/search")
public class SearchController {
    @RequestMapping
    public ArrayList<MyResult> serviceSearch(
            @RequestParam(value="searchDate") String searchDate,
            @RequestParam(value="searchServices") String searchServices,
            @RequestParam(value="searchKeywords")String searchKeywords,
            @RequestParam(value="locationType")String locationType) {
        MySearchService searchService = new MySearchService(new MyQuery());
        return searchService.getResulst();
    }
    @RequestMapping("/price")
    public ArrayList<MyResult> serviceSearchByPrice(
        @RequestParam(value="searchDate") String searchDate,
        @RequestParam(value="searchServices") String searchServices,
        @RequestParam(value="searchKeywords")String searchKeywords,
        @RequestParam(value="locationType")String locationType) {
        MySearchService searchService = new MySearchService(new MyQuery());
        return searchService.getResulst();
    }

    @RequestMapping("/rating")
    public ArrayList<MyResult> serviceSearchByRating(
            @RequestParam(value="searchDate") String searchDate,
            @RequestParam(value="searchServices") String searchServices,
            @RequestParam(value="searchKeywords")String searchKeywords,
            @RequestParam(value="locationType")String locationType) {
        MySearchService searchService = new MySearchService(new MyQuery());
        return searchService.getResulst();
    }

    @RequestMapping("/location")
    public ArrayList<MyResult> serviceSearchByLocation(
            @RequestParam(value="searchDate") String searchDate,
            @RequestParam(value="searchServices") String searchServices,
            @RequestParam(value="searchKeywords")String searchKeywords,
            @RequestParam(value="locationType")String locationType) {
        MySearchService searchService = new MySearchService(new MyQuery());
        return searchService.getResulst();
    }
}
