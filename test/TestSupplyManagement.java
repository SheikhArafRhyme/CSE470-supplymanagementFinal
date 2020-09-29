/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestSupplyManagement {
    TesteeSupplyManagement t;
    static int i=1;
    
    @Before
    public void setUp() {
        if(i==1)
            System.out.println("the test case run is initializing...");
        System.out.println("test case run : "+i);
        t = new TesteeSupplyManagement();
        i++;
    }
    

  
     @Test
     public void testRegisterUser() 
     {
         boolean x= t.registerUser("Rhyme","1234");
         assertTrue(x);
     }
     
     @Test
     public void testLoginUser()
     {
        boolean x = t.loginUser("Rhyme","1234");
        assertTrue(x);
     }
     @Test
     public void testClientInfo()
     {
         String r = t.insertClientInfo("Rhyme", "123","order2", "18th september");
         assertEquals("done",r);
     }
     @Test
     public void testRecieptInfo()
     {
         assertEquals(500,t.getReciept(450, 50));
     }
     @Test
     public void testUpdateName()
     {
         boolean x = t.updateClinetName("araf");
         assertTrue(x);
     }
     @Test
     public void testUpdateId()
     {
         boolean x = t.updateClinetID("1111");
         assertTrue(x);
     }
     @Test
     public void testUpdateOrder()
     {
         boolean x = t.updateClinetOrder("order4");
         assertTrue(x);
     }
     @Test
     public void testUpdateDate()
     {
         boolean x = t.updateClinetDate("12-01-20");
         assertTrue(x);
     }
     @Test
     public void testInvoice()
     {
         String s = t.createInvoice(1000, 20);
         assertNotEquals("null",s);
     }
     @Test 
     public void testUpdatedCost()
     {
       double r= t.getUpdatedCost(1000.0, .15, 3.0);
      // System.out.println(r);
       assertEquals(1450.0,r,0);   //this the assert function for double data types
     }
     @Test
     public void testUpdateDelInfo()
     {
         String s = t.order;
         t.updateDeliveryInfo(true);
         String x = t.order;
         assertNotEquals(s,t);
     }
     @Test
     public void testOrderChain()
     {
        int a[] = {1,3,5,7,9};
        assertArrayEquals(a,t.makeChainOrder(1, 2)); 
     }
     @Test
     public void testDeliveryDetails()
     {
         assertNotEquals("null",t.deliveryDetails("dhaka"));
     }
     @Test
     public void testCalcTotalProfit()
     {
         int expected = 19800;
         int []sold = {40000,50000,20000};
         int []empSalary = {30000,20000,30000};
         int otherCost=10000;
         int interest =10;
         int tax =10;
         assertEquals(expected,t.calcTotalProfit(sold,empSalary,otherCost,interest,tax));
     }
}
