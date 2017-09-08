package com.deitel.exercicios.Capitulo7.Cap7_25;

public class Main
{

	private static final java.util.Scanner SC = new java.util.Scanner( System.in );
	
	public static void main( String[] args )
	{
		System.out.print( "Enter with amounts loop: " );
		int number = SC.nextInt();
		
		int fibonacci = 1;
		int previous = 0;
		int temp;
		
		for( int i = 0; i < number; i++ )
		{
			if( i == 0 )
				System.out.printf( "%2d, ", 0 );

			temp = fibonacci;
			fibonacci += previous;
			previous = temp;
			
			if( i == number - 1 )
				System.out.printf( "%2d.", fibonacci );
			else
				System.out.printf( "%2d, ", fibonacci );	
		}

	}

}
