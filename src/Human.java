import java.util.*;

public class Human implements Comparable<Human> {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    public static void main(String[] args) {

        List<Human> people = Arrays.asList(
                new Human("Анна", 20),
                new Human("Иван", 18),
                new Human("Мария", 22),
                new Human("Пётр", 19),
                new Human("Ольга", 21)
        );

        // HashSet
        Set<Human> hashSet = new HashSet<>(people);
        System.out.println("HashSet:");
        System.out.println(hashSet);

        // LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(people);
        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

        // TreeSet — сортировка по возрасту через Comparable
        Set<Human> treeSet = new TreeSet<>(people);
        System.out.println("\nTreeSet по возрасту:");
        System.out.println(treeSet);

        // Comparator по имени
        Comparator<Human> byName =
                Comparator.comparing(Human::getName);

        Set<Human> byNameSet = new TreeSet<>(byName);
        byNameSet.addAll(people);

        System.out.println("\nTreeSet по имени:");
        System.out.println(byNameSet);

        // Comparator по возрасту в обратном порядке
        Comparator<Human> byAgeDescending =
                Comparator.comparing(Human::getAge).reversed();

        Set<Human> byAgeSet = new TreeSet<>(byAgeDescending);
        byAgeSet.addAll(people);

        System.out.println("\nTreeSet по возрасту в обратном порядке:");
        System.out.println(byAgeSet);
    }
}