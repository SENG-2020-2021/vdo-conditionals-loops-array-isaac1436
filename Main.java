import java.util.Arrays;

class Main {
  public static void main(String[] args) {

  // kindly use appropriate data types for your declaration
  //declare an array variable and assign the days of the month debtor defaulted,
  
  byte[] daysDefaulted = {1,5,9,12,13,30}; 


  // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them

  float amtPerDay=50000f;

  float amtPaid=1200000f;
  
  // declare all the variables needed for your calculations

  byte noOfDaysPaid;
  
  float amtLeft;

  float amount=0f;
  
  byte val1=1;

  byte val2=1;

  byte [] april = new byte[30];

  for (byte index = 1; index < 30 ; index++){
    april[index] = val1;
    val1++;
  }  
  
  // calculate and print total amount the debtor is to pay using for each loop
  
  for (float amt : april){

    amount+=amtPerDay;

    val1++;    
  }
  System.out.println("This is the report on the loan lent to ISAAC DESMOND NRUEM with matric no 19/1436");

  System.out.println("the total amount the debtor is to pay is $"+ amount);
  
  // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
  
  noOfDaysPaid=(byte)(amtPaid/amtPerDay);

  System.out.println("the debtor only paid for "+noOfDaysPaid+"days out of 30days");

  byte [] daysPaid = {2,3,4,6,7,8,10,11,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};

  System.out.println("the days paid for are the "+Arrays.toString(daysPaid));

  if(amtPaid%amtPerDay==0){
  
  System.out.println("there were no days where the debtor did not pay the complete amount for that day");

  }

  else {

    float amtNotPayedCompletely=amtPaid%amtPerDay;

    float amtNotPayedCompletely1=amtNotPayedCompletely/2;

    float amtNotPayedCompletely2=amtNotPayedCompletely/2;
    
    System.out.println("the debtor did not pay completely on the 10th and 11th and the amt left to pay for those days is $"+amtNotPayedCompletely1+" and $"+amtNotPayedCompletely2+" respectively");

  }

  // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   
  if(amtPaid<amount){

    amtLeft=amount-amtPaid;

    System.out.println("the amount left for the debtor to pay is $"+amtLeft);

  }
   
  else{

    System.out.println("the debtor has paid the loan off completely");

  }
   
  System.out.println("the days not paid for are the "+Arrays.toString(daysDefaulted));

  if(amtPaid>amount){

    float extra=amtPaid-amount;
  System.out.println("the debtor paid more than the amount specified so the bank owes the debtor $"+extra);
  
  }

  else{

    System.out.println("the debtor did not pay the bank in excess so the bank owes the debtor NOTHING");

  }

  if(amtPaid==amount){

    System.out.println("the debtor has paid the exact amt specified");

  }

  else{

    System.out.println("the debtor did not pay the exact amount specified and hence his collateral is now the property of the bank");

  }
  }
}