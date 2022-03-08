package org.drools.examples.converter;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.runtime.EarlyExitException;
import org.drools.compiler.shade.org.eclipse.jdt.internal.compiler.ast.ForeachStatement;

public class Converter {
    public static void main(String[] args){
		int id;
		double amount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose currency to convert:\n1:USD \t2:EUR \t3:YEN \n4:PLN \t5:NOK");
		id = sc.nextInt()-1;
		if(id>4||id<0){
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("Invalid choice, please enter number from 1 to 5\n");
			main(args);
		}else{
			System.out.println("Enter amount to convert");
			amount =sc.nextDouble();
		}
		Currency[] currencies= {
		new Currency("USD" , 1,false),
		new Currency("EUR", 1.09,false),
		new Currency("YEN", 0.0087,false),
		new Currency("PLN", 0.22,false),
		new Currency("NOK", 0.11,false)
		};
		currencies[id].setChosen(true);
		currencies[id].setAmount(amount);

		Object[] filteredCurrencies= currencies.clone();
    
        new Run().runRules( new String[] { "Example1.drl" },
        		filteredCurrencies );
    }
}
