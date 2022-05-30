package delivery;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.client;
import entities.order;
import entities.orderitem;
import entities.product;
import OrderStatus.OrderStatus;

public class Program {
	 public static void main(String[] args) throws ParseException {
		 
		 Scanner sc = new Scanner(System.in);
		 SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		 SimpleDateFormat sdt1 = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
		 List<orderitem> ordemIt = new ArrayList<>();

		 System.out.print("Enter the Client Name:");
		 String clientName = sc.nextLine();
		 System.out.print("Enter the Client Email:");
		 String clientEmail = sc.nextLine();
		 System.out.print("Enter the Client Birth Date(DD/MM//YYYY):");
		 Date birthDate = sdt.parse(sc.next());
		 sc.nextLine();
		 
		 client client = new client(clientName, clientEmail, birthDate);
		 
		 System.out.println("Enter order data:");
		 System.out.print("Status:");
		 String Status = sc.nextLine();
		 Status = Status.toUpperCase();
		 Date date1 = new Date();
		 
		 System.out.println("How many items to this order?");
		 int n = sc.nextInt(); 
		 int i = 0;
		 int cont=1;
		 for(i=0; i<n;i++) {
			 sc.nextLine();
			 System.out.println("Enter #"+ cont + " item data:");
			 System.out.print("Product name:");
			 String name = sc.nextLine();
			 System.out.print("Product Price:");
			 double price = sc.nextDouble();
			 System.out.print("Product quantity:");
			 int qt = sc.nextInt();
			 cont += 1;
			 product product = new product(name,price);
			 ordemIt.add(new orderitem(qt,price, product));
		 }
		 sc.close();
		 
		 order order = new order(date1, OrderStatus.valueOf(Status),client, ordemIt);
		 
		 System.out.println("Order Summary:");
		 System.out.println("Order moment"+sdt1.format(date1));
		 System.out.println("Order Status:"+ order.getStatus());
		 System.out.println("Client Name:"+ client.getName() + sdt.format(client.getBirthDate()) + " - " + client.getEmail());
		 System.out.println("Order Items:");
		 for(orderitem c : ordemIt ) {
			 System.out.println(c);
		 }
		 
		 System.out.println("Total Price: $"+ String.format("%.2f", order.income()));
	 }
}