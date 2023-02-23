package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.Cat;

public class AddAdopcionUseCase {

    private AdopcionRepository adopcionRepository;

    public AddAdopcionUseCase(AdopcionRepository adopcionRepository){
        this.adopcionRepository= adopcionRepository;
    }

    public void execute(Adopcion adopcion){
        adopcionRepository.save(adopcion);
    }
}
