import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by mhahue on 11/1/2016.
 */
public class MadalinaTest {
    @Test
    public void test1(){
        assertEquals(1+4, 5);
    }

    @Test
    public void test2() {
        if (10>12) {
            System.out.println("Hello");
        } else {
            assertEquals(true,true);
        }
    }

    @Test
    public void test3(){
        assertEquals("Ana are mere", "Ana are mere");
    }

    @Test
    public void test4(){
        if(49>5){
            assertTrue(50==50);
        }else{
            System.out.println("Ceva");
        }
    }
}
