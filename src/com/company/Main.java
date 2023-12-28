package com.company;

public class Main {

    public static void main(String[] args) {
/**
 * Prvi primer
 */
//        Card card = new Card (500);
//
//        card.charge(500);
//        card.charge(1);
//
//


        /**
         * Drugi primer
         */
//        Card card = new Card (500);
//
//        charge(card);
//        charge(card);
//
//
//
//    }
//    public static void charge(Card card){
//        card.charge(500);
//    }

        /**
         * Treci primer - Switch case
         */
//
//        String operator = ("/");
//        char c = '*';
//        int x = 10;
//        int y = 20;
//
//        switch  (c){
//            case '*':{
//                System.out.println(x*y);
//            } break;
//            case '-':{
//                System.out.println(x-y);
//            } break;
//            case '+':{
//                System.out.println(x+y);
//            } break;
//            case '/':{
//                if (y!=0){
//                    System.out.println(x/y);
//                }else {
//                    System.out.println("Deljenje nulom");
//                }
//            } break;
//            default:{
//                System.out.println("Operator nije podrzan!");
//            }
//        }


        /**
         * Cetvrti  primer - Deljenje x i y - Moj pokusaj
         */

//        int x = 523134;
//        int y = 325423;
//
//        int ostatak = x % y;
//
//        System.out.println("Ostatak deljenja " + x + " sa " + y + " je " + ostatak);


        /**
         * Peti primer - Deljenje x i y - Aleks
         */
//        int x = 523134;
//        int y = 325423;
//
//        // da li ima ostatka
//        // da li je veci od 1000
//
//        if (x%y==0){
//            System.out.println("Nema ostatka");
//        } else if(x%y>1000){
//            System.out.println("Vece je u 1000");
//        }else if (x%y<1000){
//            System.out.println("Manje je od 1000");
//        }else if (x%y==1000){
//            System.out.println("1000");
//        }
        /**
         * Sesti primer
         */
        String carMake = "Ford";
        int doors = 4;

        switch (carMake) {
            case "Ford": {
                switch (doors) {
                    case 1: {
                        System.out.println("Ford 1");
                        break; // Add a break statement here
                    }
                    case 4: {
                        System.out.println("Ford 4");
                        break;
                    }
                    default: {
                        System.out.println("Ne postoji Ford sa toliko vrata!");
                    }
                }
                break;
            }
            case "BMW": {
                switch (doors) {
                    case 1: {
                        System.out.println("BMW 1");
                        break;
                    }
                    case 4: {
                        System.out.println("BMW 4");
                        break;
                    }
                    default: {
                        System.out.println("Ne postoji BMW sa toliko vrata!");
                    }
                }
                break;
            }
            case "Mercedes": {
                switch (doors) {
                    case 2: {
                        System.out.println("Mercedes 2");
                        break;
                    }
                    case 4: {
                        System.out.println("Mercedes 4");
                        break;
                    }
                    default: {
                        System.out.println("Ne postoji Mercedes sa toliko vrata!");
                    }
                }
            }
            default: {
                System.out.println("Unsupported carMake!");
            }
        }
    }
}
