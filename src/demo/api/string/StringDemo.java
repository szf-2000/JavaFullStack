package demo.api.string;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s ="100 20 30 10 40 70 60 50 80";
        String[] s1 = s.split(" "); //用split分割字符串
        int[] a=new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
//            Integer k = Integer.valueOf(s1[i]);
            a[i]=Integer.parseInt(s1[i]);   //parse的返回值是int
        }
        Arrays.sort(a);
        //使用StringBuider来将int数组拼接成字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
//            if(i == a.length-1){
//                sb.append(a[i]);
//            }else {
//                sb.append(a[i]+" ");
//            }
            sb.append(a[i]+" ");
        }
//        System.out.println(Arrays.toString(a));
        System.out.println(sb);
    }

}
