import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
    int [] year = new int [12];
        year [0] = 1;
        year [1] = 2;
        year [2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.print(year[i] + " ");
        }
        System.out.println();
        System.out.println("Задача 2");
        double [] weight = {1.57, 7.654, 9.986};
        System.out.print(weight[0]+ ", ");
        System.out.print(weight[1]+ ", ");
        System.out.print(weight[2]);
        System.out.println();
        System.out.println("Задача 3");
        int [] year1 = new int [3];
        year1 [0] = 1;
        int yearA1 = year1 [0];
        year1 [1] = 2;
        int yearB1 = year1 [1];
        year1 [2] = 3;
        int yearC1 = year1 [2];
        System.out.print(year1[2] + ", ");
        System.out.print(year1[1]  + ", ");
        System.out.print(year1[0]);
        System.out.println();
        double [] weight1 = {1.57, 7.654, 9.986};
        System.out.print(weight1[2]+ ", ");
        System.out.print(weight1[1]+ ", ");
        System.out.print(weight1[0]);
        System.out.println();
        System.out.println("Задача 4");
        int [] year2 = {1, 2, 3};
        for (int i = 0; i < year2.length ; i++) {
            if (year2[i]%2 != 0); {
                year2[i] += 1;
                System.out.print(year2[i] + " ");
            }

            
        }




    }}