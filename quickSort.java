package cn.devd.algorithmdiagram;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] data =new int[]{5,11,2,7,9,21};
        quickSort(data, 0, data.length -1);
        System.out.println(Arrays.toString(data));

    }

    private static void qsort(int[] data, int left, int right) {
        if(left <right){
            int pivot= sort(data, left,right);
//            System.out.println(data[pivot]);
            qsort(data, left, pivot -1);
            qsort(data, pivot +1, right);
        }

    }

    private static int sort(int[] data, int left, int right) {
        int temp =data[left];
        while (left <right){
            while (left <right && data[right] >=temp)
                right --;
            data[left] =data[right];
            while (left <right && data[left] <=temp)
                left ++;
            data[right] =data[left];
        }
        data[left] =temp;
//        System.out.print(Arrays.toString(data)+"\t");
        return left;
    }
    private static void quickSort(int data[],int left, int right){
        if(left <right){
            int i =left;
            int j =right;
            int temp =data[left];
            while(i <j){
                while (i <j &&data[j] >=temp)
                    j --;
                data[i] =data[j];
                while (i <j &&data[i] <=temp)
                    i ++;
                data[j] =data[i];
            }
            data[i] =temp;
            int pivot =i;
            quickSort(data, left, pivot -1);
            quickSort(data, pivot+1,right);
        }
    }

}


