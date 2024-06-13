package com.marvel.marvelapp.metodos;

import com.marvel.marvelapp.intermadiate.DatosGeneral;
import com.marvel.marvelapp.intermadiate.DatosLibro;
import com.marvel.marvelapp.services.ConsumoApi;
import com.marvel.marvelapp.services.ConviertidorDatos;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BusquedaAutor {

    ConsumoApi consumoApi = new ConsumoApi();
    ConviertidorDatos conversor = new ConviertidorDatos();
    Scanner scanner = new Scanner(System.in);

    private final String URL_BASE = "https://gutendex.com/books/" /*charles%20great%20expectations"*/;
    private final String OPTION = "%20";

    public void muestraBusquedaAutor(){



        System.out.println("Intorduce el nombre del autor: ");
        var lecturaBook = scanner.nextLine();
        System.out.println("Nombre del libro: ");
        var lecturaNameBook = scanner.nextLine();
        //------------------------------------------------------------------------------------------
        var json = consumoApi.obtenerDatos(URL_BASE + "?search=" + lecturaBook.toLowerCase() + OPTION + lecturaNameBook.replace(" ", "%20").toLowerCase() /*+ lecturaNameBook.replace(" ", "%20").toLowerCase()*/ );
        System.out.println(json);
        //------------------------------------------------------------------------------------------

        var datos = conversor.obtenDatos(json, DatosGeneral.class);
        System.out.println(datos);

        var datos3 = conversor.obtenDatos(json, DatosLibro.class);
        System.out.println("Datos de tu libro: " + datos3.text());


        //--------------------------------------------------------------------------------------------

        datos.results().stream().limit(5).map(l -> l.title().toUpperCase()).forEach(System.out::println);
        Optional<DatosLibro> libroBuscado = datos.results().stream().filter(l -> l.title().contains(lecturaNameBook)).findFirst();

        if (libroBuscado.isPresent()){
            System.out.println("Libro encontrado: ");
            System.out.println(libroBuscado.get());
        }else {
            System.out.println("No encontrado. Rebisa el autor o el titulo. ");


        }

    }


    public void muestraBusquedaGeneral(){
        var json = consumoApi.obtenerDatos(URL_BASE);
        var datosGenral = conversor.obtenDatos(json, DatosGeneral.class);
        System.out.println(datosGenral);
        //--------------------------------------------------------------

        datosGenral.results().stream().limit(10)
                .map(t -> t.title())
                .forEach(System.out::println);





    }


}
