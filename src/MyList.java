import java.util.Arrays;

public class MyList<T> {
    private Object[] myArray;
    int capacity;

    public MyList() {
        myArray = new Object[10];
    }
    
    public MyList(int capacity) {
        this.capacity=capacity;
        myArray = new Object[this.capacity];
    }

    public void doubleCapacity(){
        Object[] myArray2 = new Object[myArray.length*2];
        for(int i=0; i<myArray.length; i++){
            myArray2[i]=myArray[i];
        }
        myArray=myArray2;
    }

    public void getCapacity(){
        System.out.println("The Capacity is: " + myArray.length);
    }

    public int size(){
        int count=0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]!=null){
                count++;
            }
        }
        return count;
    }

    public void add(T data) {
        int count=0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]==null){
                myArray[i] = data;
                count++;
                break;
            }
        }
        if(count==0){
            doubleCapacity();
            for(int i=0; i<myArray.length; i++){
                if(myArray[i]==null){
                    myArray[i] = data;
                    count++;
                    break;
                }
            }
        }
    }

    public void set(int index, T data) {
        if(index>=0 && index<myArray.length){
            myArray[index] = (Object) data;
            System.out.println(data + " was written on index no " + index);
        }
        else{
            System.out.println("Invalid index!");
        }
        
    }

    public void get(int i) {
        if(i>=0 && i<myArray.length){
            System.out.println("Index no " + i + " is: " + myArray[i]);
        }
        else{
            System.out.println("null");
        }
    }

    public void remove(int i){
        if(!(i>=0 && i<myArray.length)){
            System.out.println("Invalid index!");
        }
        else{
            for(int j=i; j<myArray.length-1; j++){
                myArray[j]=myArray[j+1];
            }
            myArray[myArray.length-1]=null;
            System.out.println("Removed.");
        }
    }

    public String toString(){
        String str = Arrays.toString(myArray);
        System.out.println(str);
        return String.valueOf(myArray);
    }

    public int indexOf(T data){
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]==null){
                continue;
            }
            else if(myArray[i].equals(data)){
                System.out.println("Index: " + i);
                return i;
            }
        }
        System.out.println("Not found.");
        return -1;
    }

    public int lastIndexOf(T data){
        for(int i=myArray.length-1; i>=0; i--){
            if(myArray[i]==null){
                continue;
            }
            if(myArray[i].equals(data)){
                System.out.println("Last index: " + i);
                return i;
            }
        }
        System.out.println("Not found.");
        return -1;
    }

    public boolean isEmpty(){
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]!=null){
                System.out.println("The List is NOT empty.");
                return false;
            }
        }
        System.out.println("The List is empty.");
        return true;
    }

    public Object[] toArray(){
        int size = size();
        Object[] arr = new Object[size];
        for(int i=0, j=0; i<myArray.length; i++){
            if(myArray[i]!=null){
                arr[j]=myArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public void clear(){
        for(int i=0; i<myArray.length; i++){
            myArray[i]=null;
        }
        System.out.println("Cleared.");
    }

    public Object[] sublist(int start, int finish){
        Object[] arr = new Object[finish-start+1];
        for(int i=start, j=0; i<=finish; i++){
            arr[j]=myArray[i];
            j++;
        }
        return arr;
    }

    public boolean contains(T data){
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]==null){
                continue;
            }
            else if(myArray[i].equals(data)){
                return true;
            }
        }
        return false;
    }
}
