public class CountingSort{
 
    
    public static void CountingSort(int[] A){

        // get max
        int max = 0;
        for (int i=0; i<A.length; i++)
            if (A[i] > max) max = A[i];

        // fill counter array
        int[] counter = new int[(max+1)];
        for (int i=0; i<A.length; i++)
            counter[A[i]]++;
        
        // retrieve sorted array
        int Ci = 0;     // counter index
        int Ai = 0;     // A array index
        while (Ci < counter.length){
            if (counter[Ci] > 0){
                counter[Ci]--;
                A[Ai] = Ci;
                Ai++;
            }else{
                Ci++;
            }
        }
    }
    

    public static Boolean EqualIntArray(int[] A, int[] B){
        for (int i=0; i<A.length; i++)
            if (A[i] != B[i]) return false;
        return true;
    }


    public static Boolean test_CountingSort(){
        int[] A = {2,5,7,3,8};
        int[] B = {2,3,5,7,8};
        CountingSort(A);
        return ( EqualIntArray(A,B) );
    }


    public static void main(String[] args){

        System.out.println( test_CountingSort() );

    }


}
