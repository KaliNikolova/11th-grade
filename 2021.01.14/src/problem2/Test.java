package problem2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
	 Person[] persons = {new Person(3), new Person(4), new Person(1)};
	 java.util.Arrays.sort(persons);
	 for(int i=0;i<persons.length;i++) {
		 System.out.println(persons[i].id);
	 }
    }
}
class Person implements Comparable {
     int id;
    Person(int id) {
	 this.id = id;
    }
    @Override
    public int compareTo(Object o) {

    	if(o instanceof Person) {
    		if(((Person)o).id>id) return -1;
    		if(((Person)o).id<id) return 1;
    	}
    	return 0;
    }
}
