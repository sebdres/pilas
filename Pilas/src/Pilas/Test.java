package Pilas;

public class Test {

	public static void main(String[] args) {
       
		try{
		Pila p = new Pila();
		
		p.insertar(2);
		p.insertar(5);
		p.insertar(4);
		p.insertar(1);
		p.insertar(8);
		p.insertar(9);
		
		
		
		p.mostrarPila();
		System.out.println("tope cima: "+p.getCima());		
				
		while(!(p.esVacia())){
			p.sacar();
		}
		//p.sacar();
		p.insertar(33);
		//p.insertar(2);
		p.mostrarPila();
		System.out.println("tope cima: "+p.getCima());
				
		
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());}
		finally{
			System.out.println("Fin del Programa");
		}
		
	}
}
		

	



