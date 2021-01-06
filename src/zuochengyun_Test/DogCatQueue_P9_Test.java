package zuochengyun_Test;

import java.util.List;

import zuochengyun_book.Cat_P9;
import zuochengyun_book.DogCatQueue_P9;
import zuochengyun_book.Dog_P9;
import zuochengyun_book.PetEnterQueue_P9;
import zuochengyun_book.Pet_P9;

public class DogCatQueue_P9_Test {
	public static void main(String args[]) {
		
		/*   该怎么测试P9代码呢？？？？     */
		PetEnterQueue_P9 cat1 = new PetEnterQueue_P9(new Cat_P9(), 1);
		PetEnterQueue_P9 dog1 = new PetEnterQueue_P9(new Dog_P9(), 1);
		PetEnterQueue_P9 cat2 = new PetEnterQueue_P9(new Cat_P9(), 2);
		PetEnterQueue_P9 cat3 = new PetEnterQueue_P9(new Cat_P9(), 3);
		PetEnterQueue_P9 dog2 = new PetEnterQueue_P9(new Dog_P9(), 6);
		DogCatQueue_P9 queue = new DogCatQueue_P9();
		queue.add(cat1.getPet());
		queue.add(dog1.getPet());
		queue.add(cat2.getPet());
		queue.add(cat3.getPet());
		queue.add(dog2.getPet());
		
		Pet_P9 list = queue.pollDog();
		System.out.println(list.getPetType());
		
		
	}

}
