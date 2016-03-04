package tpAssignment2;

import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class Product {

    Multiplication myMulti = new Multiplication();

    @Test
    public void testMultiplication() throws Exception {

       System.out.print( "The product is " +myMulti.product());

    }
}
