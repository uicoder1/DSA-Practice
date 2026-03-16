public class Type_Promotion{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);
        System.out.println((int)(b));
        System.out.println((int)(a));
    }
}

//type promotion only works with expressions like a+b a-b
