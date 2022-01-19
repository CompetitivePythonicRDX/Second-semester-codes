class fascinating{
    public static void main(String args[]){
        int number = 192;
        int twice = 192 * 2;
        int thrice = 192*3;
        String str = Integer.toString(number)+Integer.toString(twice)+Integer.toString(thrice);
        char Arr[] = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            Arr[i] = str.charAt(i);
        }
        bubbleSort(Arr, Arr.length);
        String sorted_str = "";
        for(int i = 0; i < Arr.length; i++){
            str = str +Arr[i]; 
        }

        if(sorted_str == "123456789") System.out.println("Fascinating number");

    }

    static void bubbleSort(char arr[], int n)
    {
        // Base case
        if (n == 1)
            return;
      
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        bubbleSort(arr, n-1);
    }


}

  