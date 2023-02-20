package com.iesam.huellas.domain.models;

import com.iesam.huellas.domain.models.Animales;

public class Cat extends Animales {
    private boolean hasVirus;

    public boolean isHasVirus() {
        return hasVirus;
    }

    public void setHasVirus(boolean hasVirus) {
        this.hasVirus = hasVirus;
    }
}
