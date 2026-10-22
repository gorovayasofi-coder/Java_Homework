public class Lesson_1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumInRange();
        printPositiveOrNegative();
        isNumberNegative();
        printString();
        isLeapYear();
        replaceZerosAndOnes();
        fillArray();
        multiplyLessThanSix();
        createMatrix();
        createArray();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void checkSumInRange() {
        int a = 15;
        int b = 5;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void printPositiveOrNegative() {
        int number = -5;
        if (number < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    public static void isNumberNegative() {
        int number = -5;
        if (number < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void printString() {
        String text = "Привет";
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void isLeapYear() {
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(true);
        } else if (year % 400 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void replaceZerosAndOnes() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void multiplyLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    public static void createMatrix() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void createArray() {
        int len = 5;
        int initialValue = 10;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
    }
}
