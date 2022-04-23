package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.regex.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание: ");
        int a = in.nextInt();
        System.out.print("Введите сверхстепень: ");
        int b = in.nextInt();
        System.out.print("Введите степень: ");
        int c = in.nextInt();
        System.out.println(getHighDegree(a, b, c));

    }

    public static BigInteger getHighDegree(int a, int b, double c){
        int degree = (int)c;
        for(int i = 0; i < b; i++){
            c = Math.pow(c, degree);
        }
        BigInteger c1 = BigInteger.valueOf((long)c);
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger result = c1.multiply(a1);

        return result;
    }
}