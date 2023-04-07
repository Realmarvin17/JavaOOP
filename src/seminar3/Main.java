package seminar3;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        GeoTree gt = new GeoTree();
        gt.appendParentChild(irina, vasya); // Ирина родитель Васи
        gt.appendParentChild(irina, masha); // Ирина родитель Маши
        gt.appendParentChild(vasya, jane); // Вася родитель Жени
        gt.appendParentChild(vasya, ivan); // Вася родитель Ивана
        gt.appendWifeHusband(irina, igor); // Ирина жена Игоря
        gt.appendParentChild(igor, vasya); // Игорь родитель Васи
        gt.appendParentChild(igor, masha); // Игорь родитель Маши
        gt.appendParentChild(igor, Sasha); // Игорь родитель Саши

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.parent));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(igor, Relationship.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.wife));

        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}
