public class Park {
    class Attraction {
        String name;
        String workingHours;
        double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name + " | Время работы: " + workingHours + " | Стоимость: " + cost + " руб.");
        }
    }

    public void showAttractions() {
        System.out.println("=== АТТРАКЦИОНЫ ПАРКА ===");
        Attraction ferrisWheel = new Attraction("Колесо обозрения", "10:00 - 22:00", 500.0);
        Attraction rollerCoaster = new Attraction("Американские горки", "11:00 - 20:00", 800.0);

        ferrisWheel.printAttractionInfo();
        rollerCoaster.printAttractionInfo();
    }
}
