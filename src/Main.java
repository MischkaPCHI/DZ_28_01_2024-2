import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Сайт 1 ", 15, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 2 ", 5, new Programmer("Иван", "Пенза")));
        taskList.add(new Task("Сайт 3 ", 25, new Programmer("Оливия", "Москва")));
        taskList.add(new Task("Сайт 4 ", 11, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 5 ", 4, new Programmer("Георгий", "Пятигорск")));
        taskList.add(new Task("Сайт 6 ", 13, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 7 ", 1, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 8 ", 3, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 9 ", 10, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 10 ", 30, new Programmer("Али", "Москва")));
        taskList.add(new Task("Сайт 11 ", 5, new Programmer("Алексей", "Пенза")));
        taskList.add(new Task("Сайт 12 ", 5, new Programmer("Игорь", "Пенза")));

        String programmer = "Али";

        List<Task> result1 = taskList.stream()
                .sorted((d1, d2) -> d2.getDays() - d1.getDays())
                .filter(task -> task.getPerformer().getName().equals(programmer))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result1);

        String city = "Пенза";

        List<Task> result2 = taskList.stream()
                .filter(task -> task.getPerformer().getCity().equals(city))
                .sorted((p1,p2) -> p1.getPerformer().getName().compareTo(p2.getPerformer().getName()))
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}