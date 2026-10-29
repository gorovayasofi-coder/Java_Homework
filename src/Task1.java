import java.util.List;

abstract class Animal {
    protected final String name;
    protected static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int d);

    public abstract void swim(int d);
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void run(int d) {
        if (d <= 500) System.out.println(name + " пробежал " + d);
        else System.out.println(name + " не может столько бежать");
    }

    public void swim(int d) {
        if (d <= 10) System.out.println(name + " проплыл " + d);
        else System.out.println(name + " не может столько плыть");
    }
}

class Cat extends Animal {
    boolean satiety = false;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
    }

    public void run(int d) {
        if (d <= 200) System.out.println(name + " пробежал " + d);
        else System.out.println(name + " не может столько бежать");
    }

    public void swim(int d) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl) {
        if (bowl.food >= appetite) {
            bowl.food -= appetite;
            satiety = true;
            System.out.println(name + " поел");
        } else System.out.println(name + " не наелся");
    }
}

class Bowl {
    public int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int f) {
        if (f > 0) {
            food += f;
            System.out.println("Добавили еду. Теперь: " + food);
        } else System.out.println("Ошибка: еда не может быть отрицательной");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(10);
        Cat[] cats = {new Cat("Барсик", 5), new Cat("Лео", 7), new Cat("Рыжик", 3)};

        for (Cat c : cats) c.eat(bowl);
        for (Cat c : cats) System.out.println("Кот " + c.name + " сыт: " + c.satiety);

        bowl.addFood(10);
        bowl.addFood(-5);

        System.out.println("Всего животных: " + Animal.count);
    }
}
