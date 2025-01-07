


class Parent{


       void fun(){

                System.out.println("in parent fun");
        }

}

class Child extends Parent{

      public  void fun(){


                System.out.println("in child fun");
        }


}


class Client{


        public static void main(String[] args){


                Parent obj=new Child();
                obj.fun();

        }


}
