/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


/**
 *
 * @author User
 */
public class TesteeSupplyManagement {
    //as the project is basically built in with plug in mySql methods, I have collected all the viable methods from my project.. 
    //and made a collection of sample methods with different characteristics to demonstrate the unit testing processes

    /**
     *
     */
public String name,id,order,date;
    public boolean registerUser(String s, String t)
    {   //we consider the user name and pass will be set as Rhyme and 1234 
        if(s.equals("Rhyme")&&t.equals("1234"))
        {return true;}
        return false;
    }
    
    public boolean loginUser(String s, String t)
    { //here we check if the user name and password is matched or not
         if(s.equals("Rhyme")&&t.equals("1234"))
            return true;
        return false;
    }
    
    public String insertClientInfo(String n, String id , String or , String dt)
    {      //it takes client name id money order type and date of order
       if(n.equals("null")||id.equals("null")||or.equals("null")||dt.equals("null"))
           return "not done";
       else
       {
           name=n;
           this.id=id;
           order=or;
           date=dt;
           
           return "done";
       }
       }
    public int getReciept(int amount,int delFee)
    {
        return amount+delFee;
    }
    public boolean updateClinetName(String s)
    {
        name=s;
        return true;
    }
     public boolean updateClinetOrder(String s)
    {
        order=s;
        return true;
    } public boolean updateClinetID(String s)
    {
        id=s;
        return true;
    } public boolean updateClinetDate(String s)
    {
        date=s;
        return true;

    }
    public String createInvoice( int a , int b)
    {
        return name + " --> " + getReciept(a,b)+" taka";
    }
    public double getUpdatedCost(double cost, double interest , double month)
    {
        double r;
        r= cost + (interest*cost*month);
        return r;
    }
    
    public void updateDeliveryInfo(boolean i)
    {
        if(i)
            order = order +" has been recieved";
        else
        {
            order = order+" is yet to be sent";
        }
    }
    public int [] makeChainOrder(int startOrder , int increment)
    {
        int [] a = new int[5];
        int x= startOrder;
        a[0]=x;
        for(int b=1;b<5;b++)
        {
            a[b]=a[b-1]+increment;
        }
        return a;
    }
    public String deliveryDetails(String delivery)
    {
        if(delivery.equals("null"))
            return null;
        return this.name+" is getting the product : item serial no."+order+" on the date: "+date;
    }
    public int calcTotalProfit(int []sold, int []empCost, int otherCost, int interest, int tax)
    {
        int total=0;
        for(int i=0;i<sold.length;i++)
            total+=sold[i];
        for(int i=0;i<empCost.length;i++)
            total-=empCost[i];
        total = total-otherCost;
        total = total+((total*interest)/100);
        total = total-((total*tax)/100);
       
        return total;
    }
}



