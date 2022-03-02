package basic.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 5 nguoi");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhập vào người thứ: " + (i + 1));
			arr[i] = new Person();
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			sc.nextLine();			
		}
		// in danh sach vua nhap
		for (int i = 0; i < arr.length; i++) {
			Person p = arr[i];
			System.out.format("Tên: %S - Tuổi: %d. ",p.name,p.old);
		}
		
		Person max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max.old < arr[i].old)
				max = arr[i];
		}
		System.out.format( "Tên người lớn tuổi nhất: %S " ,max.name);
		System.out.println("Số tuổi lớn nhất là: " + max.old);
	}

}
