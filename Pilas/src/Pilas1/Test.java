package Pilas1;

public class Test {

	public static void main(String[] args) {
		
		Pila p = new Pila();
		
		p.insertar(10);
		p.insertar(5);
		p.insertar(6);
		
		p.imprimir();
		
		System.out.println();
		
			
		System.out.println(p.extraer());
		p.imprimir();
		System.out.println();
		
		System.out.println(p.extraer());
		p.imprimir();
		System.out.println();
		
		System.out.println(p.extraer());
		p.imprimir();
		System.out.println();
		
		System.out.println(p.extraer());
		p.imprimir();
		System.out.println();
		
	}

}
