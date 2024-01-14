public class CreditCard {
    // Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    // Добавьте метод, который позволяет начислять сумму на кредитную
    //  карточку.
    //  Добавьте метод, который позволяет снимать с карточки некоторую
    //  сумму.
    //  Добавьте метод, который выводит текущую информацию о карточке.
    //  Напишите программу, которая создает три объекта класса CreditCard у
    //  которых заданы номер счета и начальная сумма
    private String accountNumber;
    private double balance;

    // Конструктор класса
    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для начисления суммы на кредитную карточку
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Сумма " + amount + " успешно начислена на карточку с номером " + accountNumber + ".");
    }

    // Метод для снятия суммы с карточки
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Сумма снятия  " + amount + " успешно снята с карточки с номером " + accountNumber + ".");
        } else {
            System.out.println("Недостаточно средств на карточке.");
        }
    }

    // Метод для вывода текущей информации о карточке
    public void displayInfo() {
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Текущая сумма на карте: " + balance);
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем три объекта класса CreditCard
        CreditCard card1 = new CreditCard("1234-5678-2149-3472", 20000);
        CreditCard card2 = new CreditCard("9876-3456-1234-4321", 500000);
        CreditCard card3 = new CreditCard("5453-9685-2355-8755", 700500);

        // Cнимаем и пополняем средства с карточек
        card1.withdraw(300);
        card2.withdraw(100);
        card3.deposit(400);


        // Выводим текущую информацию о карточках
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}
