/**
 * @author (Srijan Shakya)
 * @version (21049600, 17.0.1)
 */
/**
 * differentiate each panel with the help of color(simple gradient color)
 * color should be pastel or less saturated and easy on the eyes
 * .setBackground for background color
 * .getContentPane.setBackground
 */ 
/**
 * adding element to frame 1 and 2
 * Frame 1 has panel 1 and 2
 * panel 1 has instrument info and add to rent and return button
 * panel 2 has customer info and dispaly, clear and rent instrument button
 * 
 * Frame 2 has Panel 3 and 4
 * panel 3 has instrument info and add to sell button
 * panel 4 has customer info and display, clear and sell instrument button
 */
//importing different inbuilt java package 
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//class creation
public class SarangiSansar implements ActionListener
{
    Font ft1= new Font("Arial",Font.BOLD,18);
    Font ft2= new Font("Arial",Font.BOLD,16);
    Font ft3= new Font("Arial",Font.BOLD,14);
    //creating instance variables
    //for jframe
    public JFrame jf0, jf1, jf2;
    //for jpanel
    public JPanel jp1, jp2, jp3, jp4, jp5;
    //for jlabel
    public JLabel lb00, lb01, lb02, lb0, lb1, lb2, lbIF1, lbIF2, lbIN1, lbIN2, lbIN3, lbIN4, lbIN5, lbCPD, lbP,  lbCN1, lbCP1, lbCN2, lbCP2, lbCPN1, lbCPN2, lbNOD, lbRD, lbRTND, lbDP, lbSD;
    //for jtextfield
    public JTextField tfIN1, tfIN2, tfIN3, tfIN4, tfIN5, tfCPD, tfCN1, tfCP1, tfCPN1, tfNOD, tfP, tfCN2, tfCP2, tfCPN2, tfDP;
    //forjbutton
    public JButton jbSELL, jbRENT, jbATRNT, jbATSEL, jbRNTI, jbSELI, jbRTNI, jbDISP1, jbCLR1, jbDISP2, jbCLR2, jbBTSS1, jbBTSS2;
    //forjcombobox
    public JComboBox<String> cbSELDT,cbSELMT, cbSELY, cbRNTDT, cbRNTMT, cbRNTY, cbRTNDT, cbRTNMT, cbRTNY;
    //array list is created here
    ArrayList<Instrument>ALST = new ArrayList<Instrument>();
    // Creating constructor for GUI of SarangiSansar
    public SarangiSansar()
    {
        /**
        //jframe is created to add all the elements
         */
        jf0 = new JFrame("SarangiSansar");
        //Introduction of SarangiSangar
        lb0 = new JLabel("Sarangi Sansar");
        lb00 = new JLabel("Welcome to SarangiSansar");
        lb01 = new JLabel("The global hub for Renting And Selling all types of Playable Instrument.");
        lb02 = new JLabel("We are proud to present you our vast collection of musical instruments.");

        lb0.setFont(ft1);
        lb00.setFont(ft2);
        lb01.setFont(ft2);
        lb02.setFont(ft2);

        //jbutton for rent on frame 0 
        jbRENT = new JButton("Rent Instrument");
        jbRENT.setBackground(Color.decode("#a8e5df"));
        jbRENT.setFont(ft3);
        //jbutton for sell on frame 0
        jbSELL = new JButton("Sell Instrument");
        jbSELL.setBackground(Color.decode("#a8e5df"));
        jbSELL.setFont(ft3);

        //background color for frame 0
        jf0.getContentPane().setBackground(Color.decode("#21ab9e"));
        //Layout manager is deactivated
        jf0.setLayout(null);
        //sets the frame to visible
        jf0.setVisible(true);
        //sets the boundary of frame 0
        jf0.setBounds(430,150,650,500);
        //sets frame to non sizable
        jf0.setResizable(false);

        //adding element to Frame 0
        //adding introduction heading
        jf0.add(lb00);
        jf0.add(lb01);
        jf0.add(lb02);
        jf0.add(lb0);
        //adding buttons on frame 0
        jf0.add(jbRENT);
        jf0.add(jbSELL);

        //setting boundries for different element
        //on frame 0
        lb00.setBounds(220,40,300,200);
        lb01.setBounds(59,60,550,200);
        lb02.setBounds(59,80,550,200);
        lb0.setBounds(250,20,150,50);
        //boundary for button
        jbRENT.setBounds(40,300,250,100);
        jbSELL.setBounds(340,300,250,100);
        //event handling
        jbRENT.addActionListener(this);
        jbSELL.addActionListener(this);
    }

    public void RentInstrument()
    {
        /**
        //jframe 1 is created which has information about instrument to rent
         */
        jf1 = new JFrame("Instrument For Rent");

        //jpanel is created on the jframe 1 that has instrument name and charge
        jp1 = new JPanel();

        //Top Heading
        lb1 = new JLabel("Instrument Info");
        lb1.setFont(ft1);
        //label and textfield for instrument name
        lbIN1 = new JLabel("Instrument Name:");
        tfIN1 = new JTextField();

        //label and textfield for charge of instrument
        lbCPD = new JLabel("Charge per Day:");
        tfCPD = new JTextField();

        //button creation
        //button for add to rent
        jbATRNT = new JButton("Add to Rent");
        jbATRNT.setBackground(Color.decode("#a8e5df"));
        jbATRNT.setFont(ft3);

        //Layout manager is deactivated
        jp1.setLayout(null);
        //sets the frame to visible
        jp1.setVisible(true);
        //sets the boundary of panel 1
        jp1.setBounds(50,15,800,150);
        //background color
        jp1.setBackground(Color.decode("#25beb0"));

        //jpanel is created on the jframe 1 that has instrument name and return button
        jp2 = new JPanel();

        //label and textfield for instrument name
        lbIN2 = new JLabel("Instrument Name:");
        tfIN2 = new JTextField();

        //button for returning the instrument
        jbRTNI = new JButton("Return Instrument");
        jbRTNI.setBackground(Color.decode("#a8e5df"));
        jbRTNI.setFont(ft3);

        //Layout manager is deactivated
        jp2.setLayout(null);
        //sets the frame to visible
        jp2.setVisible(true);
        //sets the boundary of panel 1
        jp2.setBounds(50,175,800,105);
        //Background color for panel 1
        jp2.setBackground(Color.decode("#21ab9e"));

        //jpanel is created on the jframe 1 that has customer information
        jp3 = new JPanel();

        //top heading for panel 2
        lbIF1 = new JLabel("Register Info");
        lbIF1.setFont(ft1);

        //label and textfield for instrument name
        lbIN3 = new JLabel("Instrument Name:");
        tfIN3 = new JTextField();

        //label and text for customer name
        lbCN1 = new JLabel("Customer Name:");
        tfCN1 = new JTextField();
        //label and text for customer phone
        lbCP1 = new JLabel("Customer Phone:");
        tfCP1 = new JTextField();
        //label and text for customer pan number
        lbCPN1 = new JLabel("Customer PAN:");
        tfCPN1 = new JTextField();

        //label for rent date combobox
        lbRD = new JLabel("Rent Date:");

        //combobox creation for rent date
        String RentDate[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        cbRNTDT = new JComboBox<String>(RentDate);
        String RentMonth[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        cbRNTMT = new JComboBox<String>(RentMonth);
        String RentYear[] = {"2018","2019","2020","2021","2022","2023","2024","2025"};
        cbRNTY = new JComboBox<String>(RentYear);

        //label and text for no of days
        lbNOD = new JLabel("No of Days:");
        tfNOD = new JTextField();

        //label for return date
        lbRTND = new JLabel("Return Date:");

        //combobox creation for return date
        String ReturnDate[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        cbRTNDT = new JComboBox<String>(ReturnDate);
        String ReturnMonth[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        cbRTNMT = new JComboBox<String>(ReturnMonth);
        String ReturnYear[] = {"2018","2019","2020","2021","2022","2023","2024","2025"};
        cbRTNY = new JComboBox<String>(ReturnYear);

        //button creation
        //display button creation which displays instrument name and charge/day (message)
        jbDISP1 = new JButton("Display Info");
        jbDISP1.setBackground(Color.decode("#a8e5df"));
        jbDISP1.setFont(ft3);
        //Rent button
        jbRNTI = new JButton("Rent Instrument");
        jbRNTI.setBackground(Color.decode("#a8e5df"));
        jbRNTI.setFont(ft3);
        //Clear button to remove all information
        jbCLR1 = new JButton("Clear Info");
        jbCLR1.setBackground(Color.decode("#a8e5df"));
        jbCLR1.setFont(ft3);

        //Layout manager is deactivated
        jp3.setLayout(null);
        //sets the frame to visible
        jp3.setVisible(true);
        //sets the boundary of panel 2
        jp3.setBounds(50, 290, 800, 440);
        //Background color for panel 2
        jp3.setBackground(Color.decode("#21ab9e"));

        //Takes back to home page on click
        jbBTSS1 = new JButton("Back to SarangiSansar");
        jbBTSS1.setBackground(Color.decode("#a8e5df"));
        jbBTSS1.setFont(ft3);

        //Layout manager is deactivated
        jf1.setLayout(null);
        //sets the frame to visible
        jf1.setVisible(true);
        //sets the boundary of frame 1
        jf1.setBounds(300,10,900,830);
        //sets to non sizable
        jf1.setResizable(false);
        //background color
        jf1.getContentPane().setBackground(Color.decode("#16726a"));

        //adding element to frame 1
        // adding panel 1 and 2 
        jf1.add(jp1);
        jf1.add(jp2);
        jf1.add(jp3);

        //adding a back button
        jf1.add(jbBTSS1);

        //adding element to panel 0 of frame 1
        jp1.add(lb1);
        //adding label and text for Iname
        jp1.add(lbIN1);
        jp1.add(tfIN1);
        //adding label and text for Charge per day
        jp1.add(lbCPD);
        jp1.add(tfCPD);
        //adding button on panel 0
        jp1.add(jbATRNT);

        //adding Instrument name and textfield
        jp2.add(lbIN2);
        jp2.add(tfIN2);
        //adding button on panel 1
        jp2.add(jbRTNI);

        //adding element to panel 2 of frame 1
        jp3.add(lbIF1);
        //adding label and text for Iname
        jp3.add(lbIN3);
        jp3.add(tfIN3);
        //adding label and text for Cname
        jp3.add(lbCN1);
        jp3.add(tfCN1);
        //adding label and text for Cphone
        jp3.add(lbCP1);
        jp3.add(tfCP1);
        //adding label and text for CPAN
        jp3.add(lbCPN1);
        jp3.add(tfCPN1);
        
        //adding label and text for no of days
        jp3.add(lbNOD);
        jp3.add(tfNOD);
        
        //adding label and comboboxes for rent date
        jp3.add(lbRD);
        jp3.add(cbRNTDT);
        jp3.add(cbRNTMT);
        jp3.add(cbRNTY);

        //adding label and comboboxes for return date
        jp3.add(lbRTND);
        jp3.add(cbRTNDT);
        jp3.add(cbRTNMT);
        jp3.add(cbRTNY);

        //adding buttons on panel 2
        jp3.add(jbDISP1);
        jp3.add(jbRNTI);
        jp3.add(jbCLR1);   

        //setting boundaries on frame 1

        //on panel 1
        lb1.setBounds(350,5,180,40);
        lbIN1.setBounds(80,50,130,30);
        tfIN1.setBounds(220,50,190,30);
        lbCPD.setBounds(80,100,130,30);
        tfCPD.setBounds(220,100,190,30);
        jbATRNT.setBounds(570,60,170,50);

        //on panel 2
        lbIN2.setBounds(80,35,130,30);
        tfIN2.setBounds(220,35,190,30);
        jbRTNI.setBounds(570,25,170,50);

        //on panel 3
        lbIF1.setBounds(350,15,180,40);
        lbIN3.setBounds(430,70,130,30);
        tfIN3.setBounds(550,70,190,30);
        lbCN1.setBounds(80,70,130,30);
        tfCN1.setBounds(220,70,190,30);
        lbCP1.setBounds(80,120,130,30);
        tfCP1.setBounds(220,120,190,30);
        lbCPN1.setBounds(80,170,130,30);
        tfCPN1.setBounds(220,170,190,30);

        lbNOD.setBounds(80,220,130,30);
        tfNOD.setBounds(220,220,190,30);

        lbRD.setBounds(80,270,130,30);
        cbRNTDT.setBounds(220,270,75,30);
        cbRNTMT.setBounds(300,270,75,30);
        cbRNTY.setBounds(380,270,75,30);

        lbRTND.setBounds(80,310,130,30);
        cbRTNDT.setBounds(220,310,75,30);
        cbRTNMT.setBounds(300,310,75,30);
        cbRTNY.setBounds(380,310,75,30);

        jbRNTI.setBounds(570,190,150,75);
        jbDISP1.setBounds(630,360,150,50);
        jbCLR1.setBounds(460,360,150,50);

        jbBTSS1.setBounds(50,737,200,50);

        //Event handling
        jbBTSS1.addActionListener(this);
        jbATRNT.addActionListener(this);
        jbRTNI.addActionListener(this);
        jbRNTI.addActionListener(this);
        jbDISP1.addActionListener(this);
        jbCLR1.addActionListener(this);
    }

    public void SellInstrument()
    {
        /**
         * jframe is created which has information about instrument to sell
         */
        jf2 = new JFrame("Instrument For Sell");

        //jpanel is created on the jframe 2, it has instrument name and price
        jp4 = new JPanel();

        //Top Heading
        lb2 = new JLabel("Instrument Info");
        lb2.setFont(ft1);

        //label and textfield for instrument name
        lbIN4 = new JLabel("Instrument Name:");
        tfIN4 = new JTextField();

        //label and textfield for price of instrument
        lbP = new JLabel("Price:");
        tfP = new JTextField();

        //button creation 
        //button for add to sell
        jbATSEL = new JButton("Add to Sell");
        jbATSEL.setBackground(Color.decode("#a8e5df"));
        jbATSEL.setFont(ft3);

        //Layout manager is deactivated
        jp4.setLayout(null);
        //sets the frame to visible
        jp4.setVisible(true);
        //sets the boundary of panel 1
        jp4.setBounds(50,25,800,250);
        //
        jp4.setBackground(Color.decode("#25beb0"));

        //jpanel is created on the jframe 2, It has customer info
        jp5 = new JPanel();
        //Top Heading for panel 4
        lbIF2 = new JLabel("Register Info");
        lbIF2.setFont(ft1);
        //label and textfield for instrument name
        lbIN5 = new JLabel("Instrument Name:");
        tfIN5 = new JTextField();

        //label and text for customer name
        lbCN2 = new JLabel("Customer Name:");
        tfCN2 = new JTextField();

        //label and text for customer phone
        lbCP2 = new JLabel("Customer phone:");
        tfCP2 = new JTextField();

        //label and text for customer pan number
        lbCPN2 = new JLabel("Customer PAN:");
        tfCPN2 = new JTextField();

        //label and text for discount percentage
        lbDP = new JLabel("Discount %:");
        tfDP = new  JTextField();

        //label for selling date combobox
        lbSD = new JLabel("Selling Date:");

        //combobox creation for selling date
        String SellDate[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        cbSELDT = new JComboBox<String>(SellDate);
        String SellMonth[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        cbSELMT = new JComboBox<String>(SellMonth);
        String SellYear[] = {"2018","2019","2020","2021","2022","2023","2024","2025"};
        cbSELY = new JComboBox<String>(SellYear);

        //button creation 
        //display information button
        jbDISP2 = new JButton("Display Info");
        jbDISP2.setBackground(Color.decode("#a8e5df"));
        jbDISP2.setFont(ft3);
        //clear information button to remove all info
        jbCLR2 = new JButton("Clear Info");
        jbCLR2.setBackground(Color.decode("#a8e5df"));
        jbCLR2.setFont(ft3);
        //Sell Instrument button
        jbSELI = new JButton("Sell Instrument");
        jbSELI.setBackground(Color.decode("#a8e5df"));
        jbSELI.setFont(ft3);

        //Layout manager is deactivated
        jp5.setLayout(null);
        //sets the frame to visible
        jp5.setVisible(true);
        //sets the boundary of panel 2
        jp5.setBounds(50, 290, 800, 440);
        //backgrounds
        jp5.setBackground(Color.decode("#21ab9e"));

        //Takes back to home page on click
        jbBTSS2 = new JButton("Back to SarangiSansar");
        jbBTSS2.setBackground(Color.decode("#a8e5df"));
        jbBTSS2.setFont(ft3);

        //Layout manager is deactivated
        jf2.setLayout(null);
        //sets the frame to visible
        jf2.setVisible(true);
        //sets the boundary of frame 2
        jf2.setBounds(300,10,900,830);
        //sets to non sizable
        jf2.setResizable(false);
        //setting background color
        jf2.getContentPane().setBackground(Color.decode("#16726a"));

        //adding element to frame 2
        jf2.add(jp4);
        jf2.add(jp5);
        //back to home button
        jf2.add(jbBTSS2);

        //adding elemnt to panel 3
        jp4.add(lb2);
        //adding label and text of instrument name
        jp4.add(lbIN4);
        jp4.add(tfIN4);
        //adding label and text for price
        jp4.add(lbP);
        jp4.add(tfP);
        //adding add to sell button 
        jp4.add(jbATSEL);

        //adding element to panel 4 on frame 2
        jp5.add(lbIF2);
        //adding label and text of instrument name
        jp5.add(lbIN5);
        jp5.add(tfIN5);
        //adding label and text for Cname
        jp5.add(lbCN2);
        jp5.add(tfCN2);
        //adding label and text for Cphone
        jp5.add(lbCP2);
        jp5.add(tfCP2);
        //adding label and text for Cpan number
        jp5.add(lbCPN2);
        jp5.add(tfCPN2);
        //adding label and text for Discount percentage
        jp5.add(lbDP);
        jp5.add(tfDP);
        //label for selling date
        jp5.add(lbSD);
        //adding label and comboboxes for selling date
        jp5.add(cbSELDT);
        jp5.add(cbSELMT);
        jp5.add(cbSELY);

        //button creation
        //display button 
        jp5.add(jbDISP2);
        //Clear button to remove info
        jp5.add(jbCLR2);
        //sell button 
        jp5.add(jbSELI);

        //setting boundaries
        //on frame 2
        jbBTSS2.setBounds(50, 737, 200, 50);
        //on panel 3
        lb2.setBounds(350,20,180,40);
        lbIN4.setBounds(80,90,130,30);
        tfIN4.setBounds(220,90,190,30);
        lbP.setBounds(80,180,130,30);
        tfP.setBounds(220,180,190,30);
        jbATSEL.setBounds(570,125,170,50);

        //on panel 4
        lbIF2.setBounds(350,15,180,40);
        lbIN5.setBounds(430,70,130,30);
        tfIN5.setBounds(550,70,190,30);
        lbCN2.setBounds(80,70,130,30);
        tfCN2.setBounds(220,70,190,30);
        lbCP2.setBounds(80,120,130,30);
        tfCP2.setBounds(220,120,190,30);
        lbCPN2.setBounds(80,170,130,30);
        tfCPN2.setBounds(220,170,190,30);
        lbDP.setBounds(80,220,130,30);
        tfDP.setBounds(220,220,190,30);

        lbSD.setBounds(80,270,130,30);
        cbSELDT.setBounds(220,270,75,30);
        cbSELMT.setBounds(300,270,75,30);
        cbSELY.setBounds(380,270,75,30);

        jbSELI.setBounds(560,200,150,75);
        jbCLR2.setBounds(460,360,150,50);
        jbDISP2.setBounds(630,360,150,50);

        //Event handling
        jbBTSS2.addActionListener(this);
        jbATSEL.addActionListener(this);
        jbSELI.addActionListener(this);
        jbDISP2.addActionListener(this);
        jbCLR2.addActionListener(this);
    }
     
    //Creating main method
    public static void main(String[] args)
    {
        new SarangiSansar();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbRENT)
        {
            RentInstrument();
            jf0.setVisible(false);
        }    
        else if (ae.getSource()==jbSELL)  
        {  
            SellInstrument();
            jf0.setVisible(false);
        }
        else if (ae.getSource() == jbBTSS1)
        {
            new SarangiSansar();
            jf1.setVisible(false);
        }
        else if (ae.getSource() == jbBTSS2)
        {
            new SarangiSansar();
            jf2.setVisible(false);
        }
        else if (ae.getSource() == jbATRNT)
        {
            boolean repeat = false;
            //instance variable boolen is created
            /*
             * text field is checked here
             *if condition checks for empty text field 
             *when textfield are filled than it moves to else condition 
             */
            if(tfIN1.getText().equals("") || tfCPD.getText().equals(""))
            {
                //checks if textfield are equal or not
                JOptionPane.showMessageDialog(jf1, "Field found empty, Related fields are required to be filled!!!","Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //try catch method is used for exception handling
                try
                {
                    //try is used for initilizing blocks of code which in turn is tested for any error with in the code
                    String gtIN1 = tfIN1.getText();// instrument name is fetched 
                    if(ALST.size()>0)
                    {
                        //when instrument is added to arraylist and arraylist size is greater than 0, if loop is initilized(works when added to arraylist if not goes to else)
                        for(Instrument INS: ALST)
                        {
                            /*for each loop traverses the arraylist 
                             * Instrument class has INS (ref variable) in ALST arraylist
                             */
                            if(INS.getInstrumentName().equals(gtIN1))
                            {
                                /*if conditon has INS ref variable from Instrument class
                                 * INS calls getInstrumentName() from Instrument class
                                 * and checks If two same Instrument name is present or not in arraylist
                                 */
                                //repeat = true as two same instrument are present in the arraylist
                                repeat = true;
                            }
                        }
                    }
                    if(repeat == true && ALST.size()>0)
                    {
                        //when same instrument is called for renting, following dialog pops up
                        JOptionPane.showMessageDialog(jf1,"Instrument has already been decided to rent, Please!!! apply for other instrument","Duplication Error", JOptionPane.ERROR_MESSAGE); 
                    }
                    else
                    {
                        int gtCPD = Integer.parseInt(tfCPD.getText());
                        //String charge/day is datatype converted into integer datatype
                        InstrumentToRent objATRNT = new InstrumentToRent(gtIN1,gtCPD);
                        //objATRNt is ref Variable created in InstrumentToRent class which has InstrumentToRent()

                        ALST.add(objATRNT);
                        //objATRNT is added to the array list 

                        JOptionPane.showMessageDialog(jf1, "Instrument: " + gtIN1 + " is avalible to rent for " + "charge/day: " + gtCPD);
                        //when Instrument that is clear for renting is called, following dialog pops up
                    }
                }
                catch(NumberFormatException NFE1)
                {
                    /* catch is used for finding errors in blocks of code initilized in try
                     * when the exception is caught by catch 

                     * the exception is displayed in terminal */
                    System.out.println(NFE1);
                    JOptionPane.showMessageDialog(jf1, "The textfield doesn't match with the datatype,Please try again","Datatype Mismatched",JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception EX1)
                {
                    //When any other exception is present
                    JOptionPane.showMessageDialog(jf1, "An Exception is found","Exception",JOptionPane.ERROR_MESSAGE); 
                }
            }
        }

        else if (ae.getSource() == jbRTNI)
        {
            if(tfIN2.getText().equals(""))
            {
                //checks if textfield are equal or not
                JOptionPane.showMessageDialog(jf1, "Field found empty, Related fields are required to be filled!!!","Error", JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                String gtIN2 = tfIN2.getText();
                InstrumentToRent objRTNI ;
                boolean retrn = false;
                //retrn is a boolean datatype which has initial value false
                for(Instrument INS: ALST)
                {
                    /* for each loop traverses the arraylist 
                     * Instrument class has INS (ref variable) in ALST arraylist 
                     * ref variable of Instrument to rent objRTNI is initilized
                     */ 

                    if(INS instanceof InstrumentToRent)
                    {
                        //instanceof checks weather ins is reference variable of InstrumentToRent or not
                        if(INS.getInstrumentName().equals(gtIN2))
                        {
                            InstrumentToRent ITR = (InstrumentToRent)INS;
                            //Downcasting to access the method of InstrumentToRent class
                            retrn = true;
                            //when loop is accessed value of retrn becomes true
                            if(ITR.getIsRented() == true)
                            {
                                //ITR is ref variable of InstrumentToRent which calls IsRented by get method
                                objRTNI = (InstrumentToRent)INS;
                                objRTNI.instrumentReturn();
                                JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN2 +" has been returned successfully");
                            }
                            else
                            {
                                //When added instrument is returned but not rented
                                JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN2 +" has not been rented successfully to return","Return Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                if(retrn == false)
                {
                    //when K == 0, this loop is accessed
                    JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN2 +" is not available for return ","Non-Existent Instrument",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if (ae.getSource() == jbRNTI)
        {
            /**
             * when instrument not added to array list is to be rent?
             */
            //rent instrument button in frame InstrumentToRent 
            /*if condition checks for empty text fields 
             * moves to else when relative textfield is present to be not empty
             */
            if(tfIN3.getText().equals("") || tfCN1.getText().equals("") || tfCP1.getText().equals("") || tfCPN1.getText().equals("") || tfNOD.getText().equals(""))
            {
                //checks if textfield are equal or not
                JOptionPane.showMessageDialog(jf1, "Field found empty, Related fields are required to be filled!!!","Error", JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                //try catch method is used for exception handling
                int difins = 0;
                //difins is ref variable of int datatype which initial value 0
                try
                {
                    //try is used for initilizing blocks of code which in turn is tested for any error with in the code
                    /*
                     * getText() method is used to get value in text field
                     */
                    String gtIN1 = tfIN1.getText();
                    String gtIN3 = tfIN3.getText();
                    String gtCN1 = tfCN1.getText();
                    String gtCP1 = tfCP1.getText();

                    //String charge/day is datatype converted into long datatype
                    long gtCPN1 = Long.parseLong(tfCPN1.getText());
                    //String charge/day is datatype converted into long datatype
                    int gtNOD = Integer.parseInt(tfNOD.getText());

                    String gtRNTDT = cbRNTDT.getSelectedItem().toString();
                    String gtRNTMT = cbRNTMT.getSelectedItem().toString();
                    String gtRNTY = cbRNTY.getSelectedItem().toString();
                    String gtRD = gtRNTDT + gtRNTMT + gtRNTY;

                    String gtRTNDT = cbRNTDT.getSelectedItem().toString();
                    String gtRTNMT = cbRNTMT.getSelectedItem().toString();
                    String gtRTNY = cbRNTY.getSelectedItem().toString();
                    String gtRTND = gtRTNDT +  gtRTNMT + gtRTNY;

                    for(Instrument INS : ALST)
                    {
                        /*for each loop traverses the arraylist 
                         * Instrument class has INS as ref variable in ArrayList ALST 
                         */
                        if(INS instanceof InstrumentToRent)
                        {
                            /*if conditon has INS ref variable from Instrument class
                             * instanceof checks weather INS is an object of InstrumentToRent or not
                             * downcasting is done to access method in parent class by child class 
                             * INS is object of Instrument class which will be accessed by child(InstToRent) class
                             * here InstrumentToRent class  has ITR variable = (childclass) parents ref variable
                             */
                            InstrumentToRent ITR = (InstrumentToRent)INS; 
                            difins = 1;
                            //when this loop is accessed the value of difins changes to 1
                            if(ITR.getInstrumentName().equals(gtIN3))
                            {
                                /*if conditon has ITR ref variable from InstrumentToRent class
                                 * ITR calls getInstrumentName() from Instrument class
                                 * and checks If two same Instrument name is present in arraylist or not
                                 */
                                if(ITR.getIsRented() == false)
                                {
                                    //ITR is reference variable of InstrumentToRent which calls IsRented() method by getters method
                                    ITR.instrumentRent(gtCN1, gtCP1, gtCPN1, gtRTND, gtRD, gtNOD); 
                                    JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN3 +" has been rented successfully");
                                }
                                else
                                {   //when IsRented is true, Instrument is removed from renting
                                    JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN3 +" is not present to rent, Please!!! rent other instrument","Rent Error",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                    if(difins == 0)
                    {
                        JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN3 +" not in list","Non-Existent Instrument",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException NFE2)
                {
                    //when number format exception is found
                    System.out.println(NFE2);
                    JOptionPane.showMessageDialog(jf1, "The textfield doesn't match with the datatype,Please try again","Datatype Mismatched",JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception EX2)
                {
                    JOptionPane.showMessageDialog(jf1, "An Exception is found","Exception",JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        else if (ae.getSource() == jbDISP1)
        {
            //event handling in frame InstrumentToRent Display Button
            for(Instrument INS: ALST)
            {
                /* for each loop traverses the arraylist 
                 * Instrument class has INS (ref variable) in ALST arraylist 
                 * ref variable of Instrument to rent objRNTDSP is initilized
                 */ 
                InstrumentToRent objRNTDSP ;
                if(INS instanceof InstrumentToRent)
                {
                    ////instanceof checks weather ins is reference variable of InstrumentToRent or not
                    objRNTDSP = (InstrumentToRent)INS;
                    objRNTDSP.display();
                }
            }
        }
        else if (ae.getSource() == jbCLR1)
        {
            //event handling for clear button in Instrument to rent Frame
            tfIN1.setText("");
            tfIN2.setText("");
            tfIN3.setText("");
            tfCPD.setText("");
            tfCN1.setText("");
            tfCP1.setText("");
            tfNOD.setText("");
            tfCPN1.setText("");
            cbRNTDT.setSelectedItem("1");
            cbRNTMT.setSelectedItem("JAN");
            cbRNTY.setSelectedItem("2018");

            cbRTNDT.setSelectedItem("1");
            cbRTNMT.setSelectedItem("JAN");
            cbRTNY.setSelectedItem("2018");
        }
        else if (ae.getSource() == jbATSEL)
        {
            boolean repeat = true;
            //instance variable boolen is created

            /* text field is checked here
             *if condition checks for empty text field 
             *when textfield are filled than it moves to else condition */
            if(tfIN4.getText().equals("") || tfP.getText().equals(""))
            {
                JOptionPane.showMessageDialog(jf2, "Field found empty, Related fields are required to be filled!!!","Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //try catch method is used for exception handling
                try
                {
                    //try is used for initilizing blocks of code which in turn is tested for any error with in the code
                    String gtIN4 = tfIN4.getText();// instrument name is fetched 
                    if(ALST.size()>0)
                    {
                        //when instrument is added to arraylist and arraylist size is greater than 0, if loop is initilized(works when added to arraylist if not goes to else)
                        for(Instrument INS: ALST)
                        {
                            /*for each loop traverses the arraylist 
                             * Instrument class has INS (ref variable) in ALST arraylist
                             */
                            if(INS.getInstrumentName().equals(gtIN4))
                            {
                                /*if conditon has INS ref variable from Instrument class
                                 * INS calls InstrumentName by getters method from Instrument class
                                 * and checks If two same Instrument name is present or not in arraylist
                                 */
                                //repeat = false as two same instrument are not present in the arraylist
                                repeat = false;
                            }
                        }
                    }
                    float gtP = Float.parseFloat(tfP.getText());
                    //String price datatype is converted into float datatype
                    if(repeat==false && ALST.size()>0)
                    {
                        //when same instrument is called for selling, following dialog pops up
                        JOptionPane.showMessageDialog(jf2,"Instrument has already been added to selling list, Please!!! apply for other instrument","Duplication Error", JOptionPane.ERROR_MESSAGE); 
                    }
                    else
                    {
                        //when duplicate instrument is not added else loop initilizes
                        InstrumentToSell objATSEL = new InstrumentToSell(gtIN4,gtP);
                        //obj ref Variable is created in InstrumentToSell class which has InstrumentToSell()

                        ALST.add(objATSEL);
                        //objATSEL is added to the array list 

                        JOptionPane.showMessageDialog(jf2, "Instrument: " +gtIN4+ " is avalible to sell for " + "Price: " +gtP );
                        //when Instrument that is clear for renting is called, following dialog pops up
                    }
                }
                catch(NumberFormatException NFE3)
                {
                    /* catch is used for finding errors in blocks of code initilized in try
                     * when the exception is caught by catch 
                     * the exception is displayed in terminal */
                    System.out.println(NFE3);
                    JOptionPane.showMessageDialog(jf1, "The textfield doesn't match with the datatype,Please try again","Datatype Mismatched",JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception EX3)
                {
                    JOptionPane.showMessageDialog(jf1, "An Exception is found","Exception",JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        else if (ae.getSource() == jbSELI)
        {
            if(tfIN5.getText().equals("") || tfCN2.getText().equals("") || tfCP2.getText().equals("") || tfCPN2.getText().equals("") || tfDP.getText().equals(""))
            {
                JOptionPane.showMessageDialog(jf2, "Field found empty, Related fields are required to be filled!!!","Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //sell instrument button in frame InstrumentToRent 
                /*if condition checks for empty text fields 
                 * moves to else when relative textfield is present to be not empty
                 */
                //try catch method is used for exception handling
                int difsellins = 0;
                try
                {
                    //try is used for initilizing blocks of code which in turn is tested for any error with in the code
                    /*
                     * getText() method is used to get value in text field
                     * 
                     */
                    String gtIN5 = tfIN5.getText();
                    String gtCN2 = tfCN2.getText();
                    String gtCP2 = tfCP2.getText();

                    //String charge/day is datatype converted into long datatype
                    long gtCPN2 = Long.parseLong(tfCPN2.getText());
                    //String charge/day is datatype converted into long datatype
                    float gtDP = Float.parseFloat(tfDP.getText());

                    String gtSELDT = cbSELDT.getSelectedItem().toString();
                    String gtSELMT = cbSELMT.getSelectedItem().toString();
                    String gtSELY = cbSELY.getSelectedItem().toString();
                    String gtSD = gtSELDT + gtSELMT + gtSELY;

                    for(Instrument INS : ALST)
                    {
                        /*for each loop traverses the arraylist 
                         * Instrument class has INS as ref variable in ArrayList ALST
                         * 
                         */
                        if(INS instanceof InstrumentToSell)
                        {
                            /*if conditon has INS ref variable from Instrument class
                             * instanceof checks weather INS is an object of InstrumentToSell or not
                             * downcasting is done to access method in parent class by child class 
                             * INS is object of Instrument class which will be accessed by child(InstToSell) class
                             * here InstrumentToSell class  has ITR variable = (childclass) parents ref variable
                             */
                            InstrumentToSell ITS = (InstrumentToSell)INS; 
                            difsellins = 1;
                            if(ITS.getInstrumentName().equals(gtIN5))
                            {
                                if(ITS.getIsSold() == false)
                                {
                                    /*when Instrument is in arraylist but not stilled sold it, the message it pops up 
                                     * when sold following dialog box pops up
                                     */
                                    ITS.InstrumentSell(gtCN2, gtCP2, gtCPN2, gtSD, gtDP); 
                                    JOptionPane.showMessageDialog(jf2, "Instrument "+ gtIN5 +" has been sold successfully");
                                }
                                else
                                {   //when IsSold is true, Instrument is removed from selling
                                    JOptionPane.showMessageDialog(jf2, "Instrument "+ gtIN5 +" is not present for sale, Please!!! buy other instrument");
                                }
                            }
                        }
                    }
                    if(difsellins == 0)
                    {
                        JOptionPane.showMessageDialog(jf1, "Instrument "+ gtIN5 +" not in list","Non-Existent Instrument",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException NFE4)
                {
                    System.out.println(NFE4);
                    JOptionPane.showMessageDialog(jf1, "The textfield doesn't match with the datatype,Please try again","Datatype Mismatched",JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception EX4)
                {
                    JOptionPane.showMessageDialog(jf1, "An Exception is found","Exception",JOptionPane.ERROR_MESSAGE); 
                }
            } 
        }
        else if (ae.getSource() == jbDISP2)
        {
            //event handling in frame InstrumentToRent Display Button
            for(Instrument INS: ALST)
            {
                /* for each loop traverses the arraylist 
                 * Instrument class has INS (ref variable) in ALST arraylist 
                 * ref variable of Instrument to rent objRNTDSP is initilized
                 */ 
                InstrumentToSell objSELDSP ;
                if(INS instanceof InstrumentToSell)
                {
                    objSELDSP = (InstrumentToSell)INS;
                    objSELDSP.display();
                }
            }
        }
        else if (ae.getSource() == jbCLR2)
        {
            //event handling for clear button in Instrumnet to sell class
            tfIN4.setText("");
            tfIN5.setText("");
            tfP.setText("");
            tfCN2.setText("");
            tfCP2.setText("");
            tfDP.setText("");
            tfCPN2.setText("");
            cbSELDT.setSelectedItem("1");
            cbSELMT.setSelectedItem("JAN");
            cbSELY.setSelectedItem("2018");
            //("") creates empty textField when clear button is pressed
        }
    }
}
