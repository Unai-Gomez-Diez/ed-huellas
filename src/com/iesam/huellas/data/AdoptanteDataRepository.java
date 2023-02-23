package com.iesam.huellas.data;

import com.iesam.huellas.data.local.AdoptanteLocalDataSource;
import com.iesam.huellas.domain.AdoptanteRepository;
import com.iesam.huellas.domain.models.Adoptante;

import java.util.List;

public class AdoptanteDataRepository implements AdoptanteRepository {

    private AdoptanteLocalDataSource localDataSource;

    public AdoptanteDataRepository(AdoptanteLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }
    @Override
    public void save(Adoptante adoptante) {
    localDataSource.save(adoptante);
    }

    @Override
    public List<Adoptante> getAll() {
        return localDataSource.findAll();
    }


}
