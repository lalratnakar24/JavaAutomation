package com.learn.basic;

class BasicsDemo {
	// Adapted from
	// http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!"); // Advance cursor to beginning of
												// next line
		System.out.println(); // Print empty line
		System.out.print("Hello, world!!"); // Cursor stayed after the printed
											// string
		System.out.println("Hello,");
		System.out.print(" "); // Print a space
		System.out.print("world!!");
	}

	static void primitivesInteger() {
		System.out.println("\n\nPrimitives");

		int intHex = 0x0041;
		System.out.println("intHex" + intHex);

		int intBinary = 0b1000001;
		System.out.println("intBinary" + intBinary);

		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore" + intUnderscore);

	}

	static void primitivecharacter() {
		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; // binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);

	}

	static void operator()

	{
		int i = 6;
		int j = 2;

		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
	}

	public static void Boolean() {
		boolean isInsured = false;
		double coverage = 0.8;
		double billAmount = 1000.0;
		double amountPaidByInsurance = 0.0;
		double amountPaidByPatient = billAmount;

		if (isInsured) {
			amountPaidByInsurance = billAmount * coverage;
			amountPaidByPatient = billAmount - amountPaidByInsurance;
		}
		System.out.println("AmountPaid by the Insurance-" + amountPaidByInsurance);
		System.out.println("Amount Paid By the Patient- " + amountPaidByPatient);
	}

	static void typeCasting() {
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		// int x = y;
		int x = (int) y;

		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte) 123456;
		System.out.println("narrowdByte: " + narrowdByte);

		// Truncation
		int iTruncated = (int) 0.99;
		System.out.println("iTruncated: " + iTruncated);

		// Implicit cast (int to long)
		y = x;

		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char) bByte; // special conversion (widening from byte --> int
								// followed by narrowing from int --> char)
		System.out.println("cChar: " + cChar);
	}

	static void arrays() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[] { 9, 11, 2, 5, 4, 4, 6 };
		System.out.println("myArray.length: " + myArray.length);
		System.out.println("myArray[1]: " + myArray[1]);
		System.out.println("myArray[7]: " + myArray[7]);
	}

	static void threeDimensionalArrays() {
		System.out.println("\nInside threeDimensionalArrays ...");
		int[][][] unitsSold = new int[][][] { { // New York
				{ 0, 0, 0, 0 }, // Jan
				{ 0, 0, 0, 0 }, // Feb
				{ 0, 0, 0, 0 }, // Mar
				{ 0, 850, 0, 0 }// Apr
				},
				{ // San Francisco
						{ 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0 }, // Mar
						{ 0, 0, 0, 0 } // Apr
				}, { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } }, { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } } };

		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}

	static void varargsOverload(boolean b, int i, int j, int k) {
		System.out.println("\nInside varargsOverload without varargs ...");
	}

	static void varargsOverload(boolean b, int... list) {
		System.out.println("\nInside varargsOverload with varargs ...");
		System.out.println("list.length: " + list.length);
	}

	static void preAndPost() {
		System.out.println("\nInside preAndPost ...");

		// int x = 5;

		// --x;
		// System.out.println("x: " + x);

		// int y = x--;
		// System.out.println("y: " + y + ", x: " + x);

		int index = 0;
		int[] array = new int[3];
		array[index++] = 10;
		array[index++] = 20;
		array[index++] = 30;

		System.out.println(index);
	}

	static void compoundArithmeticAssignment() {
		int x = 100;

		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));

		// Invalid
		System.out.println("x =+ 5: " + (x = +5)); // Unary plus ~ x = +5
		System.out.println("x =- 5: " + (x = -5)); // Unary minus ~ x = -5
		// System.out.println("x =* 5: " + (x =* 5));
		// System.out.println("x =% 5: " + (x =% 5));
		// System.out.println("x =/ 5: " + (x =/ 5));
	}

	static void isOddOrEven(int num) {

		int x = num % 2;

		if (x != 0)
			System.out.println("Number is NOT a even number");
		else
			System.out.println("Number is even number");
	}

	static void test() {

		int x = 7;
		int y = ++x;
		System.out.println(y);
		System.out.println(x);

		y = x--;
		System.out.println(y);

	}

	static void charTypePromotion() {
		System.out.println("\nInside charTypePromotion ...");
		char char1 = 50; // Will be assigned corresponding UTF16 value 2
		System.out.println("char1: " + char1);
		System.out.println("(73 - char1): " + (73 - char1)); // char1 gets
																// promoted to
																// int, i.e.,
																// decimal
																// equivalent 50
																// in UTF16 is
																// used
		System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3'
																// are promoted
																// to ints.
																// String 3 is
																// equal to51
		System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' & 'b' are
															// promoted to ints
															// and the
															// respective
															// equivalents 97 &
															// 98 are added
	}

	// Comparison or Relational operators
	static void comparisonOperators() {
		int age = 20;
		/*
		 * if (age > 21) { System.out.println("Graduate student"); }
		 */
		System.out.println("age > 21: " + (age > 21));
		System.out.println("age >= 21: " + (age >= 21));
		System.out.println("age < 21: " + (age < 21));
		System.out.println("age <= 21: " + (age <= 21));
		System.out.println("age == 21: " + (age == 21)); // equal to (equality
															// operator)
		System.out.println("age != 21: " + (age != 21)); // not equal to
															// (equality
															// operator)

		boolean isInternational = true;
		// System.out.println("isInternational <= true: " + (isInternational <=
		// true));
		System.out.println("isInternational == true: " + (isInternational == true));
		System.out.println("isInternational != true: " + (isInternational != true));

		Student s1 = new Student(1000, "Dheeru");
		Student s2 = new Student(1000, "Dheeru");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));

		update(s1, "John");
	}

	static boolean update(Student s, String name) {
		if (s == null) {
			return false;
		}

		s.name = name;
		return true;
	}

	static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
		int salary = 85000;
		boolean hasBadCredit = false;

		// 1. Core (AND, OR, NOT & Operator Chaining)

		if (age > 35 && salary > 90000 || !hasBadCredit) {
			System.out.println("Loan approved!");
		} else {
			System.out.println("Loan not approved!");
		}

		// 2.
		// (a) Left-associative ~ Order of grouping
		// (b) Associativity (a && b) && c = a && (b && c)
		// Applies to both && and ||

		// 3.
		// (a) Operator precedence of Logical Operators: Helps with ONLY
		// grouping operations. Not order of execution. (! > && > ||)

		// Other Examples: A && B || C && D = (A && B) || (C && D)
		// A && B && C || D = ((A && B) && C) || D

		// (b) Operator Precedence across logical, comparison and arithmetic
		// ! > arithmetic > comparison > &&, ||
		// See resources section for complete precedence rules

		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of
		// precedence rules

		// 4. Use && to avoid NullPointerException
		Student s1 = new Student(1001, "Raj");
		update(s1, "Dheeru");
	}

	static void bitwiseOperators() {
		System.out.println("\nInside bitwiseOperators ...");
		int x = 1;
		int y = 3;

		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));

		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in
														// decimal

		// Since bitwise work only on Integer types, following will not compile
		// double d1 = 3.14;
		// double d2 = 5.15;
		// System.out.println("d1 | d2: " + (d1 | d2));
	}

	static void switchExample() {
		System.out.println("\nInside switchExample ...");
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("April");
		}
	}

	static void min(int x, int y) {
		int result = (x < y) ? x : y;
		System.out.println("min is " + result);
	}

	static void arrays_incrementStatement() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("myArray.length: " + myArray.length);
		// for(int i=0; i<myArray.length;i++)
		// System.out.println("myArray Values: " + myArray[i]);
		for (int i = 0; i < myArray.length; System.out.println(+myArray[i++]))
			;

	}

	static void incrementStatement_decrement_operator() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("myArray.length: " + myArray.length);
		for (int i = myArray.length - 1; i >= 0; i--)
			System.out.println("myArray Values: " + myArray[i]);
	}

	static void reverseArrayValues() {
		int[] iArray = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("\n\nReversing Array ... ");
		for (int i = 0, j = iArray.length - 1, middle = iArray.length >>> 1; i < middle; i++, j--) {
			int temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

	}

	static void findingDivisor() {
		int count = 0;
		int x = 24;
		System.out.print("divisors are ");
		for (int i = 1; i <= x; i++) {

			if (x % i == 0) {
				System.out.print(i + "  ");
				count++;

			}

		}
		System.out.println("\n divisor count is " + count);
	}

	static void studentGradesDisplayAndMax()
	{
		System.out.println("\nDisplaying Student Grades ...");
		  int[][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};
int max=0;
		  for(int i=0;i<studentGrades.length;i++){
			  System.out.println("\nDisplaying Student Grades ..."+i);
			  for(int j=0;j<studentGrades[i].length;j++)
			  {
				  if(studentGrades[i][j]>max)
				  {
					  max=studentGrades[i][j];
				  }
				  System.out.print(studentGrades[i][j] + " ");
			  }
			  System.out.println("\nmax in the class is \n"+max+ " ");
				
		  }
		 
		  
			
		  
		  
	}
	
	public static void main(String[] args) {
		// Language Basics 1
		// print();
		// primitivesInteger();
		// primitivecharacter();
		// operator();
		// Boolean();
		// typeCasting();
		// arrays();
		// threeDimensionalArrays();
		// varargsOverload(true,123, 344);
		// varargsOverload(false,123,345,456);
		// preAndPost();
		// compoundArithmeticAssignment();
		// isOddOrEven(7);
		// test();
		// charTypePromotion();
		// comparisonOperators();
		// logicalOperators();
		// bitwiseOperators();
		// switchExample();
		// min(12,3);
		// arrays_incrementStatement();
		// incrementStatement_decrement_operator();
		// reverseArrayValues();
		//findingDivisor();
		studentGradesDisplayAndMax();
		

	}
}