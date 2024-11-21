package service;

import model.Leitor;

import java.util.ArrayList;

public class LeitorService {
    private static ArrayList<Leitor> livros = new ArrayList<>();

    public void cadastrarLeitor(Leitor l){
        livros.add(l);

    }

 //   consultarLivros();

}
