class reverseArr{
    public static void main(String[] args) {
        /// we use for loop
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		for(int index=arr.length-1;index>=0;index--) {
			System.out.print(arr[index] + ",");
		}
	}
}