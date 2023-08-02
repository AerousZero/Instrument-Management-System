/**
 * InstrumentToRent class has 5 instance variable
 * constructor having two parameter is created
 * @author (Srijan Shakya)
 * @version (21049600, 17.0.1)
 */
public class InstrumentToRent extends Instrument
{
   /*Instance variables are initialized
    *the method type is set to private
    *chargePerDay and noOfDays has int as datatype
    *dateOfRent and dateOfReturn has String as datatype
    *isRented has boolean as datatype
    */
   private int chargePerDay, noOfDays;
   private String dateOfRent, dateOfReturn;
   private boolean isRented;
   //constructor is called for object creation
   public InstrumentToRent(String instrumentName, int chargePerDay)
   {
        super(instrumentName);
        this.chargePerDay=chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
   }
   //Setter Method or Mutator Method
   public void setChargePerDay(int chargePerDay)
   {
       this.chargePerDay = chargePerDay;
   }
   //Setter method for initializing value
   public void setDateOfRent(String dateOfRent)
   {
       this.dateOfRent = dateOfRent;
   }
   //Setter method for initializing value
   public void setDateOfReturn(String dateOfReturn)
   {
       this.dateOfReturn = dateOfReturn;
   }
   //Setter method for initializing value
   public void setNoOfDays(int noOfDays)
   {
       this.noOfDays = noOfDays;
   }
   //Setter method for initializing value
   public void setIsRented(boolean isRented)
   {
       this.isRented = isRented;
   }
   //Getter Method or accessor method
   public int getChargePerDay()
   {
       return this.chargePerDay;
   }
   //Getter method for returning value
   public String getDateOfRent()
   {
       return this.dateOfRent;
   }
   //Getter method for returning value
   public String getDateOfReturn()
   {
       return this.dateOfReturn;
   }
   //Getter method for returning value
   public int getNoOfDays()
   {
       return this.noOfDays;
   }
   //Getter method for returning value
   public boolean getIsRented()
   {
       return this.isRented;
   }
   //Method to rent the instrument
   public void instrumentRent(String customerName, String customerMobileNumber, long customerPAN, String dateOfReturn, String dateOfRent, int noOfDays)
   {
       if(this.isRented == true)
       {
           System.out.println("Not available for renting ");
           System.out.println("Customer  "+ customerName);
           System.out.println("CustomerPhoneNumber:"+ customerMobileNumber);
           System.out.println("DateOfReturn:"+ dateOfReturn);
       }
       else
       {
           this.setCustomerName(customerName);
           this.setCustomerMobileNumber(customerMobileNumber);
           this.setCustomerPAN(customerPAN);
           this.dateOfReturn = dateOfReturn;
           this.dateOfRent = dateOfRent;
           this.noOfDays = noOfDays;
           this.isRented = true;
           int totalCharge = this. noOfDays * this.chargePerDay ;
           System.out.println("CustomerName:" + customerName);
           System.out.println("CustomerPhoneNumber:" + customerMobileNumber);
           System.out.println("CustomerPan:" + customerPAN);
           System.out.println("DateOfRent:"+ dateOfRent);
           System.out.println("DateOfReturn:"+ dateOfReturn);
           System.out.println("NoOfDays:" + noOfDays);
           System.out.println("TotalCharge:" + totalCharge);
       }
   }
   //method for returning 
   public void instrumentReturn()
   {
       if(isRented == false)
       {
           System.out.println("The instrument is avaliable for rent");
       }
       else
       {
           this.setCustomerName("");
           this.setCustomerMobileNumber("");
           this.dateOfReturn ="";
           this.dateOfRent = "";
           this.setCustomerPAN(0);
           this.noOfDays = 0;
           this.isRented = false;
           
       }
   }
   //Method to Display output
   public void display()
   {//method signature = method name + method parameter
       super.display();
       if(isRented == true)
       {
        System.out.println("CustomerName:" + this.getCustomerName());
        System.out.println("CustomerPhoneNumber:" + this.getCustomerMobileNumber());
        System.out.println("CustomerPan:" + this.getCustomerPAN());
        System.out.println("DateOfRent:"+ this.dateOfRent);
        System.out.println("DateOfReturn:"+ this.dateOfReturn);
       }
   }
}