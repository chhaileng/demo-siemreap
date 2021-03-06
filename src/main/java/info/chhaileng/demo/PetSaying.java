package info.chhaileng.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PetSaying {
	private Pet pet;

	@Autowired
	@Qualifier("dog")
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public void saying(){
		this.pet.say();
	}
}
