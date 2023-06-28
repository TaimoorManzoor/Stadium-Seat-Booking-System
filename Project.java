package project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public  class Project 
{            
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        category object0 = new category();
        Stadium object1 = new category();
        Registration obj = new Registration();
        System.out.print("Press 1 for Sign-up or Press 2 for Sign-in: ");
        int choice = input.nextInt();
        switch(choice)
        {
        case 1:
        {    
            obj.signup();
            System.out.println("\nWould you like to login ?");
            String s = input.next();
            if(s.equalsIgnoreCase("yes"))
            {
                System.out.println("------------\n |SIGN-IN|\n------------");
                obj.login();
            }
            else
            {
                System.out.println("Program Closed!");
                System.exit(0);
            }
            break;  
        }    
        case 2:
        {           
               System.out.println("------------\n |SIGN-IN|\n------------");
               obj.login();
               break;
        }
        default:
        {       
            System.exit(0);
            break;
        }
        }

         System.out.println("\nAvailable Booking\n-----------------");
         object0.Schedule();
         System.out.println("\nPress 1 for Match 1 and so on: ");
         int i=input.nextInt();
         
          if(i==1 || i==4)
          {//Lahore
              object1.Stadium(0.001f);
              object0.category();
              object0.price();
              System.out.println("Your total bill is : "+object0.getPrice());
              object0.seatnumber(0.001f); 
          }
           else if(i==2 || i==3)
          {//karachi
              object1.Stadium(0);
              object0.category();
              object0.price();
              System.out.println("Your total bill is : "+object0.getPrice());
              object0.seatnumber(0); 
          }
           else if(i==5 || i==6)
           {//Rawalpindi
              object1.Stadium(0.001);
              object0.category();
              object0.price();
              System.out.println("Your total bill is : "+object0.getPrice());
              object0.seatnumber(0.001); 
          }
          else
         {      
                
                try   
                {
                    throw new AgeException("please tell us your correct stadium");
                }   
                catch(Exception e)
                {
                    System.out.println(""+e.getMessage());
                    System.exit(0);
                } 
                
          }
                 
         }   
}
 
abstract class Stadium
{
    int i;
    static int seat;
    void Stadium(int i)
    {//karachi                            
        
        Scanner input=new Scanner(System.in);
        final int Capacity=34228;
        System.out.println("How many seat do you want?");
        seat=input.nextInt();
         
    }                                        
    void Stadium(double i)
    { // Rawalpindi
       
       Scanner input=new Scanner(System.in);
       final int  Capicity=15000;
       System.out.println("How many seat do you want?");
        seat=input.nextInt();
    }
    void Stadium(float i)
    { //Lahore  
       
       Scanner input=new Scanner(System.in);
       final int  Capicity = 27000;
       System.out.println("How many seat  do you want?");
        seat=input.nextInt();
    }
    abstract void category();
    abstract  void  price(); 
}
class category extends Stadium
{
    char  category_seat;
    private int price;
    int categoryprice;
    int onlyseatprice=1000;
    @Override
    void category()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\n-----------------------------");
        System.out.println("Press A for Highter Seat ");
        System.out.println("Press B for Medium Seat ");
        System.out.println("Press C for Lower Seat ");
        System.out.print("Which category of the seat do you want: ");
        
        category_seat=input.next().charAt(0);
        switch(category_seat)
        {
            case 'A':
            {
                System.out.println("You choosen the  Highter category");
                
                break;
            }
            case 'B':
            {
                System.out.println("You choosen the  Medium category ");
                break;
            }
            case 'C':            
            {
                System.out.println("You choosen the  Lower category ");
                break;
            }
            default:
            {
                System.out.println("You choose the wrong category");
                break;
            }    
        }
        
    }
    @Override
    void  price()
    {
        System.out.println("\n\n");
        System.out.println("-----------|RECEIPT|-----------\n-------------------------------");
       if(category_seat=='A')
       {
            categoryprice=2000;
            price=(categoryprice+onlyseatprice)*seat;
            
            
       }
       else if(category_seat=='B')
       {
           categoryprice=1500;
           price=(categoryprice+onlyseatprice)*seat;
           
       }
       else if(category_seat=='C')
       {
           categoryprice=1000;
           price=(categoryprice+onlyseatprice)*seat;
           
       }   
    }
    void seatnumber(double i)         
    {
       if(category_seat=='A')
       {
           System.out.print("Your seat number is :");
           for (int j = 1; j <=seat; j++)
           {
               System.out.println(""+j);
               if(j==1999)
               {
                   break;
               }    
           }
       }
       else if(category_seat=='B')
       {
            System.out.println("You seat number is :");
           for (int j = 2000; j <=(1999+seat); j++)
           {
               System.out.println(""+j);
               if(j==9999)
               {
                   break;
               }    
           }
       }
       else if(category_seat=='C')
       {
           System.out.println("You seat number is :");
           for (int j = 10000; j <=(9999+seat); j++)
           {
               System.out.println(""+j);
               if(15000==j)
               {
                   break;
               }    
           }
       }
        System.out.println("Thank you for tuning in!");
    }
    
    void seatnumber(int i)         
    {
       if(category_seat=='A')
       {
           System.out.println("You seat number is :");
           for (int j = 1; j <= seat; j++)
           {
               System.out.println(""+j);
               if(j==2999)
               {
                   break;
               }    
           }
       }
       else if(category_seat=='B')
       {
            System.out.println("You seat number is :");
           for (int j = 3000; j <=(2999+seat); j++)
           {
               System.out.println(""+j);
               if(j==19999)
               {
                   break;
               }    
           }
       }
       else if(category_seat=='C')
       {
           System.out.println("You seat number is :");
           for (int j = 20000; j <=(19999+seat); j++)
           {
               System.out.println(""+j);
               if(34228==j)
               {
                   break;
               }    
           }
       }
       System.out.println("Thank you for tuning in!");
    }
    void seatnumber(float i)         
    {
       if(category_seat=='A')
       {
           System.out.println("You seat number is :");
           for (int j = 1; j <=seat; j++)
           {
               System.out.println(""+j);
               if(j==4999)
               {
                  break; 
               }    
           }
       }
       else if(category_seat=='B')
       {
            System.out.println("You seat number is :");
           for (int j = 5000; j <=(4999+seat); j++)
           {
               System.out.println(""+j);
               if(19999==j)
               {
                    break;
               }
           }
       }
       else if(category_seat=='C')
       {
           System.out.println("You seat number is :");
           for (int j = 20000; j <=(19999+seat); j++)
           {
               System.out.println(""+j);
           
           if(27000==j)
           {
               break;
           }
           }   
       } 
       System.out.println("Thank you for tuning in!");
    }    
    
    public int getPrice() 
    {
        return price;
    }       
    void Schedule()
    {
        System.out.println("Match No ||                Team             ||    Date    ||  Time   ||   Stadium Name  ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Match 1 || Multan Sultan vs Lahore Qalander ||  15-3-2021 || 3:00 PM || Gadafi Stadium");
        System.out.println("Match 2 || Karachi King vs Quetta Gladiator ||  15-3-2021 || 7:00 PM || National Stadium");
        System.out.println("Match 3 || Multan Sultan vs Karachi King    ||  16-3-2021 || 3:00 PM || National Stadium");
        System.out.println("Match 4 || Multan Sultan vs Lahore Qalander ||  16-3-2021 || 7:00 PM || Gadafi Stadium");
        System.out.println("Match 5 || Quetta Gladiator vs Multan Sultan||  17-3-2021 || 3:00 PM || Pindi Stadium");
        System.out.println("Match 6 || Lahore Qalander vs Karachi King  ||  17-3-2021 || 3:00 PM || Pindi Stadium");
    }
}  
class Registration
{
     String name;
     String surname;
     String Mobile_number;
     String Email;
     String Password;
     int age;
     String Gender;
 
     void signup() throws IOException
     {
        Scanner input=new Scanner(System.in);
        FileWriter file=new FileWriter("data.txt",true);
        FileReader file0=new FileReader("data.txt");
        BufferedWriter w=new BufferedWriter(file);
         System.out.println("------------\n|SIGN-UP|\n------------");
        System.out.print("Enter your name: ");
        name=input.next();
        w.append(name);
        w.newLine();
        System.out.print("Enter your surname: ");
        surname=input.next();
        w.append(surname);
        w.newLine();
        System.out.print("Enter your phone number: ");
        Mobile_number=input.next();
        try
        {
         if(Mobile_number.length()!=11)
        {
            throw new AgeException("Please give us your correct cell phone number");
        }  
        }
        catch(Exception e)
        {
            System.out.println(""+e.getMessage());
        }
        w.append(Mobile_number);
        w.newLine();
        System.out.print("Enter your password: ");
        Password=input.next();
        w.append(Password);
        w.newLine();
        System.out.print("Enter your age: ");
        age=input.nextInt();
        try
        {    
        if(age<0)
        {
            throw new AgeException("Invalid age!"); 
        }
        else if(age>150)
        {
            throw new AgeException("Invalid age"); 
        }    
        }
        catch(Exception e)
        {
            System.out.println(""+e.toString());
        }
        w.append((char)age);
        w.newLine();
         System.out.println("-----------------------");
        System.out.println("Press 1: Male\npress 2: Female\nPress 3: Custom");
        System.out.print("Enter your gender (1/2/3): ");
         int i=input.nextInt();
         switch(i)
         {
             case 1:
             {
                 Gender="Male";
                char Gender1[]=Gender.toCharArray();
                 for (int j = 0; j < Gender1.length; j++)
                 { 
                  w.append(Gender1[j]);
                  
                 }
                 break;
             }
              case 2:
             {
                 Gender="Female";
               char Gender1[]=Gender.toCharArray();
                for (int j = 0; j < Gender1.length; j++)
                { 
                     w.append(Gender1[j]);
                }
                  break;
                  
             }
             case 3:
            {
                 Gender="Custom";
                 char Gender1[]=Gender.toCharArray();
                 for (int j = 0; j < Gender1.length; j++)
                { 
                     w.append(Gender1[j]);
                }
                  break;
             }
           
             default:
            {
            try   
            {
                throw new AgeException("please tell us your correct gender");
            }
             catch(Exception e)
            {
                System.out.println(""+e.getMessage());
            } 
            }
  
         } 
        w.newLine();
        w.close();
        file.close();
     }               
     void login() throws IOException
     {
        int i=0;
        int j = 0;
        String Name;
        String namechecking[] = new String[10];
        String Password;
        String Passwordchecking[] = new String[10];
        Scanner input=new Scanner(System.in);
        FileReader fileR=new FileReader("data.txt");
        BufferedReader r=new BufferedReader(fileR);
        System.out.print("Enter your name : ");
        Name=input.next();
        System.out.print("Enter your Password : ");
        Password=input.next();
        for (int k = 0; k < namechecking.length; k++) 
        { 
           namechecking[i] = r.readLine();
           if(namechecking[i].equals(name))
           {
               break;
           }
        }
        for (int k = 0; k < Passwordchecking.length; k++) 
        {
           Passwordchecking[i]=r.readLine();
           if(Passwordchecking[i].equals(Password))
           {
               System.out.println("You can continue");
               break;
           }

        }  
     }    
}        
class AgeException extends Exception
{
    AgeException()
    {
        super();
    }
    AgeException(String message)
    {
        super(message);
    } 
}
class MobilephoneException extends Exception
{
    MobilephoneException()
    {
        super();
    }
    MobilephoneException(String message)
    {
        super(message);
    } 
}
class GenderException extends Exception
{
    GenderException() 
    {
        super();
    }
    GenderException(String message)
    {
        super(message);
    } 
}
/*
=>object
=>class
=>Inhertiance
=>Encapsulation
=>Polymorphism
=>Abstraction
=>File handling
=>Exceptional handling
*/