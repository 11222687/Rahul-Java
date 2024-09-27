public class reverse_Arr_While {
    public static void main(String[] args) {
        /// we use while loop
        int arr[]={30,20,40,50,60};
        //before reverse
        System.out.print("Before reverse :");
        for(int value:arr){
            System.out.print(value + ",");
        }
        System.out.println();

        //logic
        int first=0;
        int last=arr.length-1;
        while(last>first){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        //after reverse
        System.out.print("after reverse : ");
        for(int value1:arr){
            System.out.print(value1 +",");
        }
    }
    
}
