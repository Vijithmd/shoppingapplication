
package com.gqt.shoppingapp.project;

import java.util.Scanner;

/**
 * Methods which contains the several functioning:
 */
public class shoppingapp {
	//for the furniture1
	private static void furniture1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Wooden wall shelves - 600/-rs\n"
				+ "Total quantity is      - "+quant+"\n"
				+ "---------------------------------------\n"
				+ "And your bill is       : "+(quant*600)+"\n"
				+ "---------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the furniture2
	private static void furniture2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. coffee table with 4 stools - 4000/-rs\n"
				+ "Total quantity is             - "+quant+"\n"
				+ "-------------------------------------------\n"
				+ "And your bill is              : "+(quant*4000)+"\n"
				+ "-------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Furniture\n"
				+ "1. Wooden wall shelves - 600/-rs\n"
				+ "2. coffee table with 4 stools- 4000/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			furniture1();
		}
		else if (choice2==2) {
			furniture2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct();
		}
	}
	//--------------------------------------BLANKETS-----------------------------------------------------
	//for the Blanket1
	private static void Blanket1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. 300 GSM cozy Lightweight Blanket - 799/-rs\n"
				+ "Total quantity is                   - "+quant+"\n"
				+ "---------------------------------------------------\n"
				+ "And your bill is                    : "+(quant*799)+"\n"
				+ "---------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the Blanket2
	private static void Blanket2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Microfiber Winter Abstract light weight Blanket- 1629/-rs\n"
				+ "Total quantity is                                 - "+quant+"\n"
				+ "----------------------------------------------------------------\n"
				+ "And your bill is                                  : "+(quant*1629)+"\n"
				+ "----------------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Blanket\n"
				+ "1. 300 GSM cozy Lightweight Blanket- 799/-rs\n"
				+ "2. Microfiber Winter Abstract light weight Blanket- 1629/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			Blanket1();
		}
		else if (choice2==2) {
			Blanket2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct1();
		}
	}
	//----------------------------------------CORPETS---------------------------------------------------

	//for the corpet1
	private static void Carpet1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Supersoft Acrylic Carpet for Living Room - 1898/-rs\n"
				+ "Total quantity is                           - "+quant+"\n"
				+ "------------------------------------------------------------\n"
				+ "And your bill is                            : "+(quant*1898)+"\n"
				+ "------------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the corpet2
	private static void Carpet2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. 6D floral design Carpet - 499/-rs\n"
				+ "Total quantity is          - "+quant+"\n"
				+ "-------------------------------------------\n"
				+ "And your bill is           : "+(quant*499)+"\n"
				+ "-------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your corpets\n"
				+ "1. Supersoft Acrylic Carpet for Living Room- 1898/-rs\n"
				+ "2. 6D floral design Carpet- 499/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			Carpet1();
		}
		else if (choice2==2) {
			Carpet2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct1();
		}
	}
	//-----------------------------------------Kitchen Decores----------------------------------------
	//for the deocre1
	private static void Kitchen1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Mini Good vibes Combo - 1299/-rs\n"
				+ "Total quantity is        - "+quant+"\n"
				+ "-----------------------------------------\n"
				+ "And your bill is         : "+(quant*1299)+"\n"
				+ "-----------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the decore2
	private static void Kitchen2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Rajastani Culture wooden wall Hanger - 269/-rs\n"
				+ "Total quantity is                       - "+quant+"\n"
				+ "-------------------------------------------------------\n"
				+ "And your bill is                        : "+(quant*269)+"\n"
				+ "-------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Kitchen Decores\n"
				+ "1. Mini Good vibes Combo- 1299/-rs\n"
				+ "2. Rajastani Culture wooden wall Hanger- 269/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			Kitchen1();
		}
		else if (choice2==2) {
			Kitchen2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct3();
		}
	}
	//-----------------------------------------MOBILES----------------------------------------
	//for the IPHONE
	private static void iPhone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. iPhone 14 Pro Max - 1,49,900/-rs\n"
				+ "Total quantity is    - "+quant+"\n"
				+ "---------------------------------------\n"
				+ "And your bill is     : "+(quant*149900)+"\n"
				+ "----------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the S23
	private static void samsung() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Samsung S23 Ultra 5G - 1,34,999/-rs\n"
				+ "Total quantity is       - "+quant+"\n"
				+ "-------------------------------------------\n"
				+ "And your bill is        : "+(quant*134999)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct4() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Mobiles\n"
				+ "1. iPhone 14 Pro Max- 1,49,900/-rs\n"
				+ "2. Samsung S23 Ultra 5G- 1,34,999/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			iPhone();
		}
		else if (choice2==2) {
			samsung();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct4();
		}
	}

	//-----------------------------------------HEADPHONES----------------------------------------
	//for the HyperX
	private static void HyperX() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. HyperX Cloud Stinger 2 - 3,490/-rs\n"
				+ "Total quantity is         - "+quant+"\n"
				+ "--------------------------------------------\n"
				+ "And your bill is          : "+(quant*3490)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the Boat
	private static void Boat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Boat Rockerz 370       - 1,629/-rs\n"
				+ "Total quantity is         - "+quant+"\n"
				+ "--------------------------------------------\n"
				+ "And your bill is          : "+(quant*1629)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct5() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Headphones\n"
				+ "1. HyperX Cloud Stinger 2- 3490/-rs\n"
				+ "2. Boat Rockerz 370- 1629/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			HyperX();
		}
		else if (choice2==2) {
			Boat();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct5();
		}
	}

	//-----------------------------------------LAPTOPS----------------------------------------
	//for the Acer
	private static void Acer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Acer Aspire 5 Gaming Laptop - 56,990/-rs\n"
				+ "Total quantity is              - "+quant+"\n"
				+ "--------------------------------------------\n"
				+ "And your bill is               : "+(quant*56990)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the Dell
	private static void Dell() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. DELL G15-5525  - 1,09,490/-rs\n"
				+ "Total quantity is - "+quant+"\n"
				+ "----------------------------------\n"
				+ "And your bill is  : "+(quant*109490)+"\n"
				+ "----------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct6() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Laptops\n"
				+ "1. Acer Aspire 5 Gaming Laptop- 56,990/-rs\n"
				+ "2. DELL G15-5525- 1,09,490/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			Acer();
		}
		else if (choice2==2) {
			Dell();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct6();
		}
	}

	//-----------------------------------------TABS----------------------------------------
	//for the Lenovo tab
	private static void Lenovo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Lenovo tab Yoga 11 - 21,999/-rs\n"
				+ "Total quantity is     - "+quant+"\n"
				+ "------------------------------------\n"
				+ "And your bill is  : "+(quant*21999)+"\n"
				+ "------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the Motorola Tab
	private static void Motorola() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Motorola Tab   - 19,999/-rs\n"
				+ "Total quantity is - "+quant+"\n"
				+ "------------------------------------\n"
				+ "And your bill is  : "+(quant*19999)+"\n"
				+ "------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct7() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Tabs\n"
				+ "1. Lenovo tab Yoga 11- 21,999/-rs\n"
				+ "2. Motorola Tab- 19,999/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			Lenovo();
		}
		else if (choice2==2) {
			Motorola();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct7();
		}
	}

	//-----------------------------------------Mens-Fashion----------------------------------------
	//for the Mens1 Fashion
	private static void Mens1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Destiny Casual Mens slim fit casuals - 399/-rs\n"
				+ "Total quantity is                       - "+quant+"\n"
				+ "------------------------------------------------------\n"
				+ "And your bill is                        : "+(quant*399)+"\n"
				+ "------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the Mens2 fashion
	private static void Mens2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Lyriq Casual shirt - 369/-rs\n"
				+ "Total quantity is     - "+quant+"\n"
				+ "--------------------------------------\n"
				+ "And your bill is      : "+(quant*369)+"\n"
				+ "--------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct8() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Products\n"
				+ "1. Destiny Casual Mens slim fit casuals- 399/-rs\n"
				+ "2. Lyriq Casual shirt- 369/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			Mens1();
		}
		else if (choice2==2) {
			Mens2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct8();
		}
	}
	//-----------------------------------------Womens-Fashion----------------------------------------
	//for the Womens1 Fashion
	private static void women1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. 1. Women Longline T-Shirt - 479/-rs\n"
				+ "Total quantity is            - "+quant+"\n"
				+ "--------------------------------------------\n"
				+ "And your bill is             : "+(quant*479)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the Mens2 fashion
	private static void women2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Women's Maxi Dress - 366/-rs\n"
				+ "Total quantity is     - "+quant+"\n"
				+ "--------------------------------------\n"
				+ "And your bill is      : "+(quant*366)+"\n"
				+ "--------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct9() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Products\n"
				+ "1. Women Longline T-Shirt- 479/-rs\n"
				+ "2. Women's Maxi Dress- 366/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			women1();
		}
		else if (choice2==2) {
			women2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct9();
		}
	}
	//-----------------------------------------kids-Fashion----------------------------------------
	//for the kid1 Fashion
	private static void kid1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Kids Thermal winter wear - 599/-rs\n"
				+ "Total quantity is           - "+quant+"\n"
				+ "-----------------------------------------\n"
				+ "And your bill is            : "+(quant*599)+"\n"
				+ "-----------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the kid2 fashion
	private static void kid2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Kids cotton shirt Shorts set for boys - 699/-rs\n"
				+ "Total quantity is                        - "+quant+"\n"
				+ "-------------------------------------------------------\n"
				+ "And your bill is                         : "+(quant*699)+"\n"
				+ "-------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct10() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your products\n"
				+ "1. Kids Thermal winter wear- 599/-rs\n"
				+ "2. Kids cotton shirt Shorts set for boys- 699/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			kid1();
		}
		else if (choice2==2) {
			kid2();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct10();
		}
	}

	//-----------------------------------------FRUITS AND VEGGIES----------------------------------------
	//for the apple
	private static void apple() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Fresh apple pack of 4 - 378/-rs\n"
				+ "Total quantity is        - "+quant+"\n"
				+ "----------------------------------------\n"
				+ "And your bill is         : "+(quant*378)+"\n"
				+ "----------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the ONION
	private static void onion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Fresh Onion 1kg - 53/-rs\n"
				+ "Total quantity is  - "+quant+"\n"
				+ "---------------------------------\n"
				+ "And your bill is   : "+(quant*53)+"\n"
				+ "---------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct11() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Fruits and veggies\n"
				+ "1. Fresh apple pack of-4- 378/-rs\n"
				+ "2. Fresh Onion 1kg - 53/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			apple();
		}
		else if (choice2==2) {
			onion();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct11();
		}
	}
	//-----------------------------------------CEREALS----------------------------------------
	//for the nestle
	private static void nestle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Nestle Ceregrow - 309/-rs\n"
				+ "Total quantity is  - "+quant+"\n"
				+ "---------------------------------\n"
				+ "And your bill is   : "+(quant*309)+"\n"
				+ "---------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the kelloggs
	private static void kelloggs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. kellogg's Multigrain Chocos Moons and stars - 199/-rs\n"
				+ "Total quantity is                              - "+quant+"\n"
				+ "-------------------------------------------------------------\n"
				+ "And your bill is                               : "+(quant*199)+"\n"
				+ "-------------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct12() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your cereals Products\n"
				+ "1. Nestle Ceregrow- 309/-rs\n"
				+ "2. kellogg's Multigrain Chocos Moons and stars- 199/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			nestle();
		}
		else if (choice2==2) {
			kelloggs();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct12();
		}
	}
	//-----------------------------------------JUICES----------------------------------------
	//for the mixed fruit juice
	private static void real() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Real Masala Mixed Fruit Juice 1ltr - 140/-rs\n"
				+ "Total quantity is                     - "+quant+"\n"
				+ "--------------------------------------------------\n"
				+ "And your bill is                      : "+(quant*140)+"\n"
				+ "--------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the fanta
	private static void fanta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Fanta 2.25ltr  - 95/-rs\n"
				+ "Total quantity is - "+quant+"\n"
				+ "---------------------------------\n"
				+ "And your bill is  : "+(quant*95)+"\n"
				+ "---------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct13() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your products\n"
				+ "1. Real Masala Mixed Fruit Juice 1ltr- 140/-rs\n"
				+ "2. Fanta 2.25ltr- 95/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			real();
		}
		else if (choice2==2) {
			fanta();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct13();
		}
	}
	//-----------------------------------------Provisions----------------------------------------
	//for the bru
	private static void bru() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Bru filter coffee 500g - 225/-rs\n"
				+ "Total quantity is         - "+quant+"\n"
				+ "-------------------------------------\n"
				+ "And your bill is          : "+(quant*225)+"\n"
				+ "-------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the gold winner oil
	private static void gold() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Gold winner oil 1L - 119/-rs\n"
				+ "Total quantity is     - "+quant+"\n"
				+ "----------------------------------\n"
				+ "And your bill is      : "+(quant*119)+"\n"
				+ "----------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct14() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Provisions\n"
				+ "1. Bru filter coffee 500g- 225/-rs\n"
				+ "2. Gold winner oil 1L- 119/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			bru();
		}
		else if (choice2==2) {
			gold();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct14();
		}
	}
	//-----------------------------------------Sports Wear----------------------------------------
	//for the shirt
	private static void shirt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Mens Regular Sports T-shirt - 409/-rs\n"
				+ "Total quantity is              - "+quant+"\n"
				+ "--------------------------------------------\n"
				+ "And your bill is               : "+(quant*409)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the shorts
	private static void shorts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Cotton Gym Regular Shorts - 264/-rs\n"
				+ "Total quantity is            - "+quant+"\n"
				+ "--------------------------------------------\n"
				+ "And your bill is             : "+(quant*264)+"\n"
				+ "--------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct15() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Sports wears\n"
				+ "1. Mens Regular Sports T-shirt- 409/-rs\n"
				+ "2. Cotton Gym Regular Shorts- 264/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			shirt();
		}
		else if (choice2==2) {
			shorts();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct15();
		}
	}
	//-----------------------------------------Sports shoes----------------------------------------
	//for the shoe1
	private static void redtape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t CASH RECEIPT\n"
				+ "\t \t--------------\n"
				+ "1. Red Tape       - 1,673/-rs\n"
				+ "Total quantity is - "+quant+"\n"
				+ "---------------------------------\n"
				+ "And your bill is  : "+(quant*1673)+"\n"
				+ "----------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the shorts
	private static void campus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Campus Men city Ride Running Shoe - 866/-rs\n"
				+ "Total quantity is                    - "+quant+"\n"
				+ "-------------------------------------------------\n"
				+ "And your bill is                     : "+(quant*866)+"\n"
				+ "-------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct16() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Sports shoes\n"
				+ "1. Red Tape- 1673/-rs\n"
				+ "2. Campus Men city Ride Running Shoe- 866/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			redtape();
		}
		else if (choice2==2) {
			campus();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct16();
		}
	}
	//-----------------------------------------Sports Equipment----------------------------------------
	//for the belt
	private static void belt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Durable Weight Lifting Belt - 1,249/-rs\n"
				+ "Total quantity is              - "+quant+"\n"
				+ "----------------------------------------------\n"
				+ "And your bill is               : "+(quant*1249)+"\n"
				+ "----------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//for the grip
	private static void grip() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Quantity you want");
		int quant = sc.nextInt();
		System.out.println("\t \t \t CASH RECEIPT\n"
				+ "\t \t \t--------------\n"
				+ "1. Body band Hand Grip Workout Strengthener - 129/-rs\n"
				+ "Total quantity is                           - "+quant+"\n"
				+ "---------------------------------------------------------\n"
				+ "And your bill is                            : "+(quant*129)+"\n"
				+ "---------------------------------------------------------");
		System.out.println("If you want to purchase any other items Please press\n"
				+ "1. Yes\n"
				+ "2. No");
		int mind = sc.nextInt();
		if (mind==1) {
			main(null);
		} else {
			System.out.println("Thanks for visiting us...!");
			System.exit(0);
		}
	}
	//if the customer chooses wrong option to get the options again
	private static void correct17() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Sports Equipment\n"
				+ "1. Durable Weight Lifting Belt- 1,249/-rs\n"
				+ "2. Body band Hand Grip Workout Strengthener- 129/-rs");
		int choice2 = sc.nextInt();
		if (choice2 == 1) {
			belt();
		}
		else if (choice2==2) {
			grip();
		}
		else {
			System.out.println("Invalid option please select the correct option");
			correct17();
		}
	}
	/**
	 * @param args
	 */
	//----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t \t \t \t Welcome to the shopping Application\n"
				+ "\t \t \t \t-------------------------------------");
		System.out.println("Please select the Category you are searching in...!\n"
				+ "1. Home Decores\n"
				+ "2. Electronics\n"
				+ "3. Fashion\n"
				+ "4. Instamart\n"
				+ "5. Sports");
		int choice = sc.nextInt();
		if (choice==1) {
			System.out.println("Select the product you want to buy...!\n"
					+ "1. Furnitures\n"
					+ "2. Blankets\n"
					+ "3. Corpets\n"
					+ "4. Kitchen Decores");
			int choice1 = sc.nextInt();
			if (choice1==1) {
				System.out.println("Select your Furniture\n"
						+ "1. Wooden wall shelves - 600/-rs\n"
						+ "2. coffee table with 4 stools- 4000/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					furniture1();
				}
				else if (choice2==2) {
					furniture2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct();
				}
			}
			// for blanckets
			if (choice1==2) {
				System.out.println("Select your Blanket\n"
						+ "1. 300 GSM cozy Lightweight Blanket- 799/-rs\n"
						+ "2. Microfiber Winter Abstract light weight Blanket- 1629/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					Blanket1();
				}
				else if (choice2==2) {
					Blanket2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct1();
				}
			}
			//For the Corpets
			if (choice1==3) {
				System.out.println("Select your corpets\n"
						+ "1. Supersoft Acrylic Carpet for Living Room- 1898/-rs\n"
						+ "2. 6D floral design Carpet- 499/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					Carpet1();
				}
				else if (choice2==2) {
					Carpet2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct2();
				}
			}
			//For Kitchen Decores
			if (choice1==4) {
				System.out.println("Select your Kitchen Decores\n"
						+ "1. Mini Good vibes Combo- 1299/-rs\n"
						+ "2. Rajastani Culture wooden wall Hanger- 269/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					Kitchen1();
				}
				else if (choice2==2) {
					Kitchen2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct3();
				}
			}
		}
		//for the Electronics segment in the main menu options
		else if (choice==2) {
			System.out.println("Select the product you want to buy...!\n"
					+ "1. Mobiles\n"
					+ "2. Headphones\n"
					+ "3. Laptops\n"
					+ "4. Tabs");
			int choice1 = sc.nextInt();
			if (choice1==1) {
				System.out.println("Select your Mobiles\n"
						+ "1. iPhone 14 Pro Max- 1,49,900/-rs\n"
						+ "2. Samsung S23 Ultra 5G- 1,34,999/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					iPhone();
				}
				else if (choice2==2) {
					samsung();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct4();
				}
			}
			// for Headphones
			if (choice1==2) {
				System.out.println("Select your Headphones\n"
						+ "1. HyperX Cloud Stinger 2- 3490/-rs\n"
						+ "2. Boat Rockerz 370- 1629/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					HyperX();
				}
				else if (choice2==2) {
					Boat();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct5();
				}
			}
			//For the Laptops
			if (choice1==3) {
				System.out.println("Select your Laptops\n"
						+ "1. Acer Aspire 5 Gaming Laptop- 56,990/-rs\n"
						+ "2. DELL G15-5525- 1,09,490/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					Acer();
				}
				else if (choice2==2) {
					Dell();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct6();
				}
			}
			//For Tabs
			if (choice1==4) {
				System.out.println("Select your Tabs\n"
						+ "1. Lenovo tab Yoga 11- 21,999/-rs\n"
						+ "2. Motorola Tab- 19,999/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					Lenovo();
				}
				else if (choice2==2) {
					Motorola();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct7();
				}
			}
		}
		//for the Fashion segment in the main menu options
		else if (choice==3) {
			System.out.println("Select the product you want to buy...!\n"
					+ "1. Men's\n"
					+ "2. Women's\n"
					+ "3. Kids\n");
			int choice1 = sc.nextInt();
			if (choice1==1) {
				System.out.println("Select your Products\n"
						+ "1. Destiny Casual Mens slim fit casuals- 399/-rs\n"
						+ "2. Lyriq Casual shirt- 369/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					Mens1();
				}
				else if (choice2==2) {
					Mens2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct8();
				}
			}
			// for Womens fashion
			if (choice1==2) {
				System.out.println("Select your Products\n"
						+ "1. Women Longline T-Shirt- 479/-rs\n"
						+ "2. Women's Maxi Dress- 366/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					women1();
				}
				else if (choice2==2) {
					women2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct9();
				}
			}
			//For the kids
			if (choice1==3) {
				System.out.println("Select your products\n"
						+ "1. Kids Thermal winter wear- 599/-rs\n"
						+ "2. Kids cotton shirt Shorts set for boys- 699/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					kid1();
				}
				else if (choice2==2) {
					kid2();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct10();
				}
			}
		}
		//----------------------------------------------------------------------------------------------------
		//for the Instamart segment in the main menu options
		else if (choice==4) {
			System.out.println("Select the product you want to buy...!\n"
					+ "1. Fruits and veggies\n"
					+ "2. Cereals\n"
					+ "3. Juices\n"
					+ "4. Provisions");
			int choice1 = sc.nextInt();
			if (choice1==1) {
				System.out.println("Select your Fruits and veggies\n"
						+ "1. Fresh apple pack of-4- 378/-rs\n"
						+ "2. Fresh Onion 1kg - 53/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					apple();
				}
				else if (choice2==2) {
					onion();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct11();
				}
			}
			// for cereals
			if (choice1==2) {
				System.out.println("Select your cereals Products\n"
						+ "1. Nestle Ceregrow- 309/-rs\n"
						+ "2. kellogg's Multigrain Chocos Moons and stars- 199/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					nestle();
				}
				else if (choice2==2) {
					kelloggs();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct12();
				}
			}
			//For Juices
			if (choice1==3) {
				System.out.println("Select your products\n"
						+ "1. Real Masala Mixed Fruit Juice 1ltr- 140/-rs\n"
						+ "2. Fanta 2.25ltr- 95/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					real();
				}
				else if (choice2==2) {
					fanta();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct13();
				}
			}
			//For provisions
			if (choice1==4) {
				System.out.println("Select your Provisions\n"
						+ "1. Bru filter coffee 500g- 225/-rs\n"
						+ "2. Gold winner oil 1L- 119/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					bru();
				}
				else if (choice2==2) {
					gold();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct14();
				}
			}
		}
		//----------------------------------------------------------------------------------------------------
		//for the Instamart segment in the main menu options
		else if (choice==5) {
			System.out.println("Select the product you want to buy...!\n"
					+ "1. Sports Wears\n"
					+ "2. Sports shoes\n"
					+ "3. Sports Equipment\n");
			int choice1 = sc.nextInt();
			if (choice1==1) {
				System.out.println("Select your Sports wears\n"
						+ "1. Mens Regular Sports T-shirt- 409/-rs\n"
						+ "2. Cotton Gym Regular Shorts- 264/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					shirt();
				}
				else if (choice2==2) {
					shorts();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct15();
				}
			}
			// for Sports shoes
			if (choice1==2) {
				System.out.println("Select your Sports shoes\n"
						+ "1. Red Tape- 1673/-rs\n"
						+ "2. Campus Men city Ride Running Shoe- 866/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					redtape();
				}
				else if (choice2==2) {
					campus();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct16();
				}
			}
			//For sports equipment
			if (choice1==3) {
				System.out.println("Select your Sports Equipment\n"
						+ "1. Durable Weight Lifting Belt- 1,249/-rs\n"
						+ "2. Body band Hand Grip Workout Strengthener- 129/-rs");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					belt();
				}
				else if (choice2==2) {
					grip();
				}
				else {
					System.out.println("Invalid option please select the correct option");
					correct17();
				}
			}

		}
		else {
			System.out.println("you have entered Invalid option please select the correct option");
			main(null);
		}

	}

}