package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public interface AdoptanteLocalDataSource {
    public void save(Adoptante adoptante);

    public List<Adoptante> findAll();
}
