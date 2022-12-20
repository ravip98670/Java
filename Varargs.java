class Varargs{
    
    static int sum(int ...arr)
    {
        int result=0;
        for(int a:arr){
            result =result+a;
        }
    
    return result;
    }
     public static void main(String[] args) {
         System.out.println("The sum of 12 and 5 is:"+sum(12,5));
         System.out.println("The sum of 12,4 and 5 is:"+sum(12,4,5));
         System.out.println("The sum of 12 ,2,7and 5 is:"+sum(12,2,7,5));
        
    }
}