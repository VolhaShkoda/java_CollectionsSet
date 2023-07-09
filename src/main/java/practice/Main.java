package practice;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {

        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);

         String comand = "";
         String emails = "";

        while (true) {
            String input = scanner.nextLine();
            String[] text = input.split("\\s+");
             if (text.length == 2) {
                 comand = text[0];
                 emails = text[1];
             } else if(text.length == 1) {
                 comand = text[0];
                 emails = "";
             }

            if (input.equals("0")) {
                break;
            }

            if (comand.equals("LIST")) {
                emailList.getSortedEmails();
              } else if (comand.equals("ADD")) {
                emailList.add(emails.toLowerCase(Locale.ROOT));
                }
            //TODO: write code here
        }
    }
}
