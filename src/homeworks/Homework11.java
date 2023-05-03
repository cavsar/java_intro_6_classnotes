package homeworks;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Homework11 {
    public static void main(String[] args) {



        System.out.println("==========TASK08==========\n");
        int[] arr1 = {7, 4, 11, 23, 17};
        System.out.println(countPrimes(arr1));

        System.out.println("\n==========TASK07==========\n");
        int[] arr2 = {3, 4, 5, 6, 45};
        System.out.println(Arrays.toString(no3or5(arr2)));

        System.out.println("\n==========TASK06==========\n");
        String[] arr3 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr3)));

        System.out.println("\n==========TASK05==========\n");
        System.out.println(averageOfEdges(-10,-8,0));

        System.out.println("\n==========TASK04==========\n");
        checkAge(2002);
    }


    //////////TASK04
    public static void checkAge(int yearOfBirth){
//        LocalDate date = LocalDate.now();
//        int currentYear = date.getYear();

//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
//        int currentYear = Integer.parseInt(dateFormat.format(date));


        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int age = currentYear - yearOfBirth;
        System.out.println(age);
        if(age >= 16 && age <= 100) System.out.println("AGE IS ALLOWED");
        else if(age > 0 && age < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS NOT VALID");

    }

    //////////TASK05
    public static int averageOfEdges(int num1, int num2, int num3){
        return (Math.max(num1, Math.max(num2, num3)) + Math.min(num1, Math.min(num2, num3)))/2;
    }

    //////////TASK06

    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) arr[i] = "###";
        }
        return arr;
    }

    //////////TASK07

    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 15 == 0) arr[i] = 101;
            else if(arr[i] % 5 == 0) arr[i] = 99;
            else if(arr[i] % 3 == 0) arr[i] = 100;
        }
        return arr;
    }

    public static int [] no3or5_2(int [] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) arr2[i] = 101;
            else if (arr[i] % 5 == 0) arr2[i] = 99;
            else if (arr[i] % 3 == 0) arr2[i] = 100;
            else arr2[i] = arr[i];
        }
        return arr2;
    }

    //////////TASK08
    public static int countPrimes(int[] arr){
        int nonPrimeCount = 0;

        for (int i : arr) {
            if (i < 2) {
                nonPrimeCount++;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    nonPrimeCount++;
                    break;
                }
            }
        }

        return arr.length - nonPrimeCount;
    }

//    int count = 0;
//        for (int num : arr) {
//        if (num <= 1) continue;
//        boolean isPrime = true;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            count++;
//        }
//    }
//        return count;



}
