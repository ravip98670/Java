import org.omg.CORBA.PUBLIC_MEMBER;

class Swap {
        public static void main(String ...s)
        {
            int a=10,b=15,c;
            System.out.println("The value of before swap a="+a+",b="+b);
            c=a;
            a=b;
            b=c;
            System.out.println("The value of before swap a="+a+",b="+b);
        }
}
