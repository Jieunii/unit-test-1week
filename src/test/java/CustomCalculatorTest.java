
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.*;

//Test는 왜 void로 쓰는가? 결과값을 체크하는 것이기 때문에 return 값 필요없다.
public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);

        //result가 25인지 확인
        assertTrue(result == 25);
        //result가 10이 아닌지 확인
        assertFalse(result == 10);
        //is()는 equals와 비슷
        assertThat(result, is(25));
        System.out.println("result :: " + result);
    }

    //빼기 테스트 작성
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);

        //result가 13인지 확인
        assertTrue(result == 13);
        assertThat(result, is(13));
        System.out.println("result :: " + result);
    }

    @Test
    public void 빼기테스트(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);

        //result가 12가 아닌지 확인
        assertFalse(result == 12);

    }

    //곱하기 테스트 작성
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);

        assertTrue(result == 45);
        assertThat(result, is(45));
        System.out.println("result :: " + result);
    }

    //나누기 테스트 작성
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);

        assertTrue(result == 5);
        assertThat(result, is(5));
        System.out.println("result :: " + result);
    }

    @Test
    public void 나누기테스트() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);

        assertFalse(result == 1);
        assertThat(result, is(5));
        System.out.println("result :: " + result);
    }

    @Test(timeout = 4000)
    public void timeInMethodTest() throws InterruptedException {
        //시간초과
        Thread.sleep(5000);
    }

    @Test(timeout = 3000)
    public void 시간제한체크() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEmptyIndexOutOfBoundException(){
        new ArrayList<Object>().get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEmptyOutOfBoundException(){
        new ArrayList<Object>().get(0);
    }

    @Test
    public void testMethod(){
        ArrayList<Object> myList = new ArrayList<Object>();
        assertThat(myList, is(empty()));
    }

    @Test
    public void isEmptyArray(){
        ArrayList<Object> myList = new ArrayList<Object>();
        assertThat(myList, is(empty()));
    }
}