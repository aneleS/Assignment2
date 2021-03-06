package tpAssignment2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import tpAssignment2.arrayContent.ArrayContent;
import tpAssignment2.booleans.TheFalse;
import tpAssignment2.checkException.CheckException;
import tpAssignment2.checkNull.NonNullness;
import tpAssignment2.checkNull.Nullness;
import tpAssignment2.floatingPoint.FloatingPint;
import tpAssignment2.integers.MyIntegers;
import tpAssignment2.ObjectEquality.ObjEquality;
import tpAssignment2.objIdentity.ObjIdentity;
import tpAssignment2.booleans.TestTruth;
import tpAssignment2.timeOut.TimeOut;


/**
 * Created by student on 2016/03/02.
 */
public class TestApplication {

    FloatingPint testFloat = new FloatingPint();
    MyIntegers myInt = new MyIntegers();
    ObjEquality myObj = new ObjEquality();
    ObjIdentity obj1 = new ObjIdentity();
    ObjIdentity obj2 = new ObjIdentity();
    TestTruth truth = new TestTruth();
    TheFalse aFalse = new TheFalse();
    Nullness isnull = new Nullness();
    NonNullness notNull = new NonNullness();
    ArrayContent myArray = new ArrayContent();
    CheckException ex = new CheckException();
    TimeOut t = new TimeOut();

    @Test
    public void testFloat() throws Exception {

        float answer = testFloat.calcfloat((float)2.4, (float)2.5);
        Assert.assertEquals((float) 4.9, answer, .0);
    }

    @Test
    public void testIntegers() throws Exception {

        int  num =  myInt.calcTotal();
        Assert.assertEquals(2,num);
    }

    @Test
    public void testObjEquality() throws Exception {

        String a = myObj.str1;
        String b = myObj.str2;

        Assert.assertEquals(a,b);
    }

    @Test
    public void testObjects() throws Exception {

        Assert.assertNotSame(obj1,obj2);

    }

    @Test
    public void testTruth() throws Exception {

        Assert.assertTrue(truth.isEmpty());

    }

    @Test
    public void testAFalse() throws Exception {
        Assert.assertFalse(aFalse.isEmpty());

    }

    @Test
    public void testIsNull() throws Exception {

        Assert.assertNull(isnull.isNull());

    }

    @Test
    public void testNonNullness() throws Exception {

        Assert.assertNotNull(notNull.isNotNull());
    }

    @Ignore
    @Test
    public void testFailing() throws Exception {
        Assert.fail("Failed");

    }

    @Test
    public void testArrayContent() throws Exception {

        Assert.assertArrayEquals(myArray.Array1,myArray.Array2);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testException() throws Exception {

        ex.check();

    }

    @Test(timeout=1000)
    public void testTimeOut() throws Exception
    {
        t.time();
    }

}
