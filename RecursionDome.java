package cn.devd.algorithmdiagram;


import java.util.Arrays;

public class RecursionDome {
    public static void main(String[] args) {

//        int[] tst =new int[0];
//        System.out.println(tst.length);
        System.out.println(recursionSumDome(new int[]{1,2,3,4}));
//        System.out.println(Arrays.toString(removeFirst(new int[]{1,2,3,})));
        System.out.println(getArraysNum(new int[]{2,3,4,5,2,1,}));
        getMax(new int[]{2,3,4,5,2,1,});


    }
    private static int getMax(int[] ints){
        if(ints.length ==1)
            return ints[0];

        if(ints.length ==2)
//            return ints[0]>ints[1]?ints[0]:ints[1];
            return Math.max(ints[0], ints[1]);

        int[] cur =removeFirst(ints);
        int subMax =getMax(cur);
        /*
         * 找到最后两个数的最大值，再和最后第三个比较，以此类推...
         */
        return Math.max(ints[0],subMax);
    }
    private static int getArraysNum(int[] ints){
        if(ints.length ==0)
            return 0;
        int[] cur =removeFirst(ints);
        return 1+ getArraysNum(cur);
    }
    private static int recursionSumDome(int[] ints){
        if(ints.length ==1)
            return  ints[0];

        int[] cur =removeFirst(ints);
        return ints[0] +recursionSumDome(cur);

    }
    private static int[] removeFirst(int[] arr){
        int[] ret =new int[arr.length -1];
        for(int i =1;i<arr.length;i++){
            ret[i -1] =arr[i];
        }
        return ret;
    }
}
