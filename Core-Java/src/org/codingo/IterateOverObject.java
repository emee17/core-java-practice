package org.codingo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IterateOverObject<T> {

	public static void main(String[] args) {

		Coder coder = getCoder();
		//System.out.println(coder.getClass().getSimpleName());
		
		try {
			IterateOverObject<Coder> itrr = new IterateOverObject<>();
			itrr.printAllField(coder);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		Language lang = new Language("HP", 6);
		IterateOverObject<Coder> itr = new IterateOverObject<>();
		//itr.name(lang);
		//itr.name(coder);
	}
	
	public  void printAllField(T coder) throws IllegalArgumentException, IllegalAccessException {
		Field[] fieldArray = coder.getClass().getDeclaredFields();
		
		for (Field field : fieldArray) {
			
			if(field.get(coder) instanceof Collection) {
				List<Object> langs = (List<Object>) field.get(coder);
				
				//System.out.println(((List<Object>)field.get(coder)).get(1).getClass());
				for(Object language : langs) {
					printAllField((T) language);
				}
			}else {
				System.out.println(field.get(coder));
			}
		}
	}
	public void name(T name) {
		System.out.println(name);
	}
	public static Coder getCoder() {
		List<Language> languages = new ArrayList<>();
		
		for(int i=0; i<=2; i++) {
			languages.add(new Language("Java"+i, i));
		}
		
		return new Coder (1,"Namaz",languages);
	}

}
class Coder{
	int id;
	String name;
	List<Language> languages ;
	public Coder(int id, String name, List<Language> languages) {
		super();
		this.id = id;
		this.name = name;
		this.languages = languages;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Language> getLanguages() {
		return languages;
	}
}
class Language{
	String brandName;
	int ram;
	public Language(String brandName, int ram) {
		super();
		this.brandName = brandName;
		this.ram = ram;
	}
	public String getBrandName() {
		return brandName;
	}
	public int getRam() {
		return ram;
	}
}
