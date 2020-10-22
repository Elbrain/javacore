package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employers = new Employee[5];
        employers[0] = new Employee("Alex Dolzenko", "boss", "alexdozenko@gmail.com", "2312432", 23000, 20 );
        employers[1] = new Employee("Alex Dolzenko2", "super visor", "alexdozenko@gmail.com", "2312432", 23000, 30 );
        employers[2] = new Employee("Alex Dolzenko3", "manager", "alex@gmail.com", "2112432", 23000, 40 );
        employers[3] = new Employee("Alex Dolzenko4", "manager", "alexd@gmail.com", "23312432", 23000, 41 );
        employers[4] = new Employee("Alex Dolzenko5", "manager", "zenko@gmail.com", "2512432", 23000, 50 );
        for (Employee employer : employers) {
            if (employer.age > 40) {
                System.out.println(employer.toString());
            }
        }
    }
}
