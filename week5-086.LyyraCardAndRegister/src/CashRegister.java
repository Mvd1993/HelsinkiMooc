
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >=2.50){
        //    the price of lunch is added to register
            this.cashInRegister+=2.50;
        //    the amount of sold lunch is incremented by one
            this.economicalSold++;
        //    method returns cashGiven - lunch price
            return cashGiven-2.50;}
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
    	double price = 2.5;
        // if the balance of the card is at least the price of the lunch:
    	if (price <= card.balance()) {
    		//    the amount of sold lunches is incremented by one
            //    the method returns true
    		card.extractMoney(price);
    		economicalSold += 1 ;
    		return true;
    	}
        return false;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >=4.0){
        //    the price of lunch is added to register
            this.cashInRegister+=4.0;
        //    the amount of sold lunch is incremented by one
        this.gourmetSold++;
        //    method returns cashGiven - lunch price
        return cashGiven-4.0;}
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
    	double price = 4.0;
        // if the balance of the card is at least the price of the lunch:
    	if (price <= card.balance()) {
    		//    the amount of sold lunches is incremented by one
            //    the method returns true
    		card.extractMoney(price);
    		gourmetSold += 1 ;
    		return true;
    	}
       
        // if not, the method returns false
    	return false;
   
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
    	if (sum >= 0) {   
    		card.loadMoney(sum);
    		cashInRegister += sum;
    	}
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
