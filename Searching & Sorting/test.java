

class test{
    public static void main(String[] args) {
        
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        searchMain obj = new searchMain();
        
        System.out.println("Position of the Given key is: "+obj.linearSearch(arr, 50));
        System.out.println("Position of the Given key is: "+obj.linearSearchRec(arr, 30));
        System.out.println("Position of the Given key is: "+obj.binarySearch(arr, 10));

    }
}