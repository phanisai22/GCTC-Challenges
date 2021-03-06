package com.oops.book;

public class Main {
	public static void main(String[] args) {
		
		Author steven = new Author("Steven King", "steven.king@protonmail.com", 'M');
		Author martin = new Author("G RR Martin", "RR.Martin@gmail.com", 'M');
		
		Book institute = new Book("The Institute", steven, 549, 8);
		Book got = new Book("The song of ice and fire", martin, 899, 4);
		
		System.out.println(institute);
		System.out.println(got);
		
		System.out.println(got.getName());
		System.out.println(institute.getPrice());
	}
}
