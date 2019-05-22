/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
 class TicketMachine
{
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        this(1000);
    }
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        total = 0;
        balance = 0;
    }
   
   
    /**
     * Empty machine
     * */
    public void empty()
    {
        total = (balance - balance);
        balance = total;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        
        //Update balance
        balance = balance - price;
        // Clear the balance.
        //balance = 0;
    }
    /**
     * Get total
     * 
 
     */
    public void getTotal()
    {
        System.out.print(total);
    
    
    
    }
    /**
     * Prompt the customer to insert the correct amount of money
     * */
     public void prompt()
     {
        System.out.println("Please insert the correct amount of money.");
        }
    /*public void prompt()
    {
        int diff = (price - balance);
            
      
                if (balance < price && diff < 0){
            
                    System.out.println("Please insert " + diff + "!");
                }
                else { 
                    System.out.println("Thank you. Enjoy your trip!");}
       
        
        } */
        
    /**
     * Tell customer the ticket price
     * */
    public void showPrice()
    {
        System.out.println(price + " cents");}
    
    /**
     * Tell customer the ticket price
     * */
    public void setPrice(int ticketCost)
    {
       price = ticketCost; 
    
    }
}
    
