public class class1 {
    public static void main(String[] args) {
        System.out.println("HEllo World");
        int a=10,b=10,c;
        try{
            c=a/b;
            if(c==1)
            {
                throw new ArithmeticException();

            }
        }
        catch(Exception e )
        {
            System.out.println(e);
        }
    }
} 