//package com.company;
//
//import java.util.Scanner;
//
//public class Question {
//
//    public static void main(String[] args) {
//        String[] testOvertaking;
//        testOvertaking = new String[4];
//        testOvertaking[0] = "Что означает термин «Обгон»?";
//        testOvertaking[1] = "1. Выезд на встречную полосу.";
//        testOvertaking[2] = "2. Выезд из занимаемой полосы.";
//        testOvertaking[3] = "3. Любое опережение одного.";
//        String[] testTrafficLights = new String[4];
//        testTrafficLights[0] = "Разрешается ли избегать экстренное торможение?";
//        testTrafficLights[1] = "1. Разрешается.";
//        testTrafficLights[2] = "2. Только в прямом направлении.";
//        testTrafficLights[3] = "3. Запрещается.";
//        String[] testRailway = new String[4];
//        testRailway[0] = "Какие ограничения по обгону, действуют на железнодорожных переездах?";
//        testRailway[1] = "1. Запрещен только на переезде.";
//        testRailway[2] = "2. Запрещен на нем и за 100 м перед ним.";
//        testRailway[3] = "3. Запрещен на нем и за 100 м до и после него.";
//        System.out.println ("Введите номер ответа на вопрос: \n");
//        Scanner scan = new Scanner(System.in);
//        int correctAnswer = 0;
//        int incorrectAnswer = 0;
//        for (String test : testOvertaking) {
//            System.out.println(test);
//        }
//        String input = scan.nextLine();
//        switch (input){
//            case "1":
//                System.out.println ("Ответ верный \n");
//                correctAnswer++;
//                break;
//            default:
//                System.out.println ("Ответ неверный \n");
//                incorrectAnswer++;
//                break;
//        }
//        for (String test : testTrafficLights) {
//            System.out.println(test);
//        }
//        String input1 = scan.nextLine();
//        switch (input1){
//            case "1":
//                System.out.println ("Ответ верный \n");
//                correctAnswer++;
//                break;
//            default:
//                System.out.println ("Ответ неверный \n");
//                incorrectAnswer++;
//                break;
//        }
//        for (String test : testRailway) {
//            System.out.println(test);
//        }
//        String input2 = scan.nextLine();
//        switch (input2){
//            case "2":
//                System.out.println ("Ответ верный \n");
//                correctAnswer++;
//                break;
//            default:
//                System.out.println ("Ответ неверный \n");
//                incorrectAnswer++;
//                break;
//        }
//        System.out.println ("Результат: правильно " + correctAnswer + ", неправильно " + incorrectAnswer);
//    }
//}
