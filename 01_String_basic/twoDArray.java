class twoDarray{
    public static void main(String[] args) {
        int my2DArray[][]={
            {1,2,3},
            {4,5,6}
        };

        //here we are print only one index of the array
        System.out.println(my2DArray[0][1]); 
        System.out.println(my2DArray[1][0]);

        //method 2nd
        int my2DArray1[][]=new int [2][2];
        my2DArray1[0][0]=1;
        System.out.println(my2DArray1[0][0]);

    }
}