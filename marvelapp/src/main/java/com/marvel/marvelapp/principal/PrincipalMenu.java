package com.marvel.marvelapp.principal;

import com.marvel.marvelapp.intermadiate.DatosAutores;
import com.marvel.marvelapp.intermadiate.DatosGeneral;
import com.marvel.marvelapp.intermadiate.DatosLibro;
import com.marvel.marvelapp.metodos.BusquedaAutor;
import com.marvel.marvelapp.services.ConsumoApi;
import com.marvel.marvelapp.services.ConviertidorDatos;

import java.net.URL;
import java.util.*;

public class PrincipalMenu {

    Scanner scanner = new Scanner(System.in);
    BusquedaAutor nuevaBusqueda = new BusquedaAutor();


    //---------------------------------------------------------------------------------------------

    public void muestraMenu() {

        var opcion = -1;

        while(opcion != 0){

            var menu = """
                    
                    BOOKJAVA
                    ------------------
                    ENCUENTRA TODO SOBRE TU LIBRO
                    FAVORITO.
                    
                    1- Busca libros por el nombre del autor y del libro. 
                    2- Busca los 10 mejores libros disponibles. 
                   
                    
                    0- Salir
                    ------------------
                    """;
            System.out.println(menu);

            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                //-------------------------------------------------------------------------------------------
                case 1:
                    nuevaBusqueda.muestraBusquedaAutor();
                break;

                case 2:
                    nuevaBusqueda.muestraBusquedaGeneral();
                    break;

                case 0:
                    System.out.println("Cerrando la aplicacion.");
                    break;

                default:
                    System.out.println("Titulo no disponible.");
                    break;
            }


            //-------------------------------------------------------------------------------------------









        }













    }





}
