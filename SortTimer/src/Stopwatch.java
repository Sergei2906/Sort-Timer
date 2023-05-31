public class Stopwatch {
 /** Скрытые поля данных startTime и endTime */
    private long startTime;
    private long endTime;

    /** Безаргументный конструктор, который инициализирует startTime с текущем временем */
    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    /** Метод с именем start() который сбрасывает startTime до текущего времени */
    public void start() {
        startTime = System.currentTimeMillis();
    }

    /** Метод с именем stop() который присваивает endTime текущее время */
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    /** Метод с именем getElapsedTime() который возвращает прошедшее время на секундомере в миллисекундах  */
    public long getElapsedTime() {
        return endTime - startTime;
    }
}