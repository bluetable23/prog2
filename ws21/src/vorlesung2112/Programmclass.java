package vorlesung2112;

public class Programmclass {

	public static void main(String[] args) {
		
		
		char[] alphabet = new char[26];
		alphabet[0] = 'A';
		System.out.println("Laenge des Arrays: "+alphabet.length);
		System.out.println("Erstes Element: "+alphabet[0]);
		alphabet[1]=66;
		
		for(int index=0;index<alphabet.length;index++)
		{
			alphabet[index]=(char)(index+65);
		}
		
		for(int index=0;index<alphabet.length;index++)
		{
			System.out.print(alphabet[index]+" ");
		}
		System.out.println();
		
		
		
	}
	

}
;