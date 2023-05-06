package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("input massiv: ");
        int M = sc.nextInt();
        int[] Array = FillArray(M);
        PrintArray(Array);
        /*Создайте массив, содержащий 10 первых нечетных чисел.
         Выведете элементы массива на консоль в  одну строку, разделяя запятой. */
        System.out.println("\n10 Odd elment: ");
        Odd(Array, 0);
         /*Создать массив, на четных местах в котором стоят единицы,
         а на нечетных местах - числа, равные  остатку от деления своего номера на 5. */
        System.out.println("\ntask2:");
        EvenAndOdd(Array);
        /* Найдите сумму нечетных чисел массива, которые не превосходят 11.*/
        System.out.println("\nSum Odd<11:");
        Array=FillArray(M);
        SumOdd(Array, 0, 0);
        /* В данном массиве найти максимальное количество одинаковых элементов. */
        System.out.println();
        PrintArray(Array);
        System.out.println();
        int count = 0;
        int maxDup = Array[0];
        for(int i = 0; i < Array.length; i++)
        {
            int tCount = CountDup(Array, i, Array[i]);
            if(tCount > count)
            {
                count = tCount;
                maxDup = Array[i];
            }
        }
        System.out.print("count: " + count);
        System.out.print("max: "+maxDup);
        /*Дан массив, в котором количество отрицательных элементов равно количеству положительным.
        Поменяйте местами первый отрицательный и первый положительный, второй отрицательный и  второй положительный и так далее. */
        System.out.println();
        MinMaxNumbers();

    }

    public static void MinMaxNumbers() {
        Random rn = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = rn.nextInt(-25, -5);
            System.out.print(a[i]+",");
        }System.out.println();
        for (int i = 0; i < 10; i++) {
            b[i] = rn.nextInt(25, 50);
            System.out.print(b[i]+",");
        }
        for (int i=0;i<10;i++){
            int temp;
            temp=a[i];
            a[i]=b[i];
            b[i]=temp;
        }System.out.println("\nSwapNumbers");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]+",");
        }System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i]+",");
        }



        return;
    }

    public  static int CountDup(int[] Array, int pos, int b){
        int count=0;
        for(int i=pos;i< Array.length;i++){
                if(b==Array[i])
                    count++;
            }
        return count;
    }
    public static int SumOdd(int[] Array, int sum, int g){
        for(int i=0;i< Array.length&&g<11;i++){
            if(Array[i]%2!=0){
                sum+=Array[i];
            }
        } System.out.print("sum: "+sum);
        g++;
        return sum;
    }
    public static void EvenAndOdd(int[]Array) {
        System.out.println("Even:");
        for (int i = 0; i < Array.length; i++) {
            if (i % 2 == 0) {
                Array[i] = 1;
                System.out.print(Array[i] + ",");
            }
        }System.out.println("\nOdd:");
        for(int i=0;i< Array.length;i++){
            if(i%2!=0){
                Array[i]=i%5;
                System.out.print(Array[i]+",");
            }
        }

    }
    public static int[] Odd(int[] Array,int g){
        for(int i=0;i< Array.length&&g<10;i++){
            if(Array[i]%2!=0){
                System.out.print(Array[i]+",");
                g++;
            }
        }
        return Array;
    }
    public static int[] FillArray(int M){
        Random rn=new Random();
        int[] Array=new int[M];
        for(int i=0;i<M;i++){
            Array[i]= rn.nextInt(10,100);
        }
        return Array;
    }
    public static void PrintArray(int[] Array){
        for(int i=0;i< Array.length;i++){
            System.out.print(Array[i]+",");
        }
    }
}
