import java.util.Arrays;

/**
 * Created by Dmitry on 10.11.2016.
 */
public class MergeSort {

    public static void main(String [] args){
       /* int[] a = new int[]{21,2,34,5};
        System.out.println(Arrays.toString(a));
        a = mergeSortList(a);
        System.out.println(Arrays.toString(a));*/
    }

    public  int[] merge(int []left,int []right){
        int lengthResult = left.length+right.length;
        int [] result = new int[lengthResult];
        int indexL=0;
        int indexR=0;
        int indexRes=0;

        while (indexL<left.length || indexR<right.length){
            if(indexL<left.length && indexR < right.length){
                if(left[indexL]<=right[indexR]){
                    result[indexRes] = left[indexL];
                    indexL++;
                    indexRes++;
                }
                else {
                    result[indexRes] = right[indexR];
                    indexR++;
                    indexRes++;
                }

            }
            else if (indexL<left.length){
                result[indexRes] = left[indexL];
                indexL++;
                indexRes++;
            }
            else if (indexR<right.length){
                result[indexRes] = right[indexR];
                indexR++;
                indexRes++;
            }
        }
        return result;
    }



public  int[] mergeSortList(int[]B) {
    if (B.length <= 1) {
        return B;
    }
    int mid = B.length / 2;
    int[] left = new int[mid];
    int[] right;
    if (B.length % 2 == 0) {
        right = new int[mid];
    } else {
        right = new int[mid + 1];
    }
    int[] result = new int[B.length];
    for (int i = 0; i < mid; i++) {
        left[i]=B[i];
    }
    int x=0;
    for (int j=mid;j<B.length;j++){
        if(x<right.length)
        right[x]=B[j];
        x++;
    }

    left = mergeSortList(left);
    right = mergeSortList(right);
    result=merge(left,right);

    return result;
}

}
