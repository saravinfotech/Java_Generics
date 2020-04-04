/**
 * Single type generics.
 */

public class Lesson2_SingleTypeParameter {

    public static void main(String[] args) {

        //TODO Problem 1 can accept any data type
        // but requires explicit conversion
        StoreObjectData storeObject1 = new StoreObjectData();
        storeObject1.setStoreItem(4);
        //storeObject1.setStoreItem("Hello");
        int value = (int)storeObject1.getStoreItem(); // TODO Problem 1: Requires explicit conversion ;( this may create run time issues

        //TODO Problem 2 can accept only one data type
        // if it has to accept other data types then requires different classes with different data types
        StoreStringObject storeObject2 = new StoreStringObject();
        storeObject2.setStoreItem("Hello");

        //TODO Solution
        StoreGenericTypes<Integer> storeObject3 = new StoreGenericTypes<>();
        storeObject3.setStoreItem(4);
        int value1 = storeObject3.getStoreItem(); // TODO No type conversion required :)

        StoreGenericTypes<String> storeObject4 = new StoreGenericTypes<>();
        storeObject4.setStoreItem("Hello");
        String value3 = storeObject4.getStoreItem(); // TODO No type conversion required :)
    }
}


class StoreGenericTypes<T>{ //We are defining what kind of object his class is going to handle
    private T item;

    public T getStoreItem(){
        return item;
    }

    public void setStoreItem(T item){
        this.item = item;
    }

    public String toString(){
        return ""+this.item;
    }
}


class StoreStringObject{
   private String item;

    public String getStoreItem(){
        return item;
    }

    public void setStoreItem(String item){
        this.item = item;
    }

    public String toString(){
        return ""+this.item;
    }
}


class StoreObjectData{
    private Object item;

    public Object getStoreItem(){
        return item;
    }

    public void setStoreItem(Object item){
        this.item = item;
    }

    public String toString(){
        return ""+this.item.toString();
    }
}