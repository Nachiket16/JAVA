class searchMain{

    public int linearSearch(int[] arr, int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public int linearSearchRec(int[] arr, int key){
        
        int count = 0 ;
        if(count == arr.length){
            return -1;
        }
        if(arr[count] == key){
            return count;
        }else{
            ++count;
            return linearSearch(arr, key);
        }
    }

    public int binarySearch(int[]arr, int key){

        int start = 0 ;
        int end = arr.length-1;

        while(start <= end){

            int mid = (start + end)/2;

            if (arr[mid]==key) {    
                return mid;
            }
            
            if(key < arr[mid]){
                end = mid-1; 
            }else{
                start = mid +1;
            }

        }
        return -1;
        
    }

}


 