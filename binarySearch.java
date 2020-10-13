package cn.devd.algorithmdiagram;

/*
* 时间复杂度 O(log n)
* 队列需要有序
*/

public class binarySearch {
    public static void main(String[] args) {
        int[] data =new int[100];
        for(int i =0;i<100;i++){
            data[i] =i;
        }
        System.out.println(bs(data,100));
        System.out.println(bs(data,50));
        System.out.println(bs(data,66));
        System.out.println(bs(data,3));
        System.out.println(bs(data,0));

    }
    private static int bs(int[] data,int n){
        int low =0;
        int high =data.length -1;
        while (low <=high ){
            int mid =(low +high) /2;
            if(data[mid] >n){
                high =mid -1;
            }
            else if(data[mid] <n){
                low =mid +1;
            }
            else
                return mid;
        }
        return -1;
    }
}
