package com.iesam.huellas.domain;

public class DeleteCatUseCase {

    private CatRepository catRepository;

    public DeleteCatUseCase(CatRepository catRepository){
        this.catRepository=catRepository;
    }

    public void execute(String catId){
        catRepository.delete(catId);
    }
}
