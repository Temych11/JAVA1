import java.util.*;

public class JCHW4 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Зачем", "ваши", "афоризмы", "если", "они", "противоречат", "классикам",
                "а", "если", "ваши", "афоризмы", "не", "противоречат", "классикам",
                "то", "они", "тоже", "не", "нужны"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
        System.out.println();
    }



    private static void task2() {
        Directory directory = new Directory();

        directory.add("Сидоров", "3562815");
        directory.add("Григорьев", "3648251");
        directory.add("Пельмешко", "9634527");
        directory.add("Пельмешко", "3725689");
        directory.add("Григорьев", "7536289");
        directory.add("Попов", "3735624");
        directory.add("Сидоров", "6357389");
        directory.add("Патиссонов", "3728825");
        directory.add("Тыковков", "6373876");

        System.out.println(directory.get("Сидоров"));
        System.out.println(directory.get("Григорьев"));
        System.out.println(directory.get("Пельмешко"));
        System.out.println(directory.get("Попов"));
        System.out.println(directory.get("Патиссонов"));
        System.out.println(directory.get("Тыковков"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
