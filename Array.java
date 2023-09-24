public class Array 
{
    void print(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //sum of all the elements of an array
    int sum(int arr[])
    {
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    //count the number of elements less than, greater than and equal to zero.
    void count(int arr[])
    {
        int pos=0 , neg=0 , zero=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] > 0)
            {
                pos++;
            }
            else if(arr[i] < 0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }

        System.out.println("Greater than zero "+pos+"\nLess than zero "+neg+"\nZero "+zero);
    }


    // return the positions of the pallindrome element in array.

    void pallindrome(int arr[])
    {
        int mod , rev , num;
        for(int i=0 ; i<arr.length ; i++)
        {
            num = arr[i];
            rev = 0;
            while(num>0)
            {
                mod = num % 10;
                rev = rev * 10 + mod;
                num = num / 10;
            }
            if(rev == arr[i])
            {
                System.out.println(i);
            }
        }
    }

    //sort first half of array in ascending order and second half of array in descending order.
    void sortHalf(int arr[])
    {
        int mid = arr.length / 2;
        int temp;
        // for(int i=0 ; i < mid ; i++)
        // {
        //     for(int j=i+1 ; j<mid ; j++)
        //     {
        //         if(arr[i] > arr[j])
        //         {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        // for(int i=mid ; i < arr.length; i++)
        // {
        //     for(int j=i+1 ; j<arr.length ; j++)
        //     {
        //         if(arr[j] > arr[i])
        //         {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        for(int i=0 ; i < arr.length ; i++)
        {
            //for first half
            for(int j=0 ; j<mid ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            //for second half
            for(int j=mid ; j<arr.length-1 ; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //copy the elements of one array into another array
    void copy(int arr[])
    {
        int n = arr.length;
        int copy[] = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            copy[i] = arr[i];
        }
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(copy[i]+" ");
        }
    }


    // sort only even numbers in given array.
    void sortEven(int arr[])
    {
        int temp;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2==0)
            {
                for(int j=i+1 ; j<arr.length ; j++)
                {
                    if(arr[j]%2==0)
                    {
                        if(arr[i] > arr[j])
                        {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }

                }
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //separate odd and even integers in same array.
    void sepEvenOdd(int arr[])
    {
        int temp;
        for(int i=0 ; i<(arr.length)/2 ; i++)
        {
            for(int j=(arr.length)/2 ; j<arr.length ; j++)
            {
                if(arr[i] % 2 != 0 && arr[j] % 2 == 0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //count the frequency of each element of an array.
    void countFreq(int arr[])
    {
        int count=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            
            if(arr[i] != 0)
            {
                count=1;
                for(int j=i+1 ; j<arr.length ; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                        arr[j]=0;
                            
                    }    
                }
                System.out.println(arr[i]+" "+count);
                
            }
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }


    //print all unique elements in an array
    void printUnique(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                System.out.println(arr[i]);

                for(int j=i+1 ; j<arr.length ; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        arr[j] = 0;
                    }
                }
            }
        }
    }

    // insert New value in the array (sorted list )
    void insert(int arr[],int num)
    {
        int arr2[] = new int[arr.length+1];
        int index =0;
        for(int i=0 ; i<arr2.length ; i++)
        {
            if(num-arr[i] == 1)
            {
                index = i+1;
                break;
            }
        }
         //System.out.print(index);
        int k=0;
        int i=0;
        while(i<arr.length)
        {
            if(k != index)
            {
                arr2[k] = arr[i];
                k++;
                i++;
            }
            else
            {
                 arr2[k] = num;
                 k++;
            }
        }
        for(int j=0 ; j<arr2.length ; j++)
        {
            System.out.print(arr2[j]+" ");
        }
    }

    // delete an element at desired position from an array.
    void deleteAtPos(int arr[] , int index)
    {
        int arr2[] = new int[arr.length-1];

        int j=0;
        for(int i=0 ; i<arr.length-1 ;i++)
        {
            if(i != index)
            {
              
                arr2[j]=arr[i];
            }
            else
            {
                arr2[index]=arr[index+1];
            }
            j++;
        }

        for(int i=0 ; i<arr2.length ; i++)
        {
            System.out.print(arr2[i]+" ");
        }
       
    }

    // find the maximum / minimum element in an array

    void minMax(int arr[])
    {
        int temp;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nMinimum is "+arr[0]);
        System.out.println("Maximum is "+arr[arr.length-1]);
        System.out.println("Second Largest is "+arr[arr.length-2]);
    }


    void secMax(int arr[])
    {
        int max =arr[0];
        int sec_max=arr[0];

        for(int i=1 ; i<arr.length ; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        for(int i=1 ; i<arr.length ; i++)
        {
            sec_max = arr[i];
        
            if(sec_max<max && sec_max>arr[i])
            {
                sec_max = arr[i];
            }
        }

        System.out.println("Second Maximum "+sec_max);
    }
    public static void main(String args[])
    {
        int arr[] = {89,121,56,33,23};
        //int arr[] = {1,2,3,4,5,6,7,8,9};
        //int arr[] = {1, 2, 8, 3,3,2, 2, 2, 5, 1};
        //int arr[] = {1,2,4,5,6,7,8};
        Array a = new Array();
        a.secMax(arr);
    }    
}
