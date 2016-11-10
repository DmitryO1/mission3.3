import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dmitry on 10.11.2016.
 */
public class MergeTest {
    @Test//Positive #1
    public void mergeSortUnsortedList(){
        assertArrayEquals(new int []{1,2,3,4},MergeSort.mergeSortList(new int[]{4,3,2,1}));
        System.out.println("Positive test has been passed '#1'");
    }

    @Test//Positive #2
    public void mergeSortList(){
        assertArrayEquals(new int []{1,2,3,4},MergeSort.mergeSortList(new int[]{1,2,3,4}));
        System.out.println("Positive test has been passed '#2'");
    }

    @Test(expected = AssertionError.class)//Negative #1
    public void mergeSortListFromLength(){
        assertArrayEquals(new int []{1,2,3,4},MergeSort.mergeSortList(new int[]{1,2,3,4,5}));
        System.out.println("Negative test has been passed '#1'");
    }

    @Test(expected = AssertionError.class)//Negative #2
    public void mergeSortWhenEmptyList(){
        assertArrayEquals(new int []{1,2,3,4},MergeSort.mergeSortList(new int[]{}));
        System.out.println("Negative test has been passed '#1'");
    }

}
