package hu.progmatic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    private static final String COMMA_DELIMITER = "; ";

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> sorSz = new ArrayList<>();
        ArrayList<String> datum = new ArrayList<>();
        ArrayList<String> gyoztes = new ArrayList<>();
        ArrayList<String> eredmeny = new ArrayList<>();
        ArrayList<String> vesztes = new ArrayList<>();
        ArrayList<String> helyszin = new ArrayList<>();
        ArrayList<String> varosAllam = new ArrayList<>();
        ArrayList<Integer> nezoszam = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("SuperBowl.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] lineParts = line.split("; ");
                sorSz.add((Integer.valueOf(lineParts[0]));
                datum.add(lineParts[1]);
                gyoztes.add(lineParts[2]);
                eredmeny.add(lineParts[3]);
                vesztes.add(lineParts[4]);
                helyszin.add(lineParts[5]);
                varosAllam.add(lineParts[6]);
                nezoszam.add(Integer.valueOf(lineParts[7]));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

