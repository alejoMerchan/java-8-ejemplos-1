package com.java.eight.in.action;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by abelmeos on 2016/10/20.
 */
public class LambdasExample {

    /**
     * metodo inicial
     *
    public static String processFile() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

     **/

    /**
     * Refactor del metodo inicial
     *
     * como parametro recibe la functional inteface definida, con metodo de la forma:
     *
     * f (BufferedReader) =>  String
     *
     */

    public static String processFile(BuffereedReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }

    public void implementandoElLLamado() throws  IOException{

        // ejemplo para procesar una linea:

        String oneLine = processFile((BufferedReader br) -> br.readLine());

        // ejemplo para procesar dos lineas:

        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());

    }

}
