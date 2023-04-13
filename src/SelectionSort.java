public class SelectionSort {

        public static void main(String[] args) {
            //start time of execution
            long start=System.nanoTime();
            int[] arrayA1 = {1,6,8,4,2};
            int temp;
            //iterating to find minimum index number
            for(int i=0;i<arrayA1.length;i++){
                for (int j=0;j< arrayA1.length ;j++){
                    //swapping numbers using temp variable
                    if(arrayA1[i]< arrayA1[j]){
                        temp=arrayA1[i];
                        arrayA1[i]=arrayA1[j];
                        arrayA1[j]=temp;
                    }
                }
            }
            for(int a: arrayA1){
                System.out.println(a);

            }
            //duration of execution - start time
            // converting nano seconds to milli seconds
            long duration = (System.nanoTime()-start)/1000;
            System.out.println(duration +" milli seconds");
        }
    }

