package org.example;
import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.Period;

public class Turma {

    // Статические методы
    public static String timeSinceEscape(int hours, int minutes) { // функция для подсчета времени с момента побега
        return "Прошло " + hours + " часов и " + minutes + " минут с момента побега";
    }

    public static boolean isDangerousPrisoner(String prisonerID) { //функция для определеия насколько заключённый опасен
        return prisonerID.startsWith("DNG");
    }

    public static String getPrisonerGender(String prisonerID) { // функция для  определения пола заключённого
        char genderCode = prisonerID.charAt(0);
        switch (genderCode) {
            case 'M':
                return "Мужской";
            case 'F':
                return "Женский";
            default:
                return "Неизвестный";
        }
    }

    // Обычные методы
    public int countTotalPrisoners(String[] prisonerIDs) { // функция для подсчёта количества заключённых в общем
        return prisonerIDs.length;
    }

    public String timeUntilRelease(String prisonerID) { //функция для подсчёта количства дней до освобождения
        int remainingDays = 365;
        return "До освобождения заключенного " + prisonerID + " осталось " + remainingDays + " дней";
    }

    public String readGuardCommand() { //функция дл вывода команды для охраника
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду для охранника:");
        return scanner.nextLine();
    }

    // Методы, ответвляющиеся от обычных методов
    public static String getPrisonerCrime(String prisonerID) { //функция определяющая за что сидит человек
        HashMap<String, String> prisonerCrimes = new HashMap<>();
        prisonerCrimes.put("ID1", "Убийство");
        prisonerCrimes.put("ID2", "Кража");
        prisonerCrimes.put("ID3", "Наркотики");
        return prisonerCrimes.getOrDefault(prisonerID, "Неизвестное преступление");
    }

    public String lastEscapeTime() { //функция для вывода сообщения о последнем побеге
        return "Последний побег был зарегистрирован в 14:32";
    }

    // Методы, ответвляющиеся от статических методов
    public static int calculatePrisonerAge(LocalDate dateOfBirth) {//функция для выисления возраста
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }

    public static boolean isEligibleForParole(String prisonerID) { //функция на определение есть ли досрочное освобождение
        boolean isEligible = false;
        // Логика определения права на условно-досрочное освобождение
        return isEligible;
    }

    // функция для печати сообщения на табличке заключенного
    public void printMessageOnInmateBoard(String message) {
        System.out.println("Сообщение для заключенных: " + message);
    }
}
