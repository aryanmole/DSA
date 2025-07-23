public class Maxsubarray2 {
    public static void subarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
               maxsum=Math.max(currsum,maxsum);
                 System.out.println(currsum);
            }
        }
        System.out.println("Maxsum:"+maxsum);
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
}
