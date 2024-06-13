package com.marvel.marvelapp.services;

public interface IConvertidorDatos {

    <T> T obtenDatos(String json, Class<T>clase);
}
