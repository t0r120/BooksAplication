package com.marvel.marvelapp.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConviertidorDatos implements IConvertidorDatos{


    // Inicie La instancia que mapeara los objetos de mi interface.

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    // Cree mi metodo en donde se leeran los datos Genericos y se retornara mi mapper.
    public <T> T obtenDatos(String json, Class<T> clase) {

        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
