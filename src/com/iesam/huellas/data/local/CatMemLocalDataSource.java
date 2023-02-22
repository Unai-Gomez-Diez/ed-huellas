package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CatMemLocalDataSource implements CatLocalDataSource{

    private static CatMemLocalDataSource instance = null;

    private Map<String, Cat> storage = new TreeMap<>();

    private CatMemLocalDataSource(){

    }
    @Override
    public void save(Cat cat) {
        storage.put(cat.getId(), cat);
    }

    @Override
    public Cat findById(String catId) {
        return storage.get(catId);
    }

    @Override
    public List<Cat> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String catId) {
storage.remove(catId);
    }

    public static CatMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new CatMemLocalDataSource();
        }
        return instance;
    }
}
