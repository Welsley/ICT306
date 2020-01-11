/* 
 * ICT306 Assignment 1 Question 2
 * By: Welsley Lui
 * Student No: 31612382
 * Date: 17/04/2015
 * File name: Main.java
 * 
 * This program is for implementing, and testing my classes made for an online
 * dating service.
 * It is assumed that the user will navigate through the program by the use of a
 * keyboard only, and by following on screen instructions.
 * The program will not check or force the user to input the correct type
 * values.
 */
package ict306assignment1question2;

import java.util.Vector;
import java.util.Scanner;
import ict306assignment1question2.Classes.GenderEnum;
import ict306assignment1question2.Classes.Advertiser;
import ict306assignment1question2.Classes.Responder;
import java.util.Stack;

public class Main
{
    // Variables
    private static Vector<Advertiser> _advertiser;
    private static Vector<Responder> _responder;
    private static int _user;
    
    /**
    * Returns nothing.
    * <p>
    * This method is the main method, where the program executes it's main
    * purpose.
    *
    * @param  args
    */
    public static void main(String[] args)
    {
        // Initialisation
        initialise();
        
        // Execution
        displayStudentDetails();
        menu();
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for displaying my student details. Details include my name,
    * student number, mode of enrollment, tutor, and my alloted day and time of
    * my tutorial attendance.
    */
    private static void displayStudentDetails()
    {
        System.out.println("Name: Welsley Lui");
        System.out.println("Student No: 31612382");
        System.out.println("Mode of enrollment: Internal");
        System.out.println("Tutor:");
        System.out.println("Tutorial attendance day and time: Wednesday 14:30-15:30");
        System.out.println("");
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for initializing the program.
    */
    private static void initialise()
    {
        _advertiser = new Stack<Advertiser>();
        _responder = new Stack<Responder>();
        
        createSampleData();
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method creates the sample test data for the program.
    */
    private static void createSampleData()
    {
        // Adding empty customers into the vectors.
        _advertiser.add(new Advertiser());
        _advertiser.add(new Advertiser());
        _advertiser.add(new Advertiser());
        _responder.add(new Responder());
        _responder.add(new Responder());
        _responder.add(new Responder());
        
        // Initialising the empty customers.
        // Advertiser 1
        _advertiser.get(0).setLoginName("Test Subject 000");
        _advertiser.get(0).setPassword("ts000");
        _advertiser.get(0).setGender(GenderEnum.Gender.MALE);
        _advertiser.get(0).setAge(20);
        _advertiser.get(0).setIncome(70000);
        _advertiser.get(0).setAdvert("Test Subject 000 Advert");
        _advertiser.get(0).setDesiredGender(GenderEnum.Gender.FEMALE);
        _advertiser.get(0).setDesiredMinAge(18);
        _advertiser.get(0).setDesiredMaxAge(30);
        _advertiser.get(0).setDesiredMinIncome(0);
        _advertiser.get(0).setDesiredMaxIncome(100000);
        
        // Advertiser 2
        _advertiser.get(1).setLoginName("Test Subject 001");
        _advertiser.get(1).setPassword("ts001");
        _advertiser.get(1).setGender(GenderEnum.Gender.FEMALE);
        _advertiser.get(1).setAge(23);
        _advertiser.get(1).setIncome(60000);
        _advertiser.get(1).setAdvert("Test Subject 001 Advert");
        _advertiser.get(1).setDesiredGender(GenderEnum.Gender.MALE);
        _advertiser.get(1).setDesiredMinAge(23);
        _advertiser.get(1).setDesiredMaxAge(26);
        _advertiser.get(1).setDesiredMinIncome(0);
        _advertiser.get(1).setDesiredMaxIncome(85000);
        
        // Advertiser 3
        _advertiser.get(2).setLoginName("Test Subject 002");
        _advertiser.get(2).setPassword("ts002");
        _advertiser.get(2).setGender(GenderEnum.Gender.FEMALE);
        _advertiser.get(2).setAge(22);
        _advertiser.get(2).setIncome(85000);
        _advertiser.get(2).setAdvert("Test Subject 002 Advert");
        _advertiser.get(2).setDesiredGender(GenderEnum.Gender.FEMALE);
        _advertiser.get(2).setDesiredMinAge(20);
        _advertiser.get(2).setDesiredMaxAge(25);
        _advertiser.get(2).setDesiredMinIncome(0);
        _advertiser.get(2).setDesiredMaxIncome(100000);
        
        // Responder 1
        _responder.get(0).setLoginName("Test Subject 003");
        _responder.get(0).setPassword("ts003");
        _responder.get(0).setGender(GenderEnum.Gender.FEMALE);
        _responder.get(0).setAge(18);
        _responder.get(0).setIncome(45000);
        
        // Responder 2
        _responder.get(1).setLoginName("Test Subject 004");
        _responder.get(1).setPassword("ts004");
        _responder.get(1).setGender(GenderEnum.Gender.MALE);
        _responder.get(1).setAge(26);
        _responder.get(1).setIncome(85000);
        
        // Responder 3
        _responder.get(2).setLoginName("Test Subject 005");
        _responder.get(2).setPassword("ts005");
        _responder.get(2).setGender(GenderEnum.Gender.FEMALE);
        _responder.get(2).setAge(27);
        _responder.get(2).setIncome(100000);
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for workings of the menu of the program.
    */
    private static void menu()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        int i = 0;
        
        while(option != 6)
        {
            System.out.println("Please select an option by entering the option's corresponding integer:");
            System.out.println("  1 - Login.");
            System.out.println("  2 - Add a customer.");
            System.out.println("  3 - Delete a customer.");
            System.out.println("  4 - Display details of all advertisers registered.");
            System.out.println("  5 - Display details of all responders registered.");
            System.out.println("  6 - Quit.");
            System.out.println("");
            option = input.nextInt();
            input.nextLine();
            
            switch (option)
            {
                case 1:
                {
                    logIn();
                    break;
                }
                case 2:
                {
                    addCustomer();
                    break;
                }
                case 3:
                {
                    deleteCustomer();
                    break;
                }
                case 4:
                {
                    for (i = 0; i < _advertiser.size(); i++)
                    {
                        showAdvertiserDetail(i);
                        System.out.println("");
                    }
                    break;
                }
                case 5:
                {
                    for (i = 0; i < _responder.size(); i++)
                    {
                        showResponderDetail(i);
                        System.out.println("");
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("");
                    System.out.println("Program End.");
                    System.out.println("");
                    break;
                }
                default:
                {
                    option = 0;
                    System.out.println("");
                    System.out.println("Invalid option!");
                    break;
                }
            }
        }
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for the login stage of the program.
    */
    private static void logIn()
    {
        String userName = "";
        String userPassword = "";
        int i = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Please enter your login name:");
        userName = input.nextLine();
        System.out.println("");
        System.out.println("Please enter your login password:");
        userPassword = input.nextLine();
        
        for (i = 0; i < _advertiser.size(); i++)
        {
            if (userName.equals(_advertiser.get(i).getLoginName()))
            {
                if (userPassword.equals(_advertiser.get(i).getPassword()))
                {
                    logInAdvertiserMenu(i);
                }
            }
        }
        
        for (i = 0; i < _responder.size(); i++)
        {
            if (userName.equals(_responder.get(i).getLoginName()))
            {
                if (userPassword.equals(_responder.get(i).getPassword()))
                {
                    logInResponderMenu(i);
                }
            }
        }
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for the advertiser menu.
    * 
    * @param i The index of the advertiser.
    */
    private static void logInAdvertiserMenu(int i)
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        
        while(option != 3)
        {
            System.out.println("");
            System.out.println("Please select an option by entering the option's corresponding integer:");
            System.out.println("  1 - Show personal details.");
            System.out.println("  2 - Read all messages.");
            System.out.println("  3 - Log out.");
            System.out.println("");
            option = input.nextInt();
            input.nextLine();
            
            switch (option)
            {
                case 1:
                {
                    showAdvertiserDetail(i);
                    break;
                }
                case 2:
                {
                    int x = 0;
                    for(x = 0; x < _advertiser.get(i).getMaxMessageNo(); x++)
                    {
                        System.out.println("");
                        System.out.println("-------------------------");
                        System.out.println("From: " + _advertiser.get(i).getMessageAuthor(x));
                        System.out.println("Message: " + _advertiser.get(i).getMessage(x));
                        System.out.println("-------------------------");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Logging out.");
                    break;
                }
                default:
                {
                    System.out.println("");
                    System.out.println("Invalid option!");
                    option = 0;
                    break;
                }
            }
        }
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for the responder menu.
    * 
    * @param i The index of the responder.
    */
    private static void logInResponderMenu(int i)
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        String message = "";
        
        while(option != 3)
        {
            System.out.println("Please select an option by entering the option's corresponding integer:");
            System.out.println("  1 - Show personal details.");
            System.out.println("  2 - Message matches.");
            System.out.println("  3 - Log out.");
            System.out.println("");
            option = input.nextInt();
            input.nextLine();
            
            switch (option)
            {
                case 1:
                {
                    showResponderDetail(i);
                    break;
                }
                case 2:
                {
                    int x = 0;
                    for(x = 0; x < _advertiser.size(); x++)
                    {
                        if (isMatch(_advertiser.get(x), _responder.get(i)))
                        {
                            System.out.println("");
                            System.out.println("Match found: " + _advertiser.get(x).getLoginName());
                            System.out.println("Advert: " + _advertiser.get(x).getAdvert());
                            System.out.println("");
                            System.out.println("Write your message:");
                            message = input.nextLine();
                            
                            _advertiser.get(x).addMessage(_responder.get(i).getLoginName(), message);
                        }
                    }
                    System.out.println("");
                    System.out.println("No more matches found.");
                    break;
                }
                case 3:
                {
                    System.out.println("Logging out.");
                    break;
                }
                default:
                {
                    System.out.println("");
                    System.out.println("Invalid option!");
                    option = 0;
                    break;
                }
            }
        }
    }
    
    /**
    * Returns a boolean.
    * <p>
    * This method is for determining if the advertiser and responder are a
    * match.
    * 
    * @param a The advertiser to compare.
    * @param r The responder to compare.
    */
    private static boolean isMatch(Advertiser a, Responder r)
    {
        boolean flag = false;
        
        if (r.getGender() == a.getDesiredGender())
        {
            if (r.getAge() >= a.getDesiredMinAge() && r.getAge() <= a.getDesiredMaxAge())
            {
                if (r.getIncome() >= a.getDesiredMinIncome() && r.getIncome() <= a.getDesiredMaxIncome())
                {
                    flag = true;
                }
            }
        }
        else
        {
            flag = false;
        }
        
        return flag;
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for adding a customer into the program.
    */
    private static void addCustomer()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        String tempString = "";
        int tempInt = 0;
        float tempFloat = 0;
        
        while(option != 3)
        {
            System.out.println("");
            System.out.println("Please select an option by entering the option's corresponding integer:");
            System.out.println(" 1 - Create advertiser account.");
            System.out.println(" 2 - Create responder account.");
            System.out.println(" 3 - Quit.");
            System.out.println("");
            option = input.nextInt();
            input.nextLine();
            
            switch (option)
            {
                case 1:
                {
                    _advertiser.add(new Advertiser());
                    System.out.println("");
                    System.out.println("Please enter the advertiser's login name:");
                    System.out.println("");
                    tempString = input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setLoginName(tempString);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's login password:");
                    System.out.println("");
                    tempString = input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setPassword(tempString);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's age:");
                    System.out.println("");
                    tempInt = input.nextInt();
                    input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setAge(tempInt);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's gender (m/f):");
                    System.out.println("");
                    tempString = input.nextLine();
                    if(tempString.equalsIgnoreCase("f"))
                    {
                        _advertiser.get(_advertiser.size() - 1).setGender(GenderEnum.Gender.FEMALE);
                    }
                    else
                    {
                        _advertiser.get(_advertiser.size() - 1).setGender(GenderEnum.Gender.MALE);
                    }
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's income:");
                    System.out.println("");
                    tempFloat = input.nextFloat();
                    input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setIncome(tempFloat);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's advert:");
                    System.out.println("");
                    tempString = input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setAdvert(tempString);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's desired gender:");
                    System.out.println("");
                    tempString = input.nextLine();
                    if(tempString.equalsIgnoreCase("f"))
                    {
                        _advertiser.get(_advertiser.size() - 1).setDesiredGender(GenderEnum.Gender.FEMALE);
                    }
                    else
                    {
                        _advertiser.get(_advertiser.size() - 1).setDesiredGender(GenderEnum.Gender.MALE);
                    }
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's desired minimum age:");
                    System.out.println("");
                    tempInt = input.nextInt();
                    input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setDesiredMinAge(tempInt);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's desired maximum age:");
                    System.out.println("");
                    tempInt = input.nextInt();
                    input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setDesiredMaxAge(tempInt);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's desired minimum income:");
                    System.out.println("");
                    tempFloat = input.nextFloat();
                    input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setDesiredMinIncome(tempFloat);
                    
                    System.out.println("");
                    System.out.println("Please enter the advertiser's desired maximum income:");
                    System.out.println("");
                    tempFloat = input.nextFloat();
                    input.nextLine();
                    _advertiser.get(_advertiser.size() - 1).setDesiredMaxIncome(tempFloat);
                    break;
                }
                case 2:
                {
                    _responder.add(new Responder());
                    System.out.println("");
                    System.out.println("Please enter the responder's login name:");
                    System.out.println("");
                    tempString = input.nextLine();
                    _responder.get(_responder.size() - 1).setLoginName(tempString);
                    
                    System.out.println("");
                    System.out.println("Please enter the responder's login password:");
                    System.out.println("");
                    tempString = input.nextLine();
                    _responder.get(_responder.size() - 1).setPassword(tempString);
                    
                    System.out.println("");
                    System.out.println("Please enter the responder's age:");
                    System.out.println("");
                    tempInt = input.nextInt();
                    input.nextLine();
                    _responder.get(_responder.size() - 1).setAge(tempInt);
                    
                    System.out.println("");
                    System.out.println("Please enter the responder's gender (m/f):");
                    System.out.println("");
                    tempString = input.nextLine();
                    if(tempString.equalsIgnoreCase("f"))
                    {
                        _responder.get(_responder.size() - 1).setGender(GenderEnum.Gender.FEMALE);
                    }
                    else
                    {
                        _responder.get(_responder.size() - 1).setGender(GenderEnum.Gender.MALE);
                    }
                    
                    System.out.println("");
                    System.out.println("Please enter the responder's income:");
                    System.out.println("");
                    tempFloat = input.nextFloat();
                    input.nextLine();
                    _responder.get(_responder.size() - 1).setIncome(tempFloat);
                    break;
                }
                case 3:
                {
                    System.out.println("");
                    System.out.println("Exiting to main menu.");
                    break;
                }
                default:
                {
                    System.out.println("");
                    System.out.println("Invalid option!");
                    option = 0;
                    break;
                }
            }
        }
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for deleting a customer from the program.
    */
    private static void deleteCustomer()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        int tempInt = 0;
        
        while(option != 3)
        {
            System.out.println("");
            System.out.println("Please select an option by entering the option's corresponding integer:");
            System.out.println(" 1 - Delete an advertiser account.");
            System.out.println(" 2 - Delete a responder account.");
            System.out.println(" 3 - Quit.");
            System.out.println("");
            option = input.nextInt();
            input.nextLine();
            
            switch (option)
            {
                case 1:
                {
                    System.out.println("");
                    System.out.println("Enter the advertiser account's integer number to be deleted (The first account is 0, second is 1 etc):");
                    tempInt = input.nextInt();
                    input.nextLine();
                    _advertiser.remove(tempInt);
                    break;
                }
                case 2:
                {
                    System.out.println("");
                    System.out.println("Enter the responder account's integer number to be deleted (The first account is 0, second is 1 etc):");
                    tempInt = input.nextInt();
                    input.nextLine();
                    _responder.remove(tempInt);
                    break;
                }
                case 3:
                {
                    System.out.println("");
                    System.out.println("Exiting to main menu.");
                    break;
                }
                default:
                {
                    System.out.println("");
                    System.out.println("Invalid option!");
                    option = 0;
                    break;
                }
            }
        }
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for showing all the details of an advertiser customer in the program.
    * 
    * @param i The index integer of the advertiser account in question.
    */
    private static void showAdvertiserDetail(int i)
    {
        System.out.println("");
        System.out.println("Login name = " + _advertiser.get(i).getLoginName());
        System.out.println("Login password = " + _advertiser.get(i).getPassword());
        System.out.println("Age = " + _advertiser.get(i).getAge());
        System.out.println("Gender = " + _advertiser.get(i).getGender());
        System.out.println("Income = " + _advertiser.get(i).getIncome());
        System.out.println("Advert = " + _advertiser.get(i).getAdvert());
        System.out.println("Desired gender = " + _advertiser.get(i).getDesiredGender());
        System.out.println("Desired minimum age = " + _advertiser.get(i).getDesiredMinAge());
        System.out.println("Desired maximum age = " + _advertiser.get(i).getDesiredMaxAge());
        System.out.println("Desired minimum income = $" + _advertiser.get(i).getDesiredMinIncome());
        System.out.println("Desired maximum income = $" + _advertiser.get(i).getDesiredMaxIncome());
    }
    
    /**
    * Returns nothing.
    * <p>
    * This method is for showing all the details of an responder customer in the program.
    * 
    * @param i The index integer of the responder account in question.
    */
    private static void showResponderDetail(int i)
    {
        System.out.println("");
        System.out.println("Login name = " + _responder.get(i).getLoginName());
        System.out.println("Login password = " + _responder.get(i).getPassword());
        System.out.println("Age = " + _responder.get(i).getAge());
        System.out.println("Gender = " + _responder.get(i).getGender());
        System.out.println("Income = " + _responder.get(i).getIncome());
    }
}