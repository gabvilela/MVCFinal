package Tools;


import Model.Atracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvAtracoesReader {

    public static ArrayList<Atracao> readCsvFileToAtracoesArray(String filePath) throws FileNotFoundException {

        ArrayList<Atracao> atracoesArray = new ArrayList<>();

        File atracoesFiles = new File(filePath);
        Scanner atracoesScanner = new Scanner(atracoesFiles);

        atracoesScanner.nextLine();

        while (atracoesScanner.hasNextLine()) {
            String linhaAtual = atracoesScanner.nextLine();

            String[] linhaDividida = linhaAtual.split(";");

            int id = Integer.parseInt(linhaDividida[0]);
            String nome = linhaDividida[1];
            double precoAdulto = Double.parseDouble(linhaDividida[2]);
            double precoCrianca = Double.parseDouble(linhaDividida[3]);
            int segundos = Integer.parseInt(linhaDividida[4]);

            Atracao atracaoAtual = new Atracao(id,nome,precoAdulto,precoCrianca,segundos);

            atracoesArray.add(atracaoAtual);
        }

        return atracoesArray;
    }
}