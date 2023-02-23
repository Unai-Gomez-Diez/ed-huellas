package com.iesam.huellas.presentacion;

import com.iesam.huellas.data.AdopcionDataRepository;
import com.iesam.huellas.data.AdoptanteDataRepository;
import com.iesam.huellas.data.CatDataRepository;
import com.iesam.huellas.data.local.AdopcionMemLocalDataSource;
import com.iesam.huellas.data.local.AdoptanteMemLocalDataSource;
import com.iesam.huellas.data.local.CatMemLocalDataSource;
import com.iesam.huellas.domain.*;

import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.Cat;

import java.util.List;
public class TerminalView {
    CatRepository catRepository = new CatDataRepository(CatMemLocalDataSource.getInstance());
    AdoptanteRepository adoptanteRepository = new AdoptanteDataRepository(AdoptanteMemLocalDataSource.getInstance());

    AdopcionRepository adopcionRepository = new AdopcionDataRepository(AdopcionMemLocalDataSource.getInstance()) {
        @Override
        public void save(Adopcion adopcion) {

        }

        @Override
        public List<Adopcion> getAll() {
            return null;
        }
    };
    public void init() {
        Cat gato1 = new Cat();
        gato1.setId("1");
        gato1.setName("Bigotes");
        gato1.setFechaNacimiento("6/6/2020");
        gato1.setSex("male");
        gato1.setHasVirus(true);

        Cat gato2 = new Cat();
        gato2.setId("2");
        gato2.setName("Botas");
        gato2.setFechaNacimiento("1/1/2018");
        gato2.setSex("female");
        gato2.setHasVirus(false);


        AddCatUseCase addCatUseCase = new AddCatUseCase(catRepository);
        addCatUseCase.execute(gato1);
        addCatUseCase.execute(gato2);

        printCat();

        DeleteCatUseCase deleteCatUseCase = new DeleteCatUseCase(catRepository);
        deleteCatUseCase.execute("1");

        printCat();

        Adoptante adoptante1 = new Adoptante();
        adoptante1.setId("1");
        adoptante1.setName("Bigotes");
        adoptante1.setApellidos("Pepos");
        adoptante1.setDni("70845257J");
        adoptante1.setFechaNacimiento("6/6/2020");
        adoptante1.setDireccion("Sanpitopato 13");

        AddAdoptanteUseCase addAdoptanteUseCase = new AddAdoptanteUseCase(adoptanteRepository);
        addAdoptanteUseCase.execute(adoptante1);

        printAdoptante();

        Adopcion adopcion1 = new Adopcion();
        adopcion1.setId("1");
        adopcion1.setFechaAdopcion("9/9/2021");
        adopcion1.getAdoptante(adoptante1);
        adopcion1.getAnimales(gato1);

        AddAdopcionUseCase addAdopcionUseCase = new AddAdopcionUseCase(adopcionRepository);
        addAdopcionUseCase.execute(adopcion1);

        printAdopcion();


    }

    private void printCat() {
        GetCatUseCase getCatUseCase = new GetCatUseCase(catRepository);
        List<Cat> catList = getCatUseCase.execute();
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }
    private void printAdoptante() {
        GetAdoptanteUseCase getAdoptanteUseCase = new GetAdoptanteUseCase(adoptanteRepository);
        List<Adoptante> adoptanteList = getAdoptanteUseCase.execute();
        for (Adoptante adoptante : adoptanteList) {
            System.out.println(adoptante);
        }
    }
    private void printAdopcion() {
        GetAdopcionUseCase getAdopcionUseCase = new GetAdopcionUseCase(adopcionRepository);
        List<Adopcion> adopcionList = getAdopcionUseCase.execute();
        for (Adopcion adopcion : adopcionList) {
            System.out.println(adopcion);
        }
    }
}
