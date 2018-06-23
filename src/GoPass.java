public class GoPass {

    int FARE = 75;
    private int balance;
    private boolean isSuspended;


    public GoPass(){
     balance = 0;
     isSuspended = false;
    }

    public void addValue(int amount){
        if (amount > 0){
            balance += amount;
            // balance = balance + amount;
        }
    }

    public int getBalance(){
        return balance;
    }

    public boolean isSuspended(){
         return isSuspended;
    }

    public void setSuspended(boolean status){
        isSuspended = status;
    }

    public boolean tapln(){
        if (isSuspended||balance<FARE){
            return false;
        }
        else{
            balance = balance - FARE;
            return true;
        }

    }






}
