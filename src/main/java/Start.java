//1. Написать метод, которому в качестве аргумента передается не пустой
// одномерный целочисленный массив. Метод должен вернуть новый массив,
// который получен путем вытаскивания из исходного массива элементов,
// идущих после последней четверки. Входной массив должен содержать хотя
// бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//2. Написать метод, который проверяет состав массива из чисел 1 и 4.
// Если в нем нет хоть одной четверки или единицы, то метод вернет false;
// Если содержится что то кроме 1 и 4, то метод вернет false;

import java.util.Arrays;
import java.util.Stack;

public class Start {

  public static void main(String[] args) {
    ResearchesArray rsArray = new ResearchesArray();

    System.out.println(Arrays.toString(rsArray.getArr(new int[]{})));
    System.out.println(Arrays.toString(rsArray.getArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1})));
    System.out.println(Arrays.toString(rsArray.getArr(new int[]{4,4})));
    System.out.println(rsArray.checkArray(new int[]{4,4,4,4,1}));
  }



}
