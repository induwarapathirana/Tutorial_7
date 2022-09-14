import java.io._

class Rational(num: Int, den: Int){
    var n= num;
    var d= den;
    def neg()={
        n= -1 * n;
        print(s"${n}/${d}");
    }
}

object Q1{
    def main(args: Array[String])={
        val r= new Rational(2,5);
        print(s"Negative value of ${r.n}/${r.d} = ");
        r.neg();
    }
}