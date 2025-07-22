
public class largest{
    public static int getlargest(int arr[]){
        int large=arr[0];
        for(int i=0;i<arr.length-1;i++){
            large=Math.max(arr[i],arr[i+1]);
        }
        return large;
    }

    public static void main(String[]args){
        int[] arr={1,4,2,6,8,3};
        System.out.println("largest number is="+getlargest(arr));
    }
}

