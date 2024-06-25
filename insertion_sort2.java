import java.util.*;
public class input_array {
    public static void sortarray(int numbers[]){
        int i =numbers.length-2;
        int temp=numbers[numbers.length-1];
      while(i>=0 && numbers[i]>temp){
        numbers[i+1]=numbers[i];
        i--;
      } 
      numbers[i+1]=temp;
    }
    public static void main(String[] args) {
    int numbers[]={6,10,12,13,16,17,8};
    sortarray(numbers);
    for(int i =0;i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
    }
    }

}
