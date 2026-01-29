public class Main {
    public static void main(String[] args) {
        var clock = 640;
        var oneDayWatch = 8;
        var oneDayWorker = clock / oneDayWatch;
        var humanWorker = oneDayWorker + 94;
        var clock1 = humanWorker * 8;
        System.out.println("Всего работников в компании - " + oneDayWorker + " человек");
        System.out.println("Если в комании работает " + humanWorker + " человек,то всего " + clock1 + " часов работы может быть поделено между сотрудниками");
    }
}

