package common;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author son
 */
public class ALgorithm {
    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
     public int partition(int[] array, int left, int right) {
      
        int i = left, j = right;
        int middle = array[(left + right) / 2];
        int tmp;
        while (i <= j) {
            while (array[i] < middle) {
                i++;
            }
            while (array[j] > middle) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }
    public void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }
     public void display(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            if(i<arrays.length-1)
                System.out.print(arrays[i]+" , ");
            else
                System.out.println(arrays[i]);
        }
    }
}
