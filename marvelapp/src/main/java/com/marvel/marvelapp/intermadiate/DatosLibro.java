package com.marvel.marvelapp.intermadiate;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosLibro(
        @JsonAlias("title") String title,
        @JsonAlias("id") Integer id,
        @JsonAlias("authors") List<DatosAutores> autors,
        @JsonAlias("download_count") Double downloads,
        @JsonAlias("subjects") List<String> subjects,
        @JsonAlias("image/jpeg") String image,
        @JsonAlias("text/html") String text
) {
}
