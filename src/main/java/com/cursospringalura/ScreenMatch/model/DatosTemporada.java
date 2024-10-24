package com.cursospringalura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosTemporada(

        @JsonAlias("Season")
        Integer numeroTemporada,

        @JsonAlias("Episodes")
        List<DatosEpisodio> episodios
) {
        @Override
        public String toString() {
                return "\nNumero Temporada: " + numeroTemporada +
                       "\nEpisodios: " + episodios.size();
        }
}
