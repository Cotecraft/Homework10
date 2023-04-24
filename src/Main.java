public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");


        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание 2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase());

        System.out.println("Задание 3");

        String fixName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fixName);

    }
}