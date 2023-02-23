package com.iesam.huellas.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.huellas.domain.models.Adoptante;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdoptanteFileLocalDataSource implements AdoptanteLocalDataSource{

    private static AdoptanteFileLocalDataSource instance = null;

    private String nameFile = "adoptante.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Adoptante>>() {
    }.getType();

    private AdoptanteFileLocalDataSource() {
    }

    @Override
    public void save(Adoptante adoptante) {
        List<Adoptante> adoptantes = findAll();
        adoptantes.add(adoptante);
        saveToFile(adoptantes);
    }
    private void saveToFile(List<Adoptante> adoptantes) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(adoptantes));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }
    @Override
    public List<Adoptante> findAll() {
        try {
            File myObj = new File(nameFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        }
        return new ArrayList<Adoptante>();
    }
    public static AdoptanteFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AdoptanteFileLocalDataSource();
        }
        return instance;
    }
}
