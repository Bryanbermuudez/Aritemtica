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
			
			System.out.println("Ingrese la opcion a escoger : \n 1. Combustible \n 2. Billetes \n 3. Conversor de tiempo \n 4. Conversor de edad \n 5. Test 1 \n 6. Bhaskara formula \n 7. Intervalo");
			int opcion = Integer.parseInt(br.readLine());
			switch(opcion)
			{
				case 1 :
				{
					//COMBUSTIBLE GASTADO 
					System.out.println("¿Cuanto duro el viaje? ingrese el valor sin decimales");
					int horas = Integer.parseInt(br.readLine());
					System.out.println("¿Que velocidad promedio tubo? ingrese el valor sin decimales");
					float promvel = Float.parseFloat(br.readLine());
					float combustible = (horas * promvel) / 12 ;
					System.out.println("Tu consumo final fue de :" + combustible + "\n");
					break;
				}
				case 2 : 
				{	
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
					break;
				}	
				case 3 : 
				{
					//CONVERSION DE TIEMPO
					System.out.println("Ingrese el valor en segundos");
					int segundos = Integer.parseInt(br.readLine());
					int hora = segundos / 3600 ;
					int minutos = (segundos%3600)/60;
					int segundo = ((segundos%3600)%60)/1;
					System.out.println(hora +":"+ minutos+":"+segundo);	
				}
				case 4 :
				{
					//EDAD EN DIAS
					System.out.println("Ingrese su edad, en dias");
					int edad_dias = Integer.parseInt(br.readLine());
					int año = edad_dias / 365;
					int mes = (edad_dias%365)/30;
					int dias = ((edad_dias%365)%30)/1;
					System.out.println(año+" Año(s) \n" + mes + " Mes(es) \n" + dias +" Dia(s)");
					
				}
				case 5 : 
				{
					//PRUEBA DE SELECCION 1 
					System.out.println("Ingrese los valores separadospor espacios");
					String valores = br.readLine();
					String [] parts = valores.split(" ");
						int dato1 = Integer.parseInt(parts[0]) ;
						int dato2 = Integer.parseInt(parts[1]) ;
						int dato3 = Integer.parseInt(parts[2]) ;
						int dato4 = Integer.parseInt(parts[3]) ;
					int sum1 = dato1 + dato2 ;
					int sum2 = dato3 + dato4 ; 	
					if (dato2 > dato3 && dato4 > dato1 && sum2>sum1 && dato3 > 0 && dato4>0 && (dato1%2 == 0)  )
					{
						System.out.println("Valores aceitos");
					}
					else
					{
						System.out.println("Valores nao aceitos");
					}
				}
				case 6 : 
				{
					//BHASKARA´S FORMULA
					System.out.println("Ingrese lo valores a calcular :");
					String datosbhas = br.readLine();
					String [] parts1 = datosbhas.split(" ");
						double A = Double.parseDouble(parts1[0]);
						double B = Double.parseDouble(parts1[1]);
						double C = Double.parseDouble(parts1[2]);
					double raiz = ((B*B) - (4*A*C));
					if (A != 0 && raiz >= 0)
					{
						float opra = (float )Math.sqrt(raiz);
						float resultado1 = (float) ((float) (-B + opra)/(2*A)) ;
						float resultado2 = (float) ((float) (-B - opra)/(2*A)) ;
						
						System.out.println("R1 = " + resultado1 + "\nR2 = " + resultado2);
					}
					else
					{
						System.out.println("Impossivel calcular");
					}	
				}
				case 7 :
				{
					System.out.println("Ingrese el numero correspondiente");
					float rang = Float.parseFloat(br.readLine());
					if(0.0 <= rang && rang<=25.0 )
					{
						System.out.println("Intervalo (0,25)");
					}
					else
					{
						//INTERVALO DE NUMEROS
						if(25.0 < rang && rang<=50.0 )
						{
							System.out.println("Intervalo (25,50)");
						}
						else
						{
							if(50.0 < rang && rang<=75.0 )
							{
								System.out.println("Intervalo (50,75)");
							}
							else
							{
								if(75.0 < rang && rang<= 100.0 )
								{
									System.out.println("Intervalo (75,100)");
								}
								else
								{
									System.out.println("Intervalo invalido");
								}
							}
						}
						
					}
				}
				case 8 :
			}
			
		}
		catch (IOException e) 
		{
		
		e.printStackTrace();
		}

	}

}
