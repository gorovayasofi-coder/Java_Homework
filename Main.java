public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro", "15.09.2024", "Apple", "China", 1200, false);
        productsArray[2] = new Product("Xiaomi 14", "10.11.2024", "Xiaomi", "China", 800, true);
        productsArray[3] = new Product("Sony PlayStation 5", "20.10.2024", "Sony", "Japan", 600, false);
        productsArray[4] = new Product("Dyson V15", "05.03.2025", "Dyson", "Malaysia", 750, true);

        System.out.println("=== СПИСОК ТОВАРОВ ===");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар №" + (i + 1));
            productsArray[i].printInfo();
        }

        Park myPark = new Park();
        myPark.showAttractions();
    }
}
