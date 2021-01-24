
public class Main {

	public static void main(String[] args) {

		 String original = "o RATO ROEU a roupa do REI DE ROMA   ";
		 
		 String s01 = original.toLowerCase();
		 String s02 = original.toUpperCase();
		 String s03 = original.trim();
		 String s04 = original.substring(2);
		 String s05 = original.substring(2,9);
		 String s06 = original.replace('a', 'o');
		 String s07 = original.replace("RATO", "Tartaruga");
		 /* indexof verifica qual a posição de um determinado agumento ("abc") 
		 dentro de uma string */
		 int i = original.indexOf("o");
		 // ultima ocorrencia do argumento dentro de uma string.
		 int j = original.lastIndexOf("o");
		 
		 String s = "potato apple lemon";
		 
		 // função split
		 String[] vect = s.split(" ");
		 String word1 = vect[0];
		 String word2 = vect[1];
		 String word3 = vect[2];
		 
		 
		 System.out.println("Original: -" + original + "-");
		 System.out.println("toLowerCase: -" + s01 + "-");
		 System.out.println("toUpperCase: -" + s02 + "-");
		 System.out.println("trim: -" + s03 + "-");
		 System.out.println("substring(2): -" + s04 + "-");
		 System.out.println("substring(2,9): -" + s05 + "-");
		 System.out.println("replace('a','o'): -" + s06 + "-");
		 System.out.println("replace(RATO, Tartaruga): -" + s07 + "-");
		 System.out.println("indexOF(roupa): -" + i + "-");
		 System.out.println("lastIndexOf(roupa): -" + j + "-");
		 
		 //função split
		 System.out.println(word1);
		 System.out.println(word2);
		 System.out.println(word3);
		 
	}

}
