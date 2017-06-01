package com.crud.financeiro.service;

import com.crud.financeiro.model.Titulo;
import com.crud.financeiro.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitulosService {

    @Autowired
    private Titulos titulos;

    public void salvar(Titulo titulo){
        titulos.save(titulo);
    }

}
