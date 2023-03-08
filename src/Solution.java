import java.util.Scanner;
public class Solution {
    private static int first;
    private static int second;
    private static int sum;
    private static String result;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inPut = scanner.nextLine();
        String[] symbol = inPut.split(" ");
        if (symbol.length > 3) {
            throw new Exception("Выражение не соответсвует условию");
        }
        if (checkArabic(symbol[0], symbol[2])) {
            sum = cals(first, second, symbol[1]);
            result = String.valueOf(sum);
            System.out.println(result);
        } else if (checkRoma(symbol[0], symbol[2])) {
            first = romanToArabic(symbol[0]);
            second = romanToArabic(symbol[2]);
            sum = cals(first, second, symbol[1]);
            if (sum > 0) {
                StringBuilder sus = arabiaConvertRoma(sum);
                System.out.println(sus);
            } else {
                throw new Exception("Число меньше 1");
            }

        } else {
            throw new Exception("Ошибка");
        }
    }

    private static boolean checkArabic(String a, String b) {
        try {
            first = Integer.parseInt(a);
            second = Integer.parseInt(a);
            if (first > 0 && first < 11 && second > 0 && second < 11) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean checkRoma(String a, String b) {
        try {
            if (romanToArabic(a) > 0 && romanToArabic(b) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static int romanToArabic(String a) {
        switch (a) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        throw new RuntimeException("Такой цифры не существует");
    }

    public static int cals(int first, int second, String symbol) {
        switch (symbol) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
        }
        throw new RuntimeException("Такого символа не существует");
    }

    private static StringBuilder arabiaConvertRoman(int numb) {
        StringBuilder roman = new StringBuilder();
        while (numb > 0) {
            if (numb / 50 > 0) {
                roman = roman.append("L");
                numb = numb - 50;
            } else if (numb / 10 > 0) {
                int ten = 0;
                for (int i = 0; i < (numb / 10); i++) {
                    roman = roman.append("X");
                    ten = i + 1;
                }
                numb = numb - (ten * 10);
            } else if (numb / 5 > 0) {
                numb = numb - 5;
                roman = roman.append("V");
            } else if (numb == 4) {
                roman = roman.append("IV");
                numb = numb - 4;
            } else {
                while (numb > 0 & numb < 4) {
                    roman = roman.append("I");
                    numb--;
                }
            }
        }

        return roman;
    }

    private static StringBuilder arabiaConvertRoma(int numb) {
        StringBuilder bilder = new StringBuilder();
        while (numb > 0) {
            if (numb / 100 > 0) {
                bilder.append("C");
                numb = numb - 100;
            } else if (numb / 90 > 0) {
                bilder.append("IC");
                numb = numb - 90;
            } else if (numb / 50 > 0) {
                bilder.append("L");
                numb = numb - 50;
            } else if (numb / 40 > 0) {
                bilder.append("IL");
                numb = numb - 40;
            } else if (numb / 10 > 0) {
                bilder.append("X");
                numb = numb - 10;
            } else if (numb / 9 > 0) {
                bilder.append("IX");
                numb = numb - 9;
            } else if (numb / 5 > 0) {
                bilder.append("V");
                numb = numb - 5;
            } else if (numb / 4 > 0) {
                bilder.append("IV");
                numb = numb - 4;
            } else if (numb / 1 > 0) {
                bilder.append("I");
                numb = numb - 1;
            }
        }
        return bilder;
    }
}







