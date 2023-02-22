package com.iesam.huellas.domain;

import com.iesam.huellas.domain.models.Cat;

public class AddCatUseCase {
    private CatRepository catRepository;

    public AddCatUseCase(CatRepository catRepository){
        this.catRepository= catRepository;
    }

    public void execute(Cat cat){
        catRepository.save(cat);
    }
}
