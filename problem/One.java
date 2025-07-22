public class One{
    public static boolean one(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,3};
        System.out.println(one(arr));
    }
}