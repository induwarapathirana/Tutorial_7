
class account(bal: Float, n: String){
    val name = n;
    var balance: Float= bal;

    def check_balance()={
        println(s"Current balance of ${this.name}= ${this.balance}");
    }
    def transfer(amnt: Int, accnt: account)={
        if (balance - amnt < 0){
            println("Not enough balance ");
        }else{
            this.balance = this.bal - amnt;
            accnt.balance = accnt.balance + amnt;
            println("transfer successful");
        }
    }
}

object Q3{
    def main(args: Array[String])={
        var acc1 = new account(6000,"u1");
        var acc2 = new account(5000,"u2");
        acc1.check_balance();
        acc2.check_balance();

        acc1.transfer(2000,acc2);

        acc1.check_balance();
        acc2.check_balance();
    }
}