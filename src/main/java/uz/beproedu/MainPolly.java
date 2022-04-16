package uz.beproedu;

import uz.beproedu.mode1.Time;
import uz.beproedu.mode2.Account;
import uz.beproedu.model3.Employe;
import uz.beproedu.model4.Book;

import java.util.List;

public class MainPolly {
    public static void main(String[] args) {
        Time time = new Time();
        time.setHour(12);
        time.setMinute(17);
        time.setSecond(59);
        time.Vaqt();
        System.out.println("====================");
        Account account = new Account();
        account.setHisobRaqam(43242342);
        account.setFirstName("Jahongir Sherjonov");
        account.setBalanc(999999);
        System.out.println(account.toString());

        System.out.println("=====================");
        Employe employe = new Employe();
        employe.setInsp(3243243);
        employe.setName("Jahongir");
        employe.setLastName("Sherjonov");
        employe.setSalary(2341);
        System.out.println(employe.toString());

        System.out.println("====================");
        Book book = new Book();

        book.setIsbn("3453454543234");
        book.setPrice(230);
        book.setBookName("Diqqat");
        System.out.println(book.toString());
        book.setAutor(List.of("Mark", "Jon", "Doe"));
        book.ListAutor();
    }
}
