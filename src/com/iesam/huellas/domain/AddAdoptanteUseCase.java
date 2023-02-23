package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Adoptante;

public class AddAdoptanteUseCase {

    private AdoptanteRepository adoptanteRepository;

    public AddAdoptanteUseCase(AdoptanteRepository adoptanteRepository){
        this.adoptanteRepository=adoptanteRepository;
    }

    public void execute(Adoptante adoptante){
        adoptanteRepository.save(adoptante);
    }
}
