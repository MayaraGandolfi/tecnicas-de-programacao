package br.com.ada.arquivo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    //    C:\Users\HP\IdeaProjects\tecnicas-de-programacao\src
    static String nomeArquivo = "C:/Users/HP/IdeaProjects/tecnicas-de-programacao/src/main/resources/files/teste.txt";

    public static void main(String[] args) {

        Path path = Paths.get(nomeArquivo);
        File testeFile = path.toFile();
        System.out.println("Se existe: " + testeFile.exists());
        System.out.println("Se é uma pasta: " + testeFile.isDirectory());
        System.out.println("Tamanho: " + testeFile.length());
        System.out.println("Data de modificação: " + testeFile.lastModified());

//        var usuariosPath = Paths.get(nomeArquivo);
//        System.out.println(usuariosPath.toUri());

//        Files.createDirectories(Path.of("C:/Users/HP/IdeaProjects/tecnicas-de-programacao/src/main/resources/teste.txt",
//                "C:/Users/HP/IdeaProjects/tecnicas-de-programacao/src/main/resources/teste1.txt"));




    }
}
