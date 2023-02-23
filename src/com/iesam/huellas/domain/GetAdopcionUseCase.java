package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public class GetAdopcionUseCase {
    private AdopcionRepository adopcionRepository;

    public GetAdopcionUseCase(AdopcionRepository adopcionRepository){
        this.adopcionRepository=adopcionRepository;
    }

    public List<Adopcion> execute(){
        return adopcionRepository.getAll();
    }
}
