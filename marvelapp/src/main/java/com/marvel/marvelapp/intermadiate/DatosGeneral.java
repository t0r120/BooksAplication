package com.marvel.marvelapp.intermadiate;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosGeneral(
        @JsonAlias("count") Integer count,
        @JsonAlias("results") List<DatosLibro> results
) {
}
