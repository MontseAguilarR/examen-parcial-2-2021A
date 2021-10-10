package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SongPlayer{


    public static void play(Song song, List<Instrumentos> listaInstrumentos) {

        Iterator<Nota> notas = song.getSongIterator();



       Intrumentos(listaInstrumentos, notas);
        /*while (notas.hasNext()) {
            Nota nota = notas.next();

            switch (instrumento) {
                case PIANO -> piano.presionaTecla(nota);
                case FLAUTA -> flauta.sopla(nota);
                case VIOLIN -> violin.toca(nota);
                case GUITARRA -> guitarra.tocaCuerda(nota);
                default -> System.out.println("Instrumento no soportado");
            }
        }*/

    }

    public static void Intrumentos(List<Instrumentos> items, Iterator<Nota> notas) {

        while(notas.hasNext()){
            Nota nota= notas.next();
            for (Instrumentos item : items) {
                System.out.println(item.getName());
                item.tocar(nota);
            }
        }

    }


}
