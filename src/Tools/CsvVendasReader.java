package Tools;


import Model.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvVendasReader {

    public static ArrayList<Venda> readCsvFileToVendasArray(String filePath) throws FileNotFoundException {

        ArrayList<Venda> vendasArray = new ArrayList<>();

        File vendasFiles = new File(filePath);
        Scanner vendasScanner = new Scanner(vendasFiles);

        vendasScanner.nextLine();

        while (vendasScanner.hasNextLine()) {
            String linhaAtual = vendasScanner.nextLine();

            String[] linhaDividida = linhaAtual.split(";");

            int idAtracao = Integer.parseInt(linhaDividida[0]);
            String dataMes = linhaDividida[1];
            String clienteTipo = linhaDividida[2];

            Venda vendaAtual = new Venda(idAtracao,dataMes,clienteTipo);

            vendasArray.add(vendaAtual);
        }

        return vendasArray;
    }
}