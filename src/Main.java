import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*• Создать интерфейс MailDeliveryService с одним методом void sendMail().
• Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
• Создайте класс Email, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
• Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты — напечатать что-то вроде: «Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
• Создайте класс Sender. Реализуйте в нем метод send(), который в качестве аргумента MailDeliveryService и отправляет почту с помощью данной службы.
• Реализуйте диалог с пользователем (использовать Scanner), как отправлять почту и отправлять ее с помощью Sender.
*/
        MailDeliveryService maile = null;
        System.out.println("1. Отправить DHL");
        System.out.println("2. Отправить  Email");
        System.out.println("3. Отправить  Pigeon");
        System.out.println("Любая другая цифра - выход.");

        Scanner s = new Scanner(System.in);
        int way = s.nextInt();
        switch (way) {
            case 1:
                maile = new DHL();
                break;
            case 2:
                maile = new Email();
                break;
            case 3:
                maile = new Pigeon();
                break;
        }
        if (maile != null) {
            Sender sender = new Sender(maile);
            sender.sendingMaile();
        }
    }

}
/*int[] array; array = new int[12]; for (int i = 0; i <array.length ; i++) { array[i]=( (int)(Math.random()*12) - 15 ); System.out.println(array[i]); */
/*int[] array = new int[12];
for (int i = 0; i < array.length; i++) {
    array[i] = ((int)(Math.random() * 31) - 15);
    System.out.println(array[i]);
}*/