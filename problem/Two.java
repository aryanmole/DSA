public class Two {
     public static int two(int arr[],int target){
        for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }    
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,9};
        int target=9;
        System.out.println(two(arr,target));
    }
}
