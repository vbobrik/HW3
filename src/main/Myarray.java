package main;
import java.util.Arrays;
import java.util.Collections;

public class Myarray {
    private Integer [] myArray = new Integer [200];
    private int b = 200;
    private boolean isSort = false;



//***********-----ADD---elem-----****************

    public void getMyArray() {
        int i;
        for (i = 0; i < this.myArray.length; i++) {
            System.out.println(this.myArray[i]);
        }
    }

//**********/ADDING A RANDOM NUMBER INTO THE ARRAY****************

    public void addElem() {
        int i;
        for (i = 0; i < this.myArray.length; i++) {

            this.myArray[i] = (int) (Math.random() * b);

        }
    }

    //--------------SORT-----___***************

    public void sortUp() {

       // Arrays.sort(this.myArray, Collections.reverseOrder());
        if(!this.isSort) {
            int i;
            for(int z =this.myArray.length - 1; z > 0; z --) {
                for(i = 0; i < z; i ++) {
                    if (this.myArray[i] < this.myArray[i + 1]) {
                        int x = this.myArray[i];
                        this.myArray[i] = this.myArray[i + 1];
                        this.myArray[i + 1] = x;
                    }
                }
            }
        }


    }

    public void minMax(int minNumber,int maxNumber) {
        int i;
        for (i = 0; i < this.myArray.length; i++) {
            if(this.myArray[i] > minNumber & this.myArray[i] < maxNumber) {
                System.out.println(this.myArray[i]);
            }
        }
    }

}
