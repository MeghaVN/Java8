package lambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
		WebPage w1= new WebPage() {
			
			//anonymization
			@Override
			public void header(String value) {
				
				System.out.println("hi"+value);
			}
		};//this behaves like a class
		WebPage w2= new WebPage() {
			
			//anonymization
			@Override
			public void header(String value) {
				
				System.out.println("hello"+value);
			}
		}; 
		
		w1.header("Naveen");

		w2.header("Mukesh");
		//Instead of creating reference everytime, lambda is introduced
		WebPage w3 = name->{System.out.println("hello"+name);
			};
			w3.header("Ola..");
			
			WebPage w4 = (name)->System.out.println("Mercy"+name);
			
			w4.header("megha");

		
		
	}

}
