public class Fibo{  //0,1,1,2,3,5,8,13,21,34,55,89
 public static void main(String ar [])
  {
   Fibo obj=new Fibo();
   obj.Fibonacci();
   obj.Fibonacci_1();
   obj.Withouttemp(0,1,10,0);
   obj.Withouttemp(0,1,10,1);
}
public void Fibonacci()
 {
  int first=0;
  int second=1;
  int n=10;
  int sum=0;

for(int i=1; i<=10; i++){
   
    sum=first+second;
    first=second;
    second=sum;
    
}//for
System.out.println(sum);
}//method
//op:89

public void Fibonacci_1()
{
 int first=0;
 int second=1;
 int n=10;
 int i=1;
 int sum=0;
while(i<=n){

sum=first+second;
first=second;
second=sum;

i++;
}//method
System.out.println(sum);
}//while
//exop:89

public void Withouttemp(int first, int second, int n, int sum)
{
 for(int i=1; i<=n; i++){
   second=first+second;
   first=second-first;

}//for
System.out.println(second);
}//method
//exop:89

public void Withouttemp_1(int first, int second, int n, int i)
{
 while(i<=n){
  second=first+second;
  first=second-first;
i++;
}//for
System.out.println(second);
}//method
}//class
//exop:89
