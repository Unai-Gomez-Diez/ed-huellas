package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public interface AdopcionLocalDataSource {
    public void save(Adopcion adopcion);
    public Adopcion findById(String adopcionId);
    public List<Adopcion> findAll();
}
