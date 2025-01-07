
class Demo3{

    int fun(int num){

        if(num==0)
              return 1;

        return 5+fun(--num);

    }    

    public static void main(String[] args){

        Demo obj=new Demo();
         obj.fun(3);

    }

}
