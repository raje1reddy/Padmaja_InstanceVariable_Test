import static org.junit.Assert.*;

public class PhoneTest {

    @org.junit.Test
    public void mytest1() {
        Phone p = new Phone();
        p.setTested(false);
        boolean expectedresult = false;
        System.out.println(p.isTested());
       assertEquals(expectedresult, p.isTested());
    }

    @org.junit.Test
    public void mytest2() {
        Phone p =  new Phone();
        System.out.println(p.isTested());
        assertEquals(true, p.isTested());
    }
}