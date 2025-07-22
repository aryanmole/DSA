public class Maxsubarray3 {
    public static void subarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int arr2[]=new int[arr.length];

        arr2[0]=arr[0];

        for(int i=1;i<arr2.length;i++){
            arr2[i]=arr2[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int st=i;
            for(int j=i;j<arr.length;j++){
              int end=j;

              currsum=st==0 ? arr2[end] : arr2[end]-arr2[st-1];

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
