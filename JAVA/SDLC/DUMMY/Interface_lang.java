package Week_Day2;
interface Language {

	void getName(String name);
	
}
class ProgrammingLanguage implements Language{
	
	public void getName(String name) {
		System.out.println("programming language:"+name);
		
	}
}

class Interface_lang
{
	public static void main(String args[]) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("java");
	}
}