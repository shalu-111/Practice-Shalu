package practic;

public class LastDigitOfProductOfAnArray {

    public static void main(String[] args) {
        int[] array = {22, 31, 44, 27, 37, 43,89};
        LastDigitOfProductOfAnArray lastDigitOfProductOfAnArray = new LastDigitOfProductOfAnArray();

        System.out.println(lastDigitOfProductOfAnArray.getLastDigit(array));
    }


    int getLastDigit(int[] array) {
        int product = 1;
        for (int j : array) {
            product = ((product % 10) * (j % 10)) % 10;
        }
        return product;

    }
}
