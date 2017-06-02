package info.chhaileng.demo;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {
	@Override
	public void say(){
		System.out.println("Woof Woof");
	}
}
