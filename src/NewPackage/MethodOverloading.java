package NewPackage;

import java.util.Arrays;

public class MethodOverloading<arr> {
    public static void main(String[] args) {
      sum(1,4,15,6);
        int[] arr ={102,44,5,2,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

        public static void sum(int a,int b){
            System.out.println(a+b);
        }
        public static void sum(int a,int b,int c){
            System.out.println(a+b+c);
        }
        public static void sum(int a,int b,int c,int d){
            System.out.println(a+b+c+d);
        }


    }

