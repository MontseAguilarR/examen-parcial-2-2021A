package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];
        List<Instrumentos> listaInstrumentos=new LinkedList<>();

        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();

        listaInstrumentos.add(piano);
        listaInstrumentos.add(guitarra);
        listaInstrumentos.add(violin);
        listaInstrumentos.add(flauta);

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        songPlayer.play(song, listaInstrumentos);

    }
}
