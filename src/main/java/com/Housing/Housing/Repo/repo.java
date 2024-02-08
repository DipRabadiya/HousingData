package com.Housing.Housing.Repo;

import com.Housing.Housing.Entity.HouseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
@EnableJpaRepositories
public interface repo extends JpaRepository<HouseData, Long> {

    @Query(value = "select avg(salePrice) from HouseData")
    int avgAllSell();

    @Query(value = "SELECT location, AVG(salePrice) FROM HouseData GROUP BY location")
    List<Object> avgLocation();

    @Query(value = "SELECT id,salePrice FROM HouseData WHERE salePrice = (SELECT MAX(salePrice) FROM HouseData)")
    List<Object> maxsaleprice();

    @Query(value = "SELECT id,salePrice FROM HouseData WHERE salePrice = (SELECT MIN(salePrice) FROM HouseData)")
    List<Object> minsaleprice();

}
