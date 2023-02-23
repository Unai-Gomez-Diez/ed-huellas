package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.Cat;


import java.util.List;

public interface AdoptanteRepository {
    public void save(Adoptante adoptante);
    public List<Adoptante> getAll();
}
