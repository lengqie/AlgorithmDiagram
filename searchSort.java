package cn.devd.algorithmdiagram;

/*
* 选择排序
* 时间复杂度 O(N *N)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class searchSort {
    public static void main(String[] args) {
        Random r =new Random();
        int[] data =new int[10];
        for (int i = 0; i <10; i++) {
            data[i] =r.nextInt(26);
        }
//        System.out.println(Arrays.toString(data));
        System.out.println(ss(data));
        System.out.println(Arrays.toString(ss2(data)));

    }
    private static  int getSmallest(ArrayList<Integer> data){
        int min =Integer.MAX_VALUE;
        for (Integer datum : data) {
            if (min > datum)
                min = datum;
        }
        return min;

    }
    private static ArrayList<Integer> ss(int[] data){
        ArrayList<Integer> a =new ArrayList<>();
        ArrayList<Integer> source =new ArrayList<>();
        for (int i: data){
            source.add(i);
        }
        for(int i =0;i<data.length;i++){
            int small = getSmallest(source);

            a.add(source.remove(source.indexOf(small)));
        }
        return a;
    }
    private static int[] ss2(int[] data){
        for (int i = 0; i < data.length; i++) {
            int min =i;
            for (int j = i; j < data.length; j++) {
                if(data[min] >data[j]){
                    min =j;
                }
            }
            if(min !=i){
                int temp =data[i];
                data[i] =data[min];
                data[min] =temp;
            }
        }
        return data;

    }

}
