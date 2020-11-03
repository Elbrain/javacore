package lesson5;

public class Employee {
    protected String fullName, position, email, phoneNumber;
    protected int wage, age;

    public Employee(String fullName, String position, String email, String phoneNumber, int wage, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee - " +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", wage=" + wage +
                ", age=" + age ;
    }

}
    /*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
        * Конструктор класса должен заполнять эти поля при создании объекта;
        * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
        * Создать массив из 5 сотрудников
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);

        * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/