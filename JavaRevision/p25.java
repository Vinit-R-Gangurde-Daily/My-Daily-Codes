
//Selection Sort

//using the regular method 

// class SelectionSortDemo{

//     public static void main(String[] args) {
        
//         int arr[]=new int[]{32,22,43,-56,76,23,0};

        
//         for(int i=0;i<arr.length;i++){

//             int minIndex=i;
//             for(int j=i+1;j<arr.length;j++){

//                 if(arr[j]<arr[minIndex]){

//                      minIndex=j;
//                 }

//             }
//             int temp=arr[minIndex];
//             arr[minIndex]=arr[i];
//             arr[i]=temp;
//         }

//         for(int x:arr){
//             System.out.print(x + " ");
//         }

//     }
// }


//Selection Sort using the recurtion

class selectionSortDemo{

    int temp1=0;
    int mindx=temp1;
    int temp2=temp1+1;
    void SelectionMeth(int arr[],int len){

        if(temp1>=arr.length-1 || temp2>=arr.length-1){
            return;
        }

        if(arr[temp2]<arr[mindx]){
            mindx=temp2;
        }

        SelectionMeth(arr, temp2+1);

            int temp=arr[mindx];
            arr[mindx]=arr[temp1];
            arr[temp1]=temp;

            mindx=temp1+1;
            temp2=temp1+2;
            

            SelectionMeth(arr, temp1=+1);


    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{4,0,2,1};

      selectionSortDemo obj1=new selectionSortDemo();

      obj1.SelectionMeth(arr, 1);

      for(int x:arr){
        System.out.print(x);
      }

    }

}

