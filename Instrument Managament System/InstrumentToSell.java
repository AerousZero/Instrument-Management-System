
/**
 * InstrumentToSell has 4 instance variable
 * Constructor having tow parameter is created
 * @author (Srijan Shakya)
 * @version (21049600, 17.0.1)
 */
public class InstrumentToSell extends Instrument
{
    /*instance variable have been created
     * price and discountPercent have float as datatype
     * sellDate has String as datatype
     * isSold has boolean as datatype
     */
    private float price, discountPercent;
    private String sellDate;
    private boolean isSold;
    //constructor is called for object creation
    public InstrumentToSell( String instrumentName, float price)
    {
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0.0f;
        this.isSold = false;
    }
    //Setter method for assigning value
    public void setPrice( float price)
    {
        if( isSold = false)
        {
            this.price = price;
        }
        else
        {
            System.out.println("Already sold. Not possible to change price.");
        }
    }
    //Setter Method or Mutator Method
    public void setSellDate( String sellDate)
    {
        this.sellDate = sellDate;
    }
    //Mutator Method
    public void setDiscountPercent( float discountPercent)
    {
        this.discountPercent = discountPercent;
    }
    //Mutator method
    public void setIsSold( boolean isSold)
    {
        this.isSold = isSold;
    }
    //Getter Method or accessor method
    public float getPrice()
    {
        return this.price;
    }
    //accessor method
    public String getSellDate()
    {
        return this.sellDate;
    }
    //accessor method 
    public float getDiscountPercent()
    {
        return this.discountPercent;
    }
    //accessor method
    public boolean getIsSold()
    {
        return this.isSold;
    }
    //Method to sell the instrument 
    public void InstrumentSell( String customerName, String customerMobileNumber, long customerPAN, String sellDate, float discountPercent)
    {
        if(isSold == true)
        {
            System.out.println("The item has already been sold");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Phone Number: " + customerMobileNumber);
            System.out.println("Customer Pan: " + customerPAN);
        }
        else
        {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
            float finalPrice = price - (discountPercent/100 * price);
            
            System.out.println("CustomerName:" + customerName);
            System.out.println("CustomerPhoneNumber:" + customerMobileNumber);
            System.out.println("CustomerPan:" + customerPAN);
            System.out.println("SellDate:" + sellDate);
            System.out.println("Discount percentage:" + discountPercent);
            System.out.println("FinalPrice:" + finalPrice);
        }
    }
    //Method to Display output
    public void display()
    {
        super.display();
        System.out.println("Price: " + this.price);
        if(isSold == true)
        {
            System.out.println("Customer Name: " + getCustomerName());
            System.out.println("Customer Phone Number: " + getCustomerMobileNumber());
            System.out.println("Customer PAN: " + getCustomerPAN());
            System.out.println("Sell Date: " + sellDate);
        }
        
    }
}
