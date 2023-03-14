package it.epicode.be;
import java.util.*;

public class Helloworld {

	public static void main (String[] args)
			{
		molt();
		conc();
		AreaR();	
		PoD();
		AreaT();
		InsString();
		StringInTerza();
		}
			

			public static void molt() {
			System.out.println("This is my first Epicode Java Project!");
			int a =3;
			int b=5;
			System.out.println("#1 Moltiplicazione di "+(a)+" e "+(b));
			System.out.println(a*b);}
			
			
			public static void conc() {
			String c="Ciao ";
			int d=6;
			System.out.println("#2 Conctenazione di "+(c)+"e "+d);
			System.out.println(c+d);
			}
			
			
			public static void AreaR() {
			System.out.println("#3 Calcolo area rettangolo");
			Scanner lato=new Scanner(System.in);
			Scanner altezza=new Scanner(System.in);
			int l;
			int h;
			int area;
			System.out.println("Inserisci il lato");
			l=lato.nextInt();
			System.out.println("Inserisci l' altezza");
			h=altezza.nextInt();
			System.out.println("Area rettangolo : "+l*h);
			}
			
			
			public static void PoD() {
			System.out.println("#4 Numero pari o dispari?");
			Scanner num=new Scanner(System.in);
			int numero;
			System.out.println("Inserisci un numero (0 se pari e 1 se disparo)");
			numero=num.nextInt();
			if((numero%2)!=0)
			System.out.println(1);
			else
				System.out.println(0);
			}
			
			
			public static void AreaT() {
			System.out.println("#5 Calcolo area tringolo in decimali");
			Scanner lato1=new Scanner(System.in);
			Scanner lato2=new Scanner(System.in);
			double l1, l2;
			System.out.println("Inserisci il primo lato");
			l1=lato1.nextDouble();
			System.out.println("Inserisci L'alezza");
			l2=lato2.nextDouble();
			System.out.println("Area del triagolo: "+((l1*l2)/2));
			}
			
			
			public static void InsString() {
			Scanner s=new Scanner(System.in);

			String s1, s2, s3;
			
			System.out.println("#6 Inserimento di stringhe e visualizzazione in ordine e al contrario");
			System.out.println("Inserisci La prima stringa");
			s1=s.next();
			System.out.println("Inserisci La seconda stringa");
			s2=s.next();
			System.out.println("Inserisci La terza stringa");
			s3=s.next();
			System.out.println("Inserimento ordinato:\n "+(s1+s2+s3));
			System.out.println("Inserimento al contrario:\n "+(s3+s2+s1));
			
			
			//OPPURE 
			/*
			String[] stringhe= new String[3];
			System.out.println("Inserisci La prima stringa");
			stringhe[0]=s.nextLine();
			System.out.println("Inserisci La seconda stringa");
			stringhe[1]=s.nextLine();
			System.out.println("Inserisci La terza stringa");
			stringhe[2]=s.nextLine();
			return stringhe;
			*/
			}
			
			
			public static void StringInTerza() {
			System.out.println("Aggiunta di una stringa in terza posizione");
			String arrayOfString[]= {"a", "b", "d", "e", "f"};
			String newArrayOfString[]=new String [arrayOfString.length+1];
			for(int i =0,j=0;i<newArrayOfString.length;i++) {
				if(i==2)
					newArrayOfString[i]="c";
				else {
					newArrayOfString[i]=arrayOfString[j];
					j++;
				}
			}
			System.out.println(Arrays.toString(newArrayOfString));
	}
	}
