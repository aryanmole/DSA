public class One {
  
    public static void subarray(int arr[]){
        int Min=Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;
        

       for(int i=0;i<arr.length;i++){
           Min= Math.min(Min,arr[i]);
           Max= Math.max(Max,arr[i]);
       }
       System.out.println("Maximum value="+Max+" Minimum value="+Min);
    }
    public static void main(String[] args){
        int arr[]={3, 5, 4, 1, 9};
        subarray(arr);
    }


}
