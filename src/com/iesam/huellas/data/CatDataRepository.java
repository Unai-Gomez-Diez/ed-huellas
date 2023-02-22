package com.iesam.huellas.data;

import com.iesam.huellas.data.local.CatLocalDataSource;
import com.iesam.huellas.domain.CatRepository;
import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public class CatDataRepository implements CatRepository {

    private CatLocalDataSource localDataSource;

    public CatDataRepository(CatLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Cat cat) {
        localDataSource.save(cat);
    }

    @Override
    public List<Cat> getAll() {
        return localDataSource.findAll();
    }

    @Override
    public void delete(String catId) {
        localDataSource.delete(catId);
    }
}
