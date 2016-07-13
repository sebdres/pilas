package Pilas;

public class Pila{
	
	
	
	final static int MAXPILA = 5;
	final String OVERFLOW = "Pila llena";
	final String UNDERFLOW = "Pila vacia";
	
	int cima = 0;
	int [] pila= new int[MAXPILA];
	
	public int getCima() {
		int ultimo;
		if(esVacia())
			ultimo= 0;
		else
			ultimo = pila[cima-1];
		
		return ultimo;
	}

	

	
	
	public void insertar(int e)throws Desbordamiento{
		
		if(cima == MAXPILA){
			//System.out.println(OVERFLOW);
			System.out.println("Pila llena. No se puede agregar.");
		}
		else{
			pila[cima] = e;
			cima = cima + 1;
		}
		
	}
	
	
	public void sacar()throws Desbordamiento{
		
		if (cima == 0){
			//System.out.println(UNDERFLOW);
			throw new Desbordamiento("Pila vacia. No hay elemento que sacar.");
		}
		else{
			cima = cima -1;
		}
				
		}
	public void mostrarPila(){
		for(int i=0; i<cima ;i++){
			System.out.print(pila[i]+" ");
		}
		System.out.println("\n*******");
		
		
	}
	
	public boolean esVacia(){
		if (cima==0){
			return true;
		}
		else return false; 
	}
			
		
	


}
