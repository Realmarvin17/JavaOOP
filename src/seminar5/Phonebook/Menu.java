package seminar5.Phonebook;

import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");

        System.out.println(". ".repeat(15));
        System.out.println("Выберите действие: ");

        int input=in.nextInt();
        FileManager run=new FileManager();
        AddressBook phones=new AddressBook();
        phones.Addressable();

        switch (input) {
            case 1 -> phones.showAddressBook(phones.pb);
            case 2 -> {
                run.ExportFile(phones.pb);
                System.out.println("Export finish");
            }
            case 3 ->
                // phones.showAddressBook();
                    phones.showAddressBook(run.ImportFile());
        }
    }
}

