package zuochengyun_book;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue_P9 {
	private Queue<PetEnterQueue_P9> dogQ;
	private Queue<PetEnterQueue_P9> catQ;
	private long count;
	
	public DogCatQueue_P9(){
		this.dogQ = new LinkedList<PetEnterQueue_P9>();
		this.catQ = new LinkedList<PetEnterQueue_P9>();
		this.count = count;
		
	}
	
	public void add(Pet_P9 pet) {
		if(pet.getPetType().equals("dog")) {
			this.dogQ.add(new PetEnterQueue_P9(pet, this.count++));
			
		} else if(pet.getPetType().equals("cat")) {
			this.catQ.add(new PetEnterQueue_P9(pet, this.count++));
		} else {
			throw new RuntimeException("Error, not dog or cat!");
		}	
		
	}
	
	public Pet_P9 pollAll() {
		if(!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
			if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
				return this.dogQ.poll().getPet();
			} else {
				return this.catQ.poll().getPet();
			} 
			
		} else if(!this.dogQ.isEmpty()) {
			return this.dogQ.poll().getPet();
		} else if(!this.catQ.isEmpty()) {
			return this.catQ.poll().getPet();
			
		} else {
			throw new RuntimeException("erro, queue is Empty!");
			
		}
	}
	
	
	public Dog_P9 pollDog() {
		if (this.dogQ.isEmpty()) {
			throw new RuntimeException("Dog queue is empty!");
		} else {
		return (Dog_P9) this.dogQ.poll().getPet();
		
	  }
	}
	
	
	public Cat_P9 pollCat() {
		if (this.catQ.isEmpty()) {
			throw new RuntimeException("Cat queue is empty!");
		} else {
			return (Cat_P9) this.catQ.poll().getPet();
		}
		
	}
	
	
	public boolean isEmpty() {
		return this.dogQ.isEmpty() && this.catQ.isEmpty();
			
	}
	
	
	public boolean isDogEmpty() {
		return this.dogQ.isEmpty();
	}
	
	public boolean isCatEmpty() {
		return this.catQ.isEmpty();
	}
	
	
	
	
	

}
