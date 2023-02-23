package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public class GetAdoptanteUseCase {
    private AdoptanteRepository adoptanteRepository;

    public GetAdoptanteUseCase(AdoptanteRepository adoptanteRepository){
        this.adoptanteRepository=adoptanteRepository;
    }

    public List<Adoptante> execute(){
        return adoptanteRepository.getAll();
    }
}
