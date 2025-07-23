public class Subarray {
    public static void subarray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
}
