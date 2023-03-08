package Stepic;

import java.util.List;
import java.util.Scanner;

public class Taluk {
    private static List<Person> person;
    private static int number;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
        }


    public static void mainMenu() {
        System.out.println("________________________________________");
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("1 - Ввести или обновить информацию");
        System.out.println("2 - Вывести информацию");
        System.out.println("0 - Завершить работу ");
        System.out.print("Введите номер пункта меню: ");
        number = scanner.nextInt();
        if (number == 1) {
            inPutInformation1111();
        } else if (number == 2) {
            outPutInformation();
        } else {
            return;
        }
    }

    public static void inPutInformation1111() {
        System.out.println("_________________________________________");
        System.out.println("1 - Личная информация");
        System.out.println("2 - Информация о предпренимателе");
        System.out.println("0 - назад");
        System.out.print("Введите номер пункта меню: ");
        number = scanner.nextInt();
        if (number == 1){
            myInformation ();
        }
    }
    public static void myInformation () {
        Person myInformation = new Person();
        System.out.print("Введите имя: ");
        String a = scanner.nextLine();
        myInformation.setNamePerson(a);
        System.out.println();
        System.out.print("Введите возраст: ");
        int b = scanner.nextInt();
        myInformation.setAge(b);
        System.out.println();
        System.out.print("Введите номер телефона (+375XX XX-XX-XXX): ");
        myInformation.setNomer(scanner.nextLine());
        System.out.println();
        System.out.print("Введите адрес электронной почты: ");
        myInformation.setMail(scanner.nextLine());
        System.out.println();
        System.out.print("Введите почтовый индекс: ");
        myInformation.setPostIndex(scanner.nextInt());
        System.out.println();
        System.out.print("Введите почтовый адрес: ");
        myInformation.setPostAdres(scanner.nextLine());
        System.out.println();
        person.add(myInformation);
        inPutInformation1111();
    }

    public static void outPutInformation () {
        System.out.println("_________________________________________");
        System.out.println("1 - Общая информация");
        System.out.println("2 - Вся информация");
        System.out.println("0 - назад");
        System.out.print("Введите номер пункта меню: ");
        number = scanner.nextInt();
    }
}
