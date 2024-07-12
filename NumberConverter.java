/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newcoursework;

/**
 *
 * @author HESHAN
 */
import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showHomePage();
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> decimalConverter(scanner);
                case 2 -> binaryConverter(scanner);
                case 3 -> octalConverter(scanner);
                case 4 -> hexadecimalConverter(scanner);
                case 5 -> romanConverter(scanner);
                case 0 -> {
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void showHomePage() {
        System.out.println("                            __   ______             __           ");
        System.out.println("                           |  \\ /      \\           |  \\          ");
        System.out.println("                            \\$$|  $$$$$$\\  ______  | $$  _______ ");
        System.out.println("                           |  \\| $$   \\$$ |      \\ | $$ /       \\");
        System.out.println("                           | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
        System.out.println("                           | $$| $$   __  /      $$| $$| $$      ");
        System.out.println("                           | $$| $$__/  \\|  $$$$$$$| $$| $$_____ ");
        System.out.println("                           | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
        System.out.println("                            \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");        
        
        System.out.println(" ");
        
        System.out.println("  _   _                    _                    _____                                   _              ");
        System.out.println(" | \\ | |                  | |                  / ____|                                 | |             ");
        System.out.println(" |  \\| | _   _  _ __ ___  | |__    ___  _ __  | |       ___   _ __  __   __  ___  _ __ | |_   ___  _ __ ");
        System.out.println(" | . ` || | | || '_ ` _ \\ | '_ \\  / _ \\| '__| | |      / _ \\ | '_ \\ \\ \\ / / / _ \\| '__|| __| / _ \\| '__|");
        System.out.println(" | |\\  || |_| || | | | | || |_) ||  __/| |    | |____ | (_) || | | | \\ V / |  __/| |   | |_ |  __/| |    | |\\  || |_| || | | | | || |_) ||  __/| |    | |____ | (_) || | | | \\ V / |  __/| |   | |_ |  __/| |   ");
        System.out.println(" |_| \\_| \\__,_||_| |_| |_||_.__/  \\___||_|     \\_____| \\___/ |_| |_|  \\_/   \\___||_|    \\__| \\___||_|   ");
        
        System.out.println("===============================================================================================");

        System.out.println(" ");
        
        System.out.println("[01] Decimal Converter");
        System.out.println("[02] Binary Converter");
        System.out.println("[03] Octal Converter");
        System.out.println("[04] Hexadecimal Converter");
        System.out.println("[05] Roman Number Converter");
        System.out.println("[00] Exit");
        System.out.println(" ");
        System.out.print("Enter option -> ");
    }

    private static void decimalConverter(Scanner scanner) {
        while (true) {
            System.out.println(" ");
            System.out.println("+------------------------------------+");
            System.out.println("|          Decimal Converter         |");
            System.out.println("+------------------------------------+");
            System.out.println(" ");
            System.out.print("Enter an Decimal number: ");
            int decimal = scanner.nextInt();
            if (decimal < 0) {
                invalidInput(scanner);
                continue;
            }
            System.out.println(" ");
            System.out.println("Binary number: " + decimalToBinary(decimal));
            System.out.println("Octal number: " + decimalToOctal(decimal));
            System.out.println("Hexadecimal number: " + decimalToHexadecimal(decimal));
            if (goToHomePage(scanner)) return;
        }
    }

    private static void binaryConverter(Scanner scanner) {
        while (true) {
            System.out.println(" ");
            System.out.println("+------------------------------------+");
            System.out.println("|          Binary Converter          |");
            System.out.println("+------------------------------------+");
            System.out.println(" ");
            System.out.print("Enter an Binary number: ");
            String binary = scanner.next();
            if (!binary.matches("[01]+")) {
                invalidInput(scanner);
                continue;
            }
            int decimal = binaryToDecimal(binary);
            System.out.println(" ");
            System.out.println("Decimal number: " + decimal);
            System.out.println("Octal number: " + decimalToOctal(decimal));
            System.out.println("Hexadecimal number: " + decimalToHexadecimal(decimal));
            if (goToHomePage(scanner)) return;
        }
    }

    private static void octalConverter(Scanner scanner) {
        while (true) {
            System.out.println(" ");
            System.out.println("+------------------------------------+");
            System.out.println("|          Octal Converter           |");
            System.out.println("+------------------------------------+");
            System.out.println(" ");
            System.out.print("Enter an Octal number: ");
            String octal = scanner.next();
            if (!octal.matches("[0-7]+")) {
                invalidInput(scanner);
                continue;
            }
            int decimal = octalToDecimal(octal);
            System.out.println(" ");
            System.out.println("Decimal number: " + decimal);
            System.out.println("Binary number: " + decimalToBinary(decimal));
            System.out.println("Hexadecimal number: " + decimalToHexadecimal(decimal));
            if (goToHomePage(scanner)) return;
        }
    }

    private static void hexadecimalConverter(Scanner scanner) {
        while (true) {
            System.out.println(" ");
            System.out.println("+------------------------------------+");
            System.out.println("|          Hexadecimal Converter     |");
            System.out.println("+------------------------------------+");
            System.out.println(" ");
            System.out.print("Enter an Hexadecimal number: ");
            String hex = scanner.next();
            if (!hex.matches("[0-9A-Fa-f]+")) {
                invalidInput(scanner);
                continue;
            }
            int decimal = hexToDecimal(hex);
            System.out.println(" ");
            System.out.println("Decimal number: " + decimal);
            System.out.println("Binary number: " + decimalToBinary(decimal));
            System.out.println("Octal number: " + decimalToOctal(decimal));
            if (goToHomePage(scanner)) return;
        }
    }

    private static void romanConverter(Scanner scanner) {
        while (true) {
            System.out.println(" ");
            System.out.println("+------------------------------------+");
            System.out.println("|       Roman Number Converter       |");
            System.out.println("+------------------------------------+");
            System.out.println(" ");
            System.out.println("[01] Decimal Number to Roman Number Converter");
            System.out.println("[02] Roman Number to Decimal Number Converter");
            System.out.println(" ");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println(" ");
                    System.out.println("+----------------------------------------------------+");
                    System.out.println("|     Decimal Number to Roman Number Converter       |");
                    System.out.println("+----------------------------------------------------+");
                    System.out.println(" ");
                    System.out.print("Enter an Decimal number: ");
                    System.out.println(" ");
                    int decimal = scanner.nextInt();
                    if (decimal < 0) {
                        invalidInput(scanner);
                        continue;
                    }   System.out.println("Roman numeral: " + decimalToRoman(decimal));
                }
                case 2 -> {
                    System.out.print("Enter an Roman number: ");
                    System.out.println(" ");
                    String roman = scanner.next();
                    if (!roman.matches("[IVXLCDMivxlcdm]+")) {
                        invalidInput(scanner);
                        continue;
                    }   System.out.println("Decimal number: " + romanToDecimal(roman.toUpperCase()));
                }
                default -> {
                    System.out.println("Invalid option...");
                    System.out.println(" ");
                    continue;
                }
            }
            if (goToHomePage(scanner)) return;
        }
    }

    
    private static void invalidInput(Scanner scanner) {
        System.out.println("           Invalid input...");
        System.out.println(" ");
        System.out.print("Do you want to input number again? (Y/N) -> ");
        char retry = scanner.next().charAt(0);
        if (retry == 'N' || retry == 'n') showHomePage();
    }

    private static boolean goToHomePage(Scanner scanner) {
        System.out.println(" ");
        System.out.print("Do you want to go to homepage (Y/N)-> ");
        char home = scanner.next().charAt(0);
        return home == 'Y' || home == 'y';
    }

    private static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    private static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        return octal.length() > 0 ? octal.toString() : "0";
    }

    private static String decimalToHexadecimal(int decimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        while (decimal > 0) {
            hex.insert(0, hexDigits[decimal % 16]);
            decimal /= 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        return decimal;
    }

    private static int octalToDecimal(String octal) {
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++) {
            decimal = decimal * 8 + (octal.charAt(i) - '0');
        }
        return decimal;
    }

    private static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (c >= '0' && c <= '9') {
                decimal = decimal * 16 + (c - '0');
            } else if (c >= 'A' && c <= 'F') {
                decimal = decimal * 16 + (c - 'A' + 10);
            } else if (c >= 'a' && c <= 'f') {
                decimal = decimal * 16 + (c - 'a' + 10);
            }
        }
        return decimal;
    }

    private static String decimalToRoman(int num) {
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return m[num / 1000] + c[(num % 1000) / 100] + x[(num % 100) / 10] + i[num % 10];
    }

    private static int romanToDecimal(String roman) {
        int[] values = new int[roman.length()];
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I' -> values[i] = 1;
                case 'V' -> values[i] = 5;
                case 'X' -> values[i] = 10;
                case 'L' -> values[i] = 50;
                case 'C' -> values[i] = 100;
                case 'D' -> values[i] = 500;
                case 'M' -> values[i] = 1000;
            }
        }
        int decimal = 0;
        for (int i = 0; i < values.length; i++) {
            if (i > 0 && values[i] > values[i - 1]) {
                decimal += values[i] - 2 * values[i - 1];
            } else {
                decimal += values[i];
            }
        }
        return decimal;
    }
}

