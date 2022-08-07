package com.ayia.dsal.arraysjava;

public class Main {
    public static void main(String[] args) {

        demoHighArrayBinary();

    }

    private static void demoHighArrayBinary(){
        HighArray  arr = new HighArray(11);

        arr.insertOrdered(77);                     // insert 10 items
        arr.insertOrdered(99);
        arr.insertOrdered(44);
        arr.insertOrdered(55);
        arr.insertOrdered(22);
        arr.insertOrdered(88);
        arr.insertOrdered(11);
        arr.insertOrdered(0);
        arr.insertOrdered(66);
        arr.insertOrdered(33);

        arr.display();                              // display items

        int searchKey = 35;                         // search for item

        if(arr.findViaBinary(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.deleteViaBinary(0);                      // delete 3 items
       // arr.deleteViaBinary(55);
       // arr.deleteViaBinary(99);
        arr.display();                              // display items again

    }

    private static void demoHighArrayLinear(){
        HighArray  arr = new HighArray(11);

        arr.insert(77);                     // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();                              // display items

        int searchKey = 35;                         // search for item

        if(arr.findViaLinear(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.deleteViaLinear(0);                      // delete 3 items
        arr.deleteViaLinear(55);
        arr.deleteViaLinear(99);
        arr.display();                              // display items again

    }
    
    private void demoLowArrayProcedural(){
        int[] arr;                              //reference to array
        arr = new int[10];                      //create array to house 10 items
        int nItems;                             //number of items
        int j;                                  //loop counter
        int searchKey;                          //search key

        arr[0] = 77;                            //insert items
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;

        nItems = 10;                           // now 10 items in array

        for (j = 0; j<nItems; j++){             // display items
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");



        searchKey = 66;                                 // find items in  array
        for (j = 0; j<nItems; j++){
            if (arr[j] == searchKey)
                break;
        }
        if (j == nItems)                                        //item not found
            System.out.println("Can't find "+searchKey);
        else
            System.out.println("Found "+searchKey);             //found search key

        System.out.println(arr[j] + " ");

        searchKey = 55;                                         //delete item

        for (j = 0; j<nItems; j++){
            if (arr[j] == searchKey)
                break;
        }

        if (j == nItems)
            System.out.println("Cant find "+searchKey);
        else {

            for (int k = j; k<nItems; k++){
                arr[k] = arr[k+1];
            }
            nItems--;

            for (j = 0; j<nItems; j++){
                System.out.print(arr[j] + " ");
            }

        }


    }
}

