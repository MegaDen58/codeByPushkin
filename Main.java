package com.company;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.regex.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr = new FileReader("text.txt");
            String x = "";
            int k = 0;
            while ((k = fr.read()) != -1) {
                x += (char) k;
            }
            String text = x.toLowerCase(Locale.ROOT);
            String forIndex = text.replace("\r\n", " ");

            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(text);
            fileWriter.flush();


            Scanner in = new Scanner(System.in);
            System.out.print("Введите слово: ");
            String word = in.nextLine().toLowerCase(Locale.ROOT);
            char[] letter = word.toLowerCase(Locale.ROOT).toCharArray();

            String result = "";


            char[] word1 = word.toCharArray();
            for(int i = 0; i < word.length(); i++){
                String kk = word1[i] + "";
                String first = (int)numberOfString(kk, text) + "";
                int index = forIndex.indexOf(letter[i]);
                String second = index + "";
                result += "(" + first + " ; " + second + ") ";
            }
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static int numberOfString(String str, String word) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("output.txt"));
            String S = word;
            int i = 0;
            while ((S = reader.readLine()) != null) {
                i++;
                if (S.contains(str)) {
                    return i;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}