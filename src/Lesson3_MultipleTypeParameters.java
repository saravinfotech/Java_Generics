/**
 * Mutli type generics
 */

public class Lesson3_MultipleTypeParameters {
    public static void main(String[] args) {
        HashTable<String,Integer> hashTable = new HashTable<>("Hellow",25);
        System.out.println(hashTable.toString());
    }
}

class HashTable<K,V>{
    private K key;
    private V value;

    HashTable(K key, V value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return key.toString()+" - "+value.toString();
    }
}

