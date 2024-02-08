package com.Housing.Housing.Service;


import com.Housing.Housing.Entity.HouseData;
import com.Housing.Housing.Repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private repo repo;

    public List<HouseData> getAllHouse() {
        return repo.findAll();
    }


    public List<HouseData> addHouseData(List<HouseData> data){
        return repo.saveAll(data);
    }

    public Optional<HouseData> getHouseById(Long id) {
        return repo.findById(id);
    }

    public int Averagesaleprice(){
        return repo.avgAllSell();
    }

    public List<Object> AverageByLocation() {
        return repo.avgLocation();
    }

    public List<Object> maxsaleprice() {
        return repo.maxsaleprice();
    }

    public List<Object> minsaleprice() {
        return repo.minsaleprice();
    }
}