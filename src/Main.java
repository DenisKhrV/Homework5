public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        byte clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        short year = 2021;
        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        short deliveryDistance = 165;
        byte deliveryTime = 1;
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        }else if(20 <= deliveryDistance && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        }else if(60 < deliveryDistance && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        }else{
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte monthNumber = 4;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит сезону осень");
        }
    }
}