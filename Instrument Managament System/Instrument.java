/**
 * the instrument class has 5 variables: 1 variable is static and other
 * 4 are instance variables. A constructor is created with instrumentName as String
 * getters setters name
 * @author (Srijan Shakya)
 * @version (21049600, 17.0.1)
 */
public class Instrument
{   
    //instrumentID has been initialized as static variable having int datatype
    private static int instrumentID;
    //instance variable are initialized as String
    private String instrumentName, customerName, customerMobileNumber;
    //instance variable is intialized as long
    private long customerPAN;
    //constructor is called for object creation
    public Instrument(String instrumentName)
    {
        this.instrumentName=instrumentName;
        this.customerName="";
        this.customerMobileNumber="";
        this.customerPAN=0;
        instrumentID++;
        System.out.println("The Instrument id is:" + this.instrumentID);
    }
    //Setter method for initializing value
    public void setInstrumentId(int instrumentID)
    {
        Instrument.instrumentID = instrumentID ;
    }
    //Setter method for initializing value
    public void setInstrumentName(String instrumentName)
    {
        this.instrumentName = instrumentName;
    }
    //Setter method for initializing value
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    //Setter method for initializing value
    public void setCustomerMobileNumber(String customerMobileNumber)
    {
        this.customerMobileNumber = customerMobileNumber;
    }
    //Setter method for initializing value
    public void setCustomerPAN(long customerPAN)
    {
        this.customerPAN = customerPAN;
    }
    //Getter method for returning value
    public int getInstrumentId()
    {
        return Instrument.instrumentID ;
    }
    //Getter method for returning value
    public String getInstrumentName()
    {
        return this.instrumentName;
    }
    //Getter method for returning value
    public String getCustomerName()
    {
        return this.customerName;
    }
    //Getter method for returning value
    public String getCustomerMobileNumber()
    {
        return this.customerMobileNumber;
    }
    //Getter method for returning value
    public long getCustomerPAN()
    {
        return this.customerPAN;
    }
    //Method to Display output
    public void display()
    {
        System.out.println("The instrument Id is:" + Instrument.instrumentID);
        System.out.println(this.instrumentName);
        if (customerName.equals("") && customerMobileNumber.equals("") && customerPAN == 0 )
        {
            System.out.println("Customer details empty");
        }
        else
        {
         System.out.println(this.customerName);
         System.out.println(this.customerMobileNumber);
         System.out.println(this.customerPAN);
        }
    }
}