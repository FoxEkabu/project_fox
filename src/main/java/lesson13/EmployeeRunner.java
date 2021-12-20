package lesson13;

import java.util.*;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Зиновьев Ермолай Альбертович", 1, 10);
        Employee employee2 = new Employee("Фролов Владимир Сергеевич", 2, 3);
        Employee employee3 = new Employee("Князев Вилен Святославович", 3, 4);
        Employee employee4 = new Employee("Архипов Мстислав Германович", 4, 6);
        Employee employee5 = new Employee("Захаров Мартин Сергеевич", 5, 15);
        Employee employee6 = new Employee("Дроздов Корнелий Эльдарович", 6, 14);
        Employee employee7 = new Employee("Белозёров Ефрем Юлианович", 7, 12);
        Employee employee8 = new Employee("Сысоев Константин Дмитриевич", 8, 12);
        Employee employee9 = new Employee("Симонов Евгений Мартынович", 9, 11);
        Employee employee10 = new Employee("Куликов Игнатий Ефимович", 10, 2);
        Employee employee11 = new Employee("Богданов Филипп Германович", 11, 1);
        Employee employee12 = new Employee("Меркушев Тимур Игоревич", 12, 0);

        List<Employee> employees = new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        employees.add(employee11);
        employees.add(employee12);

        System.out.println("----------------------------");
        // Вывод в консоль списка работников со стажем 12 лет
        printEmployee(employees, 12);
        System.out.println("----------------------------");
        // Вызов метода удаления записей с нечетной позицией и вывод в коноль
        moveOddEmployee(employees);
        System.out.print(employees);
    }

    public static void printEmployee(Collection<Employee> employees, int workAge) {

        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext(); ) {
            Employee next = iterator.next();
            if (next.getGeneralWorkExperience() == workAge) {
                System.out.print(next);
            }
        }
    }

    public static void moveOddEmployee(List<Employee> employees) {
        ListIterator<Employee> aIter = employees.listIterator();
        int index;
        while (aIter.hasNext()) aIter.next();

        for (; aIter.hasPrevious(); ) {
            index = aIter.previousIndex();
            Employee aVal = aIter.previous();
            if (index % 2 != 0) {
                aIter.remove();
            }
        }


    }
}
