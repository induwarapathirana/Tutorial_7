def GCD(a:Int,b:Int):Int=a match{
    case 0 => b
    case _=> GCD (b%a,a)
}

class Rational(num: Int, den: Int){
    var n= num;
    var d= den;
}

def sub(r1: Rational, r2: Rational):Rational={
    var d = r1.d * r2.d;
    var n = r1.n*r2.d - r2.n*r1.d;
    val r3 = new Rational(n,d);

    return r3; 
}

object Q2{
    def main(args: Array[String])={
        val r1 = new Rational(3,4);
        val r2 = new Rational(5,8);
        val r3 = new Rational(2,7);
        val res = sub(sub(r1,r2),r3);
        println(s"Value of ${r1.n}/${r1.d} - ${r2.n}/${r2.d} - ${r3.n}/${r3.d} = ${res.n}/${res.d}");
    }
}