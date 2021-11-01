import org.junit.Assert;
import org.junit.Test;


public class programTest {
    @Test
    public void testProgram1() {
	Program test = new Program();
        int age = -10;
        String sex = "Male";
        String expectResult = "INPUT_KHONG_HOP_LE";
        String actualResult = test.result(-10, "Male");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram2() {
	Program test = new Program();
        int age = 3;
        String sex = "Male";
        String expectResult = "MIEN_PHI_VE&TANG_MU_XANH";
        String actualResult = test.result(3, "Male");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram3() {
	Program test = new Program();
        int age = 19;
        String sex = "Male";
        String expectResult = "20$/VE&TANG_MU_XANH";
        String actualResult = test.result(19, "Male");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram4() {
	Program test = new Program();
        int age = 80;
        String sex = "Male";
        String expectResult = "10$/VE&TANG_MU_XANH";
        String actualResult = test.result(80, "Male");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram5() {
	Program test = new Program();
        int age = -10;
        String sex = "Female";
        String expectResult = "INPUT_KHONG_HOP_LE";
        String actualResult = test.result(-10, "Female");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram6() {
	Program test = new Program();
        int age = 3;
        String sex = "Female";
        String expectResult = "MIEN_PHI_VE&TANG_MU_HONG";
        String actualResult = test.result(3, "Female");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram7() {
	Program test = new Program();
        int age = 19;
        String sex = "Female";
        String expectResult = "20$/VE&TANG_MU_HONG";
        String actualResult = test.result(19, "Female");
        Assert.assertEquals(actualResult, expectResult);
    }
    @Test
    public void testProgram8() {
	Program test = new Program();
        int age = 80;
        String sex = "Female";
        String expectResult = "10$/VE&TANG_MU_HONG";
        String actualResult = test.result(80, "Female");
        Assert.assertEquals(actualResult, expectResult);
    }

}
