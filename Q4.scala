class account(n: String, bal: Double){
    val name = n;
    var balance = bal;
}
class bank{
    var acc1 =  new account("u1",5000);
    var acc2 =  new account("u2",-600);
    var acc3 =  new account("u3",50);

    var acc_list= Array(acc1,acc2,acc3);

    def add_acc(acc: account)={
        acc_list :+ acc ;
    }
}

def neg_balance(b: bank)={
    println("Negative balance");
    println("Name      balance");
    for (i <- b.acc_list){
        if (i.balance <0) {
            println(s"${i.name}      ${i.balance}");
        }
    }
}

def sum(b: bank)={
    var tot:Double=0;
    for (i <- b.acc_list){
        tot=tot+i.balance;
    }
    println(s"Total balance is : ${tot}");
}

def interest(b:bank)={
    println("Name      balance");
    for (i <- b.acc_list){
        if (i.balance <0) {
            i.balance = i.balance - i.balance * 0.1;
            println(s"${i.name}      ${i.balance}");
        }else{
            i.balance = i.balance + i.balance * 0.5;
            println(s"${i.name}      ${i.balance}");
        }
    }
}

object Q4{
    def main(args: Array[String])={
        
        var ban = new bank();

        neg_balance(ban);
        sum(ban);
        interest(ban);
    }
}