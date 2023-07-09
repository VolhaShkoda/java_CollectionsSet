package practice;

import java.util.*;

import static practice.Main.WRONG_EMAIL_ANSWER;

public class EmailList {
    TreeSet<String> emailList = new TreeSet<>();
    String regexEmail = "^([A-Za-z0-9_-]+\\.)*[A-Za-z0-9_-]+@[A-Za-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

    public void add(String email) {
        email = email.toLowerCase();
        if (email.matches(regexEmail)) {
            emailList.add(email);
        }else {
            System.out.println(WRONG_EMAIL_ANSWER +1);
        }

        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
    }

    public List<String> getSortedEmails() {
        for (String emails : emailList) {
            System.out.println(emailList);
        }
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emailList);
    }
}
