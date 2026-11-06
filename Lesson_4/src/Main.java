
public class Main {

    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static int sumArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4!");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4х4!");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Ошибка в ячейке [" + i + "][" + j + "]: " + array[i][j]
                    );
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(array);
            System.out.println("Сумма элементов массива: " + result);

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: обращение к элементу за пределами массива!");
        }
    }
}
