class Bag<T> {
	private T thing;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T�� Ÿ���� " + thing.getClass().getName());
	}
}

class Book {
}

class PencilCase {
}

class Notebook {
}

public class BagTest {
	public static void main(String[] args){
		Bag<Book> bag1 = new Bag<>(new Book());
    	Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
    	Bag<Notebook> bag3 = new Bag<>(new Notebook());
    
    	bag1.showType();
    	bag2.showType();
    	bag3.showType();
	}
}