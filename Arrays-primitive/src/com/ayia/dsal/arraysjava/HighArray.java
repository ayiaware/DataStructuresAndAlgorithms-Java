package com.ayia.dsal.arraysjava;

public class HighArray {

    // demonstrates array class with high-level interface

    private long[] arr;                               // ref to array a

    private int nItems;                                     // number of data items

    public HighArray(int size) {                             // constructor
        arr = new long[size];                               // create the array
        nItems = 0;                                         // no items yet
    }

    public int findViaLinear(long searchKey) {                    // find specified value

        int i;

        for (i = 0; i < nItems; i++) {                       // for each element,
            if (arr[i] == searchKey)                        // found item?
                break;                                      // exit loop before end
        }

        if (i == nItems) // yes, can’t find it
            return -1;
        else
            return i;  // else no, found it

    }// end find()

    public int findViaBinary(long searchKey) {

        int lowerBound = 0;
        int upperBound = nItems - 1;
        int curIndex;

        while (true) {
            curIndex = (lowerBound + upperBound) / 2;

            if (arr[curIndex] == searchKey) {
                return curIndex;
            } else {
                if (lowerBound > upperBound)
                    return -1;
                else if (searchKey > curIndex)
                    lowerBound = curIndex + 1;
                else
                    upperBound = curIndex - 1;
            }

        }

    }

    public int size() {
        return nItems;
    }

    public void insert(long value) {                         // put element into array
        arr[nItems] = value;                                // insert it
        nItems++;                                           // increment size
    }

    public void insertOrdered(long value) // put element into array
    {
        int j;
        for (j = 0; j < nItems; j++) {         // find where it goes
            if (arr[j] > value)           // (linear search)
                break;
        }
        for (int k = nItems; k > j; k--) {       // move bigger ones up
            arr[k] = arr[k - 1];
        }
        arr[j] = value;                 // insert it
        nItems++;

        // increment size

    } // end insert()

    // Find position for new value in array if the current value is greater than value move that value up ad insert value
    // at that position. If we don't find where the current value is greater, it means ne value will be inserted at the
    // end of array i.e position nItem - 1 which is held in variable j
    // create a new block at the end of array so that new value will have space to be inserted this will be done by
    // setting k = nItems instead of nItems-1. the iteration should stop at the current position j. Which is where new
    // value will be inserted.

    public boolean deleteViaLinear(long searchKey) {

        int j = findViaLinear(searchKey);

        if (j == nItems) {                                   // can’t find it
            return false;
        } else {                                                // found it
            for (int i = j; i < nItems; i++)                    // move higher ones down
                arr[i] = arr[i + 1];
            nItems--;                                           // decrement size
            return true;
        }
    }

    public boolean deleteViaBinary(long searchKey) {

        int j = findViaBinary(searchKey);

        System.out.println(j);

        if (j == nItems) {                                   // can’t find it
            return false;
        } else {                                                // found it
            for (int i = j; i < nItems; i++)                    // move higher ones down
                arr[i] = arr[i + 1];
            nItems--;                                           // decrement size
            return true;
        }
    }


    public void display()                                           // displays array contents
    {
        for (int j = 0; j < nItems; j++)                         // for each element,
            System.out.print(arr[j] + " ");                      // display it
        System.out.println("");
    }

}
