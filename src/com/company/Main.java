package com.company;


/*
public class Fundamentals_of_Array {
    public static void main(String[] args) {
        //Max-min elements in array

        int[] a = {4, 3, 10, 34, 89, 97};
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
//
//             if (a[i]>min){
//                min=a[i];
//            }
//
            }
            System.out.println("Maximum element is  " + max);
           // System.out.println("Minimum element is  " + min);

        }
    }
    -------------------------------------------------------
                       97
 */// Min-Max at once

/*
class MIN_MAX{
    public static void main(String[] args) {
            int[] a={100,3,5,6,1,32,34,789};
            int max=a[0];
            int min=a[0];
            int[] b=a;

            for (int i=1;i<a.length;i++){
                if (max<a[i]){
                    max=a[i];

                }else if (min>b[i]){
                    min=b[i];

                }

            }
            System.out.println(max);
            System.out.println(min);
        }
    }

 *///MIN_MAX both in one question

/*
class merge{
    public static void main(String[] args) {
        int[] a = { 4, 6, 7, 8};
        int[] b = {1, 2, 3, 5, 9, 10};
       int a_length=a.length;
       int b_length=b.length;
       int c_length=a_length+b_length;

       int[]c=new int[c_length];

        for (int i = 0; i < a_length; i++) {
            c[i]=a[i];

        }
        for (int i=0;i<b_length;i++){
            c[a.length+i]=b[i];
        }

        for (int i=0;i<c_length;i++){
            Arrays.sort(c);
            System.out.print(c[i]+ " ");
        }
    }
}

 */ //merge two arrays                                              //imp

/*
class insert{
    public static void main(String[] args) {

        int[] a = { 4, 6, 7, 8};
        int pos=3;
        int element=100;

       //inserting the element at given position

        for (int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
            a[pos-1]=element;

           //printing the loop
            for (int j =0; j<a.length;j++){
                System.out.print(a[j]);
            }
        }
    }
}

 */ //insert element in array                                      //imp

/*
class delete{
    public static void main(String[] args) {
        int delete=4;
        int []a ={11,2,3,4,5,6,77,8};

       for (int i=0;i<a.length;i++) {
         if (delete == a[i]) {
           for (int j = i; j < a.length - 1; j++)
                 {
                    a[j] = a[j + 1];
                }
                break;
            }
        }
            for (int i=0;i<a.length-1;i++)
            System.out.print(a[i]+" ");
    }
}

 */ //delete element in a array// imp

/*
class main{
    //this code will find the largest number

    static int largest(int a[],int n){
        int largest=0;
        for (int i=0;i<n;i++){
            if (a[i]>a[largest]){
                largest=i;
            }
        }
        return largest;
    }

    //this block of code will find the second largest number

    static int secondlargest(int a[],int n)
    {
        int largestt=largest(a,n);
        int res=-1;

        for (int i=0;i<n;i++){

            //this if condition will check that if the number
            // coming is the largest or not if it is not it will continue

            if (a[i]!=a[largestt])
            {
                if (res==-1)
                    res=i;

                //this else conditon will check if res is smaller than input a[i]

                else if (a[i]>a[res])

               //if res is smaller it will take its position
                    res=i;
            }

        }
       // System.out.println(res);
        return res;


    }
    public static void main(String[] args) {
        int a[]={5,20,12,20,10};
        int n=a.length;
        largest(a,n);
        secondlargest(a,n);
    }
}

 *///second largest element in an array (brute forcce)

/*
class main{
    static int fun(int[] a, int n)
    {
        int res=-1,largest=0;

        for (int i=1;i<n;i++)
        {
            if (a[i]>a[largest])
             {
                res=largest;
                largest=i;
            }
            else if (a[i]!=a[largest])
            if (res==-1 || a[i]>a[res])
            {
                res=i;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int a[]={5,20,12,20,10};
        int n=a.length;
        System.out.println(fun(a,n));


    }
}

 *///second largest best solution


/*
class main{
    static boolean fun(int a[]){
        for (int i=0;i<a.length;i++)
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[i])
                    return false;
            }
            return true;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        System.out.println(fun(a));
    }
}

 */ //Is array sorted or not?

/*
class reverses{
    private static void fun(int[] a) {

        int low=0,high=a.length-1;

        while (low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        fun(a);
    }


}

 */// reverse an array

/*
class Unique_Elements_in_Array {
    public static void main(String[] args) {

        int[] a={ 5,3,4,6,5,3,4,4,2,3,6};

        for (int i=0;i<a.length;i++){
            int cnt=0;
            for (int j=0;j<a.length;j++){
                if (a[j]==a[i])
                cnt++;
            }
            if (cnt==1)
            System.out.println(a[i]);
        }

    }

}
-----------------------------------------
        2

 */// Unique Elements time complexity is two 0(n2) due to for loops

/*

class Unique_Elements_in_Array {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 6, 5, 3, 4, 4, 2, 3, 6};

        int current=0;
        for (int i = 0 ;i < a.length ;i++){
            if (a[current]==a[i])
                continue;
                current++;
                a[current]=a[i];
            }
        for (int i=0;i<current;i++)
              System.out.println(a[i]);
        }
    }

   --------------------------------------------------------------
        2
        3
        4
        5
 */// Unique Elements in Array

/*
class Unique_element_in_array_XOR{
    //this program will work properly when only a number is
    // repeated maximum 2 times

    public static void main(String[] args) {
        int[] a={ 5,3,4,1,5,3,4};
        int result=a[0];

        for (int i=1;i<a.length;i++){
            result=result^a[i];
        }
        System.out.println("Non-repeating element is "+result);
    }

}


//----------------------------------------------------------
  //      1

 *//// Unique Elements XOR                                //imp

/*

class Unique_Elements_in_Array {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 6, 5, 3, 4, 4, 2, 3, 6};
        int i;

        HashSet<Integer> h= new HashSet<>();
        for (i=0;i<a.length;i++)
        h.add(a[i]);
        for (int x:h)
        System.out.println(x);

__________________________________________________________
        2
        3
        4
        5
        6

    }
}

 *///Unique Elements using Hashset

/*
class Duplicate_Elements_in_Array{
    public static void main(String[] args) {
        // works only when the elements are repeated two times only

        int arr[]={22,5,664,52,3,664,5};
        boolean isfound=false;

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j] && i!=j){
                    System.out.println("duplicate elements is = "+arr[i]);
                    isfound=true;
                }
              }
           }
        if (isfound==false){
            System.out.println("elements not found");
        }
    }
}


--------------------------------------------------------------------
duplicate elements is  = 5
duplicate elements is  = 664


 *//// Duplicate_Elements_in_Array                      //imp --most efficient way in Hashing-sum

/*

class main{
    public static void main(String[] args) {
        int[] a={1,2,3,5};

        int ALL_elements=a.length+1;
        int total_sum =ALL_elements * (ALL_elements+1)/2;

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Missing number is "+(total_sum-sum));
    }
}
--------------------------------------------------------------------
 Missing number is 9

 *///Missing elements using Sum formula and loop       // (IMP)

/*


class MissingElement_in_Array_XOR{
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int xor1=a[0];
        for (int i=1;i<a.length;i++){
            xor1=xor1^a[i];
        }
        int xor2=1;
        for (int i=2;i<=a.length+1;i++){
            xor2=xor2^i;

        }
        System.out.println("Missing element is "+(xor1^xor2));
    }
}
-----------------------------------------------------------
            9


 *///Missing elements using using XOR                 // (IMP)

/*
class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//         int n;
//        System.out.println("Enter number of elements");
//        n= sc.nextInt();
//        int[] array=new int[n];
//        System.out.println("Enter the elements in string");
//        for (int i=0;i<n;i++){
//            array[i]=sc.nextInt();
//        }
//        System.out.println("Entered elements are ");
//        for (int i=0;i<n;i++){
//            System.out.print(array[i]+" ");
//            System.out.println();
//        }

        int[] array={1,2,3,4};
        int sum=0;
        int counter=0;
        for (int i=0;i<array.length;i++){
           // System.out.println(array[i]);
             sum=sum+array[i];
             counter++;

            System.out.println("sum of first "+counter+" numbers");

            System.out.println(sum);
        }

    }


}
 *////sum of array

/*
class main
{
    static int fun(int arr[], int n)
    {
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;

        for(int i = 1; i < n; i++)
        {
            if(temp[res - 1] != arr[i])
            {
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i = 0; i < res; i++)
        {
            arr[i] = temp[i];
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
        System.out.println("Before Removal");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = fun(arr, n);
        System.out.println();

        System.out.println("After Removal");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}

 */// remove duplicate elements brute force             //imp

/*
class main{

    static int fun(int a[],int n){
        {
            int res = 1;

            for(int i = 1; i < a.length; i++)
            {
                if(a[i] != a[res-1])
                {
                    a[res] = a[i];
                    res++;
                }
            }
            return res;

        }

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,4,4};
        int n=a.length;

        System.out.println("Before Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();


        n = fun(a, n);

        System.out.println("After Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }

    }

}

 */ //remove duplicate elements