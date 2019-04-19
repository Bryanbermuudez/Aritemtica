package ARITMETICA;
import java.io.*;
import java.util.ArrayList;

public class calculadora 
{
	
  public static void main(String[] args) 
  	{
	  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	  BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		try 
			{
				ArrayList<String>Lista=new ArrayList<>();
					Lista.add("1. SUMA");
					Lista.add("2. RESTA");
					Lista.add("3. MULTIPLICACION");
					Lista.add("4. DIVISION");
					Lista.add("5. NUMERO MAYOR");
					Lista.add("6. PROMEDIO DE 5 NUMEROS");
					Lista.add("7. RAIZ CUADRADA");
						
				System.out.println(Lista + "\n" + "Ingrese la opcion que desea, seguido de la tecla ENTER :");
				int x = Integer.parseInt(br.readLine());
			
				switch (x)
					{
						case 1:
						{
							System.out.println("Ingrese el primer valor");
							float sum1 = Float.parseFloat(br.readLine());
							System.out.println("Ingrese el segundo valor");
							Float sum2 = Float.parseFloat(br.readLine());
							Float resultadosum = sum1 + sum2 ; 
							System.out.println("Resultado : " + resultadosum);
						}break;
						case 2:
						{
							System.out.println("Ingrese el primer valor");
							float rest1 = Float.parseFloat(br.readLine());
							System.out.println("Ingrese el segundo valor");
							float rest2 = Float.parseFloat(br.readLine());
							float resultadorest = rest1 - rest2 ; 
							System.out.println("Resultado : " + resultadorest);
						}break;
						case 3:
						{
							System.out.println("Ingrese el primer valor");
							float mult1 = Float.parseFloat(br.readLine());
							System.out.println("Ingrese el segundo valor");
							float mult2 = Float.parseFloat(br.readLine());
							float resultadomult = mult1 * mult2 ; 
							System.out.println("Resultado : " + resultadomult);
						}break;
						case 4:
						{
							System.out.println("Ingrese el primer valor");
							float div1 = Float.parseFloat(br.readLine());
							System.out.println("Ingrese el segundo valor");
							float div2 = Float.parseFloat(br.readLine());
							if (div2 != 0)
								{
								float resultadodiv = div1 / div2 ; 
								System.out.println("Resultado : " + resultadodiv);
								}
							else 
								{
								System.out.println("El denominador no puede ser 0");
								}
						}break;
						case 5 :
						{
							System.out.println("Ingrese 3 numeros para realizar la compraracion");
							float dif1 = Float.parseFloat(br.readLine());
							float dif2 = Float.parseFloat(br.readLine());
							float dif3 = Float.parseFloat(br.readLine());
							if (dif1 > dif2) 
								{
								if (dif1 > dif3)
									{
									System.out.println("El numero mayor es " + dif1);
									}
								}
							else 
								{
								if(dif2>dif3)
									{
									System.out.println("El numero mayor es " + dif2);
									}
								else
									{
									System.out.println("El numero mayor es " + dif3);
									}
								}
						}break;
						case 6:
						{
							System.out.println("Ingrese las notas a promediar");
							float prod1 = Float.parseFloat(br.readLine());
							float prod2 = Float.parseFloat(br.readLine());
							float prod3 = Float.parseFloat(br.readLine());
							float prod4 = Float.parseFloat(br.readLine());
							float prod5 = Float.parseFloat(br.readLine());
							float proceso = (prod1 + prod2 + prod3 + prod4 + prod5)/5;
							System.out.println("El promedio es igual a : " + proceso);
						}break;
						case 7:
						{
							System.out.println("Ingrese las notas a promediar");
							float raiz1 = Float.parseFloat(br.readLine());
							if (raiz1 >= 0)
							{
								float resultado = (float) Math.sqrt(raiz1);
								System.out.println("La raiz cuadradad es : " + resultado);
							}
							else 
							{
								System.out.println("Ingrese un valor NO negativo");
							}
						}break;
					}
			}
		catch (IOException e) 
			{
			
			e.printStackTrace();
			}

  	}
}