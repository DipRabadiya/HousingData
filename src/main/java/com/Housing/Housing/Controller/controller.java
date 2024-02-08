package com.Housing.Housing.Controller;

import com.Housing.Housing.Entity.HouseData;
import com.Housing.Housing.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class controller {

    @Autowired
    private DataService dataService;

    @GetMapping
    public List<HouseData> getAllHouse(){
        return dataService.getAllHouse();
    }

    @GetMapping("{id}")
    public Optional<HouseData> getHouseById(@PathVariable Long id){
        return dataService.getHouseById(id);
    }

    @GetMapping("/avgAll")
    public int Averagesaleprice(){
        return dataService.Averagesaleprice();
    }

    @GetMapping("/avgByLocation")
    public List<Object> AverageByLocation(){
        return dataService.AverageByLocation();
    }

    @GetMapping("/maxPrice")
    public List<Object> maxsaleprice(){
        return dataService.maxsaleprice();
    }

    @GetMapping("/minPrice")
    public List<Object> minsaleprice(){
        return dataService.minsaleprice();
    }


    @PostMapping("/data")
    public void addHouseData(@RequestBody List<HouseData> data) {
        dataService.addHouseData(data);
    }

}