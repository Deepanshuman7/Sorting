public class bubble_sort{

    public static void bubblesort(int arr[]){
        int n =arr.length;
        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swapping will be done
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4,2,-18,30,45};
        bubblesort(arr);
        printarr(arr);
    }
}