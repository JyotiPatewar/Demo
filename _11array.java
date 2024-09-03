//11. Remove the element at the second position in the array [18, 19, 20, 21].–
public class _11array {
    public static void main(String[] args) {
    int arr[]={18,19,20,21};
    int arr1[]=new int[arr.length-1];
    int index=0;
    for(int i=0;i<arr1.length;i++){
        if(i==2){
            arr1[i]=arr[index+1];
            System.out.println(arr1[i]);
        }
        else{
          arr1[i]=arr[index];
          System.out.println(arr1[i]);
          index++;
        }
    }  
    }   
    }