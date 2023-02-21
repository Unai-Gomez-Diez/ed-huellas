package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public class CatDbLocalDataSource implements CatLocalDataSource{

    private static CatDbLocalDataSource instance =null;

    private CatDbLocalDataSource(){}

    @Override
    public void save(Cat cat) {

    }

    @Override
    public Cat findById(String catId) {
        return null;
    }

    @Override
    public List<Cat> findAll() {
        return null;
    }

    @Override
    public void delete(String catId) {

    }

    public static CatDbLocalDataSource getInstance(){
        if(instance == null){
            instance = new CatDbLocalDataSource();
        }
        return instance;
    }
}
