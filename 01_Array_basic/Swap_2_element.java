public class Swap_2_element {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
            if(i==1){
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
            }
        }
        for(int value:arr){
        System.out.print(value+",");
        }
    }
    
}
