class Demo{

       void fun(Object obj){

                System.out.println("in object method");

        }

        void fun(String str2){

                System.out.println("in string method");

        }

}

class Client{

        public static void main(String[] args){

                Demo obj=new Demo();

               obj.fun("vinit");
               obj.fun(new StringBuffer("vinit"));
              obj.fun(null);


        }

}
