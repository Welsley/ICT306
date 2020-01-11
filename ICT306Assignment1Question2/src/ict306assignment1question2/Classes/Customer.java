/* 
 * ICT306 Assignment 1 Question 2
 * By: Welsley Lui
 * Student No: 31612382
 * Date: 17/04/2015
 * File name: Customer.java
 * 
 * This is the Customer class for the online dating service.
 */
package ict306assignment1question2.Classes;

import ict306assignment1question2.Classes.GenderEnum;

public class Customer
{
    protected String _loginName;
    protected String _password;
    protected GenderEnum.Gender _gender;
    protected int _age;
    protected float _income;
    
    /**
    * Returns nothing.
    * <p>
    * This is the constructor method for this class.
    */
    public Customer()
    {
        _loginName = "UNKNOWN";
        _password = "UNKNOWN";
        _gender = GenderEnum.Gender.MALE;
        _age = 18;
        _income = 0;
    }
    
    /**
    * Returns a String.
    * <p>
    * This is the get method for the customer's login name.
    */
    public String getLoginName()
    {
        return _loginName;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the customer's login name.
    * 
    * @param  n The login name of the customer is to be set to.
    */
    public void setLoginName(String n)
    {
        _loginName = n;
    }
    
    /**
    * Returns a String.
    * <p>
    * This is the get method for the customer's password.
    */
    public String getPassword()
    {
        return _password;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the customer's password.
    * 
    * @param  p The password of the customer to be set to.
    */
    public void setPassword(String p)
    {
        _password = p;
    }
    
    /**
    * Returns a Gender enumeration.
    * <p>
    * This is the get method for the customer's gender.
    */
    public GenderEnum.Gender getGender()
    {
        return _gender;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the customer's password.
    * 
    * @param  g The gender of the customer to be set to.
    */
    public void setGender(GenderEnum.Gender g)
    {
        _gender = g;
    }
    
    /**
    * Returns an integer.
    * <p>
    * This is the get method for the customer's age.
    */
    public int getAge()
    {
        return _age;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the customer's age.
    * 
    * @param  a The age of the customer to be set to.
    */
    public void setAge(int a)
    {
        _age = a;
    }
    
    /**
    * Returns an float.
    * <p>
    * This is the get method for the customer's income.
    */
    public float getIncome()
    {
        return _income;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This is the set method for the customer's income.
    * 
    * @param  i The income of the customer to be set to.
    */
    public void setIncome(float i)
    {
        _income = i;
    }
}