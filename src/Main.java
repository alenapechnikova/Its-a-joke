import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        int flag = 1;
        System.out.println("Сейчас мы родим вам человека! Улыбнитесь!");
        do{
            Random a = new Random();
            int birthOfMen = a.nextInt(15);
            if (birthOfMen < 5 ){
                System.out.println("Вы родили сварщика! Поздравляем!!!");
            } else if (birthOfMen >= 5 && birthOfMen < 10) {
                System.out.println("Вы родили штукатура! Поздравляем!!!");
            } else {
                System.out.println("Вы родили маляра! Вот ваша кисточка!!!");
            }
            System.out.print("Введите единичку, если хотите родить еще одного человека: ");
             i = new Scanner(System.in).nextInt();
        }
        while(i == flag);
    }
}