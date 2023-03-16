package HashTable;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {

	ArrayList<KeyValue> [] data=null;
	int currentLength=0;

	HashTable(int size){
		data=new ArrayList[size];		}


		//hash ky generator
		public int _hashKey(String key){
			int hash=0;
			for(int i=0;i<key.length();i++){
				hash=(hash+key.codePointAt(i)*i )% data.length;

			}
			return hash;
		}

		//set method
		public void set(String key , int value){
			int address=_hashKey(key);			
				 //here if we don't check null then that address of data will be null and later
				 //when we perform .add operation it will -> null.add() which will throw exception so
				 //before that we are inserting empty array to that address and later we are adding adding to that blank
				 //array.
				 if(data[address]==null){ 
				ArrayList<KeyValue> emptyData =new ArrayList<>();
				data[address]=emptyData;
				currentLength++;
            }
           	KeyValue kv=new KeyValue(key,value);
			data[address].add(kv);
			System.out.println(Arrays.toString(data));

		}

		//get method
		public Integer get(String key){
			int address=_hashKey(key);
			
            ArrayList<KeyValue> bucket = data[address];
			for(int i=0;i<bucket.size();i++){
				System.out.println(bucket.size());
				System.out.println(bucket.get(i).getKey().toString());

				//System.out.println(bucket.get(i));
				if (bucket.get(i).getKey().equals(key)){
					return bucket.get(i).getValue();
				}				
				}
				return null;				
		}


		//get keys
		public String[] getKeys(){
			String [] keys=new String[currentLength];
			int count=0;
			ArrayList<KeyValue> [] bucket= data;
			for(ArrayList<KeyValue> kv:bucket){
				
				if(kv!=null){
					keys[count]=kv.get(0).getKey();
					count++;

				}
			}
			return keys;
		}

	public static void main(String[] args) {
		
	 HashTable hashTable=new HashTable(5);
	 hashTable.set("apple",4);
	 hashTable.set("orange",9);
	 hashTable.set("banana",19);
	 hashTable.set("kiwi",5);
	 System.out.println(hashTable.get("apple").toString());
	 System.out.println("list of keys: " + Arrays.toString(hashTable.getKeys()));
    }
}