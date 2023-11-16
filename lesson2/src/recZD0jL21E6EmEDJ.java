import java.util.Random;

public class recZD0jL21E6EmEDJ {
    public static void main(String[] args) {
        // 1 уровень сложности: №1
        //1 Напишите программу, в которой объявите переменные всех примитивных типов.
        // Значение для каждой переменной сгенерируйте с помощью класса Random.
        // При необходимости используйте приведение типов. Полученные значения выведите в консоль.

        Random rnd = new Random();
        int rndInt = rnd.nextInt(8);
        double rndDouble = rnd.nextDouble();
        byte rndByte = (byte) rnd.nextInt(-128, 127);
        boolean rndBoolean = rnd.nextBoolean();
        char rndChar = (char) rnd.nextInt('A', 'Z' + 1);
        short rndShort = (short) rnd.nextInt(Short.MAX_VALUE + 200);
        long rndLong = rnd.nextLong(15041996L);

        System.out.println(rndInt);
        System.out.println(rndDouble);
        System.out.println(rndByte);
        System.out.println("I make a code:" + rndBoolean);
        System.out.println(rndChar);
        System.out.println(rndShort);
        System.out.println(rndLong);
        //2 В этой же программе создайте переменную типа String. Сгенерируйте значение для строки.
        // При необходимости используйте метод String.valueOf().
        // Ограничений на длину строки и содержимое нет.
        // Полученное значение выведите в консоль.
        String [] words = {"banana","apple","kiwi","strawberry","orange","grape"};
        String rndWords = words[rnd.nextInt(words.length)];
        String stringValue = String.valueOf(rndWords);
        System.out.println("Случайное слово:" + stringValue);

    }
}
