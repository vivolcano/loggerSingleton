import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Logger logger = Logger.getInstance();

    public static void main(String[] args) throws IOException {

        logger.log(new Date() + " Запуск программы");

        int[] values = getValue();

        List<Integer> list = getRandomList(values[0], values[1]);

        logger.log(new Date() + " Вывод сформированного списка");

        printList(list);

        Filter filter = new Filter(values[2]);

        logger.log(new Date() + " Начало фильтрации");

        List<Integer> result = filter.filterOut(list);

        logger.log(new Date() + " Завершение фильтрации");

        logger.log(new Date() + " Вывод отфильтрованного списка на экран");

        printList(result);

        logger.log(new Date() + " Завершение программы");

    }

    private static void printList(List<Integer> list) {
        for (int value  : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int[] getValue() throws IOException {
        int[] values = new int[3];

        logger.log(new Date() + " Начало ввода данных с консоли");

        logger.log(new Date() + " Ввод размера списка");
        System.out.print(" Введите размер списка: "  + "\n");
        values[0] = Integer.parseInt(reader.readLine());

        logger.log(new Date() + " Ввод границы для значений");
        System.out.print(" Введите верхнюю границу для значений:"   + "\n");
        values[1] = Integer.parseInt(reader.readLine());

        logger.log(new Date() + " Ввод порога для фильтра");
        System.out.print(" Введите порог для фильтра:"   + "\n");
        values[2] = Integer.parseInt(reader.readLine());

        logger.log(new Date() + " Ввод данных с консоли завершен");

        return values;
    }

    private  static List<Integer> getRandomList(int m, int n) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list.add(random.nextInt(n));
        }

        logger.log(new Date() + " Создание и заполнение списка");

        return list;
    }


}

