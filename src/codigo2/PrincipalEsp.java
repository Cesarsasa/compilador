/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo2;

import codigo.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Charly Ponce
 */
public class PrincipalEsp {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:\\Users\\CESAR\\Documents\\NetBeansProjects/AnalizadorLexico/src/codigo/Lexer2.flex";
        String ruta2 = "C:\\Users\\CESAR\\Documents\\NetBeansProjects/AnalizadorLexico/src/codigo/LexerCup2.flex";
        String[] rutaS = {"-parser", "Sintax2", "C:\\Users\\CESAR\\Documents\\NetBeansProjects/AnalizadorLexico/src/codigo/Sintax2.cup"};
        generar(ruta1, ruta2, rutaS);
        }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
       
        Path rutaSymE = Paths.get("C:\\Users\\CESAR\\Documents\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\symE.java");
        if (Files.exists(rutaSymE)) {
            Files.delete(rutaSymE);
        }
        Files.move(
                Paths.get("C:\\Users\\CESAR\\Documents\\NetBeansProjects\\AnalizadorLexico\\symE.java"), 
                Paths.get("C:\\Users\\CESAR\\Documents\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\symE.java")
        );
        Path rutaSin = Paths.get("C:\\Users\\CESAR\\Documents\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\Sintax2.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:\\Users\\CESAR\\Documents\\NetBeansProjects\\AnalizadorLexico\\Sintax2.java"), 
                Paths.get("C:\\Users\\CESAR\\Documents\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\Sintax2.java")
        );
    }
}
