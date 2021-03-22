package chapterFive;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewKataTest {


    int[] arrays = {2, 4, 6, 8, 10};


    @Test
    void sumAllOfNumbers(){
        NewKata.getSumOfNumbers(arrays);
         assertEquals(30, NewKata.getSumOfNumbers(arrays));

    }
    @Test
    void averageOfNumbers(){
        NewKata.averageNumbers(arrays);
        assertEquals(6, NewKata.averageNumbers(arrays) );
    }

     @Test
    void maximumOfNumbers(){
        NewKata.maximumNumbers(arrays);
        assertEquals(10, NewKata.maximumNumbers(arrays));
     }

    @Test
    void minimumOfNumbers(){
        NewKata.minimumNumbers(arrays);
        assertEquals(2, NewKata.minimumNumbers(arrays));
    }
    @Test
    void sumOfMinimumNumbers(){
        NewKata.sumMinimumNumbers(arrays);
            assertEquals(28,NewKata.sumMinimumNumbers(arrays));
        }
    @Test
    void sumOfMaximumNumbers(){
        NewKata.sumMaximumNumbers(arrays);
        assertEquals(20,NewKata.sumMaximumNumbers(arrays));
    }
 }

