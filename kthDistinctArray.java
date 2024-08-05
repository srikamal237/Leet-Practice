import java.util.*;

public class kthDistinctArray {
    static String[] arr={"aaa","aa","a"};
    static int k=1;
    public static void main(String[] args) {
       String ans=kthDistinct(arr,k);

       System.out.println("The Result is : "+ans);
    }
    private static String kthDistinct(String[] arr2, int k2) {
        // TODO Auto-generated method stub
      Map<String,Integer> map=new HashMap<>();

      for(String a:arr) {
        map.put(a,map.getOrDefault(a,0)+1);
    }
    //System.out.println(map);
    int count=0;
    for(String a:arr){
        if(map.get(a)==1)
        {
            count++;
        }
        if(count==k)
        {
            return a;
        }
    }


return "";
}

}
