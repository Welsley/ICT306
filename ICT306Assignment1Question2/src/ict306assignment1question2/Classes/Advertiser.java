/* 
 * ICT306 Assignment 1 Question 2
 * By: Welsley Lui
 * Student No: 31612382
 * Date: 17/04/2015
 * File name: Advertiser.java
 * 
 * This is the advertiser class of customers for the online dating service.
 */
package ict306assignment1question2.Classes;

import java.util.Vector;
import ict306assignment1question2.Classes.Customer;
import ict306assignment1question2.Classes.GenderEnum;

public class Advertiser extends Customer
{
    private String _advert;
    private GenderEnum.Gender _desiredGender;
    private int _desiredMinAge;
    private int _desiredMaxAge;
    private float _desiredMinIncome;
    private float _desiredMaxIncome;
    private Vector<String> _messageAuthor;
    private Vector<String> _message;
    
    /**
    * Returns nothing.
    * <p>
    * This is the constructor method for this class.
    */
    public Advertiser()
    {
        _advert = "UNKNOWN";
        _desiredGender = GenderEnum.Gender.FEMALE;
        _desiredMinAge = 18;
        _desiredMaxAge = 25;
        _desiredMinIncome = 50000;
        _desiredMaxIncome = 100000;
        _messageAuthor = new Vector<String>();
        _message = new Vector<String>();
    }
    
    /**
    * Returns an String.
    * <p>
    * This is the get method for the advertiser's advert.
    */
    public String getAdvert()
    {
        return _advert;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the advertiser's advert.
    * 
    * @param  a The advert of the advertiser to be set to.
    */
    public void setAdvert(String a)
    {
        _advert = a;
    }
    
    /**
    * Returns a Gender enumeration.
    * <p>
    * This is the get method for the advertiser's desired gender.
    */
    public GenderEnum.Gender getDesiredGender()
    {
        return _desiredGender;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the advertiser's desired gender.
    * 
    * @param  g The desired gender of the advertiser to be set to.
    */
    public void setDesiredGender(GenderEnum.Gender g)
    {
        _desiredGender = g;
    }
    
    /**
    * Returns an integer.
    * <p>
    * This is the get method for the advertiser's desired minimum age.
    */
    public int getDesiredMinAge()
    {
        return _desiredMinAge;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the advertiser's desired minimum age.
    * 
    * @param  a The desired minimum age of the advertiser to be set to.
    */
    public void setDesiredMinAge(int a)
    {
        _desiredMinAge = a;
    }
    
    /**
    * Returns an integer.
    * <p>
    * This is the get method for the advertiser's desired maximum age.
    */
    public int getDesiredMaxAge()
    {
        return _desiredMaxAge;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the advertiser's desired maximum age.
    * 
    * @param  a The desired maximum age of the advertiser to be set to.
    */
    public void setDesiredMaxAge(int a)
    {
        _desiredMaxAge = a;
    }
    
    /**
    * Returns a float.
    * <p>
    * This is the get method for the advertiser's desired minimum income.
    */
    public float getDesiredMinIncome()
    {
        return _desiredMinIncome;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the advertiser's desired minimum income.
    * 
    * @param  i The desired minimum income of the advertiser to be set to.
    */
    public void setDesiredMinIncome(float i)
    {
        _desiredMinIncome = i;
    }
    
    /**
    * Returns a float.
    * <p>
    * This is the get method for the advertiser's desired maximum income.
    */
    public float getDesiredMaxIncome()
    {
        return _desiredMaxIncome;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the advertiser's desired maximum income.
    * 
    * @param  i The desired maximum income of the advertiser to be set to.
    */
    public void setDesiredMaxIncome(float i)
    {
        _desiredMaxIncome = i;
    }
    
    /**
    * Returns a String.
    * <p>
    * This is the get method for one of the advertiser's messages' author.
    * 
    * @param i The index number for the message's author.
    */
    public String getMessageAuthor(int i)
    {
        return _messageAuthor.get(i);
    }
    
    /**
    * Returns a String.
    * <p>
    * This is the get method for one of the advertiser's messages.
    * 
    * @param i The index number for the message.
    */
    public String getMessage(int i)
    {
        return _message.get(i);
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the method for the adding a message and it's author to the
    * advertiser.
    * 
    * @param  a The message's author to be added.
    * @param  m The message to be added.
    */
    public void addMessage(String a, String m)
    {
        _messageAuthor.add(a);
        _message.add(m);
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the method for the deleting a message and it's author to the
    * advertiser.
    * 
    * @param  i The index number for the message.
    */
    public void deleteMessage(int i)
    {
        _messageAuthor.remove(i);
        _message.remove(i);
    }
    
    /**
    * Returns an integer.
    * <p>
    * This is the get method for the advertiser's maximum amount of messages.
    */
    public int getMaxMessageNo()
    {
        return _message.size();
    }
}
