import java.util.Random;

public class StopWatchClient {
    public static void main(String[] args) {
        /** Создаем объект Stopwatch */
        Stopwatch stopwatch = new Stopwatch();

        /** Генерируем массив из 100000 случайных чисел */
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }

        /** Запускаем секундомер */
        stopwatch.start();

        /** Сортируем массив методом выбора */
        selectionSort(array);

        /** Останавливаем секундомер */
        stopwatch.stop();

        /** Выводим прошедшее время на секундомере в миллисекундах */
        System.out.println("Время выполнения сортировки: " + stopwatch.getElapsedTime() + " миллисекунд");
    }

    /** Метод для сортировки массива методом выбора */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
         /** Находим индекс минимального элемента в подмассиве от i до конца */
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            /** Меняем местами минимальный элемент с элементом на позиции i */
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}