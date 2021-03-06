import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    //null을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input(){
        String str = null;
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertThat(numberOfUpperCaseCharactersInString, is(0));
        assertTrue(numberOfUpperCaseCharactersInString == 0);
        System.out.println("numberOfUpperCaseCharactersInString :: " + numberOfUpperCaseCharactersInString);
    }

    //빈값을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertThat(numberOfUpperCaseCharactersInString, is(0));
        System.out.println("numberOfUpperCaseCharactersInString :: " + numberOfUpperCaseCharactersInString);
    }

    //대문자들이 포함된 문자열을 전달했을 때 카운팅된 숫자와 맞는지 검증하는 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_ABCDEFGHIJ() {
        String str = "ABCDEFGHIJ";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 10);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString == 1);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(10));

        System.out.println("numberOfUpperCaseCharactersInString :: " + numberOfUpperCaseCharactersInString);
    }

    //대소문자가 섞여 있을 때 정확히 카운팅 되는 지에 대한 테스트 코드 작성
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_6_for_ABCdefGHI(){
        String str1 = "ABCdefGHI";
        String str2 = "YoonJieun";
        int result1 = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str1);
        int result2 = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str2);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result1 == 6);
        assertTrue(result2 == 2);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result1 == 1);
        assertFalse(result2 == 1);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result1, is(6));
        assertThat(result2, is(2));

        System.out.println("str1 :: " + str1 + ", result1 :: " + result1);
        System.out.println("str2 :: " + str2 + ", result2 :: " + result2);
    }

    //잘못된 값을 참조했을 때 IndexOutOfBoundsException Exception이 발생하는지 테스트 코드 작성
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndex() {
        new ArrayList<Object>().get(0);
    }

    //해당 메소드가 제한된 시간내에 실행되는지에 대한 테스트 코드 작성 : timeout 사용
    //두번째로 해당 메소드는 테스트 하지 않도록 어노테이션 추가 적용 해봅니다. Ignore
    @Test
    @Ignore
    public void testShouldRunInLimitedTime() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("제한된 시간 내에 수행되면 테스트 Passed!");
    }
}
