package ARITMETICA;
import java.io.*;
public class CLASES {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		try 
		{
			//COMBUSTIBLE GASTADO 
			
			System.out.println("¿Cuanto duro el viaje? ingrese el valor sin decimales");
			int horas = Integer.parseInt(br.readLine());
			System.out.println("¿Que velocidad promedio tubo? ingrese el valor sin decimales");
			float promvel = Float.parseFloat(br.readLine());
			float combustible = (horas * promvel) / 12 ;
			System.out.println("Tu consumo final fue de :" + combustible + "\n");
			
			//BILLETES
			System.out.println("Ingrese la cantidad a convertir :");
			int billetes = Integer.parseInt(br.readLine());
			int bill100 = billetes/100 ;
			int billetes50 = (billetes%100)/50; 
			int billetes20 = ((billetes%100)%50)/20;
			int billetes10 = (((billetes%100)%50)%20)/10 ;
			int billetes5 = ((((billetes%100)%50)%20)%10)/5; 
			int billetes2 = (((((billetes%100)%50)%20)%10)%5)/2;
			int billetes1 = ((((((billetes%100)%50)%20)%10)%5)%2)/1;
			
			System.out.println(bill100 + " notas (s) de R$ 100,00 \n" + billetes50 + " notas (s) de R$ 50,00 \n" + billetes20 + " notas (s) de R$ 20,00 \n" + billetes10 + " notas (s) de R$ 10,00 \n" + billetes5 + " notas (s) de R$ 5,00 \n" + billetes2 + " notas (s) de R$ 2,00 \n" + billetes1 + " notas (s) de R$ 1,00 \n" );
		}
		catch (IOException e) 
		{
		
		e.printStackTrace();
		}

	}

}
