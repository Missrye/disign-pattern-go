package com.deepocean.algorithm;

import java.util.*;

public class Demo1{
    public int getThirdMinInt(int[] input) {
        int count = 3;
        // params check
        if (input == null) {
            throw new RuntimeException("请检查输入数组是否为null");
        }
        if (input.length < count) {
            throw new RuntimeException("请检查num是否超过数组边界");
        }
        // don't modify the original input
        int[] ret = Arrays.copyOfRange(input, 0, input.length);
        Arrays.sort(ret);
        return ret[2];
    }


    public int[] getNotRepeatedArray(int[] input){
        // params check
        if (input == null) {
            throw new RuntimeException("请检查输入数组是否为null");
        }
        // result array, because unknown the specific length
        ArrayList<Integer> ret = new ArrayList<>();
        // record the count of the element
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input.length; i++){
            if(countMap.containsKey(input[i])){
                countMap.put(input[i], countMap.get(input[i]) + 1);
            }else{
                countMap.put(input[i], 1);
            }
        }
        // find the elements which meet the condition
        for(Integer key : countMap.keySet()){
            if(countMap.get(key) == 1)
                ret.add(key);
        }
        // transfer to integer array
        int[] res = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            res[i] = ret.get(i);
        }
        return res;
    }



    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int[] test1 = new int[]{3,6,3,8,5,7};
        System.out.println(demo1.getThirdMinInt(test1));

        int[] test2 = new int[]{1,2,3,3,4,3,2,5,7,5};
        System.out.println(Arrays.toString(demo1.getNotRepeatedArray(test2)));

    }
}
