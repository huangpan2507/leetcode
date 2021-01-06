package zuochengyun_book;

public class PetEnterQueue_P9 {
	
	private Pet_P9 pet;
	private long count;
	
	public PetEnterQueue_P9(Pet_P9 pet, long count) {
		this.pet = pet;
		this.count = count;
	}
	
	public Pet_P9 getPet() {
		return this.pet;
	}
	
	public long getCount() {
		return this.count;
	}
	
	public String getEnterPetType() {
		return this.pet.getPetType();
	}

}
