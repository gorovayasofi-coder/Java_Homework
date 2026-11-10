public class MainTask2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "89111111111");
        phoneBook.add("Петров", "89222222222");
        phoneBook.add("Иванов", "89333333333");
        phoneBook.add("Сидоров", "89444444444");

        System.out.println("Номера Иванова: " + phoneBook.get("Иванов"));

        System.out.println("Номера Петрова: " + phoneBook.get("Петров"));

        System.out.println("Номера Сидорова: " + phoneBook.get("Сидоров"));

        System.out.println("Номера Смирнова: " + phoneBook.get("Смирнов"));
    }
}
