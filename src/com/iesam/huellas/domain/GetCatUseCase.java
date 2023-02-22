package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Cat;

import java.util.List;

public class GetCatUseCase {

    private CatRepository catRepository;

    public GetCatUseCase(CatRepository catRepository){
        this.catRepository=catRepository;
    }

    public List<Cat> execute(){
        return catRepository.getAll();
    }
}
