package random;

import utilities.Printer;

public class StudentSelector {
    public static void main(String[] args) {
        /**
         *
         *Below code is fetching a student name randomly when invoked
         *There is chance that one student could be selected multiple time in a row
         */

        String[] students = {
                "Adam",
                "Ali",
                "Alina",
                "Altynai",
                "Anatolii",
                "Anton",
                "Assem",
                "Ayat",
                "Bakrieh",
                "Belal",
                "Carmela",
                "Cihan",
                "Dumitru",
                "Fidan",
                "Gurkan",
                "Hadi",
                "Hamza A",
                "Hamza I",
                "Hayriye",
                "Jehad",
                "Lesia",
                "Louie",
                "Matthew",
                "Melek",
                "Meerim",
                "Mutaz",
                "Okan",
                "Pinar",
                "Paul",
                "Ruby",
                "Sabir",
                "Sandina",
                "Vildan",
                "Yana",
                "Yazan",
                "Yhehia",
                "Yousef",
                "Zeliha",
                "Zhazira",
        };
        System.out.println("The lucky student is = " + students[(int) (Math.random() * students.length)].toUpperCase());
    }
}
