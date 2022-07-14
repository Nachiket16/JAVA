class searchMain{

    public int linearSearch(int[] arr, int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }

}


class main{
    public static void main(String[] args) {
        
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        searchMain obj = new searchMain();
        
        System.out.println(obj.linearSearch(arr, 50));

    }
}
 