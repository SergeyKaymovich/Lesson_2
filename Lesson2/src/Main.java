import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fuel92Type = 2.4;                                                                 // Цена за топливо.
        double fuel95Type = 2.5;                                                                 // Цена за топливо.
        double fuelDtType = 2.5;                                                                 // Цена за топливо.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип топлива: " + "\n" +"1.   95 - " + fuel95Type + " руб." +
                "\n" + "2.   92 - " + fuel92Type + " руб."+ "\n" +  "3.   Дизельное топливо - " + fuelDtType + " руб.");
        try {
            int nameType = scanner.nextInt();
            if (nameType == 1){                                                                          // Выбор топлива.
                System.out.println("Укажите количество топлива: ");
                double count = scanner.nextInt();                                              // Количество литров.
                double  amaunt = count * fuel95Type;                                     // Общая сумма.
                System.out.println("Сумма к оплате: " + amaunt + " руб.");
            }
            else if (nameType == 2){                                                                 // Выбор топлива.
                System.out.println("Укажите количество топлива: ");
                double count = scanner.nextInt();                                              // Количество литров.
                double  amaunt = count * fuel92Type;                                     // Общая сумма.
                System.out.println( "Сумма к оплате: " + amaunt + " руб.");
            }
            else if (nameType == 3 ){                                                                // Выбор топлива.
                System.out.println("Укажите количество топлива: ");
                double count = scanner.nextInt();                                              // Количество литров.
                double  amaunt = count * fuelDtType;                                     // Общая сумма.
                System.out.println( "Сумма к оплате: " + amaunt + " руб.");
            }
            else if (nameType != 1 || nameType != 2 || nameType != 3 ){    // Указан не верный тип топлива.
                System.out.println("Выбран не верный тип топлива.");
            }
        } catch (InputMismatchException exception){
            System.out.println("Введен неверный формат.");
        }
    }
}


