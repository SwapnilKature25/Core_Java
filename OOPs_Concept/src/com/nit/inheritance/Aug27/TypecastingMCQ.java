package com.nit.inheritance.Aug27;


//class Animal {
//	public void eat(Animal b) {
//		System.out.println("Animal is eating....");
//	}
//}
//
//class Lion extends Animal {
//	public void eat(Lion l) {
//		System.out.println("Lion is eating....");
//	}
//}
//
//class Cub extends Lion {
//	public void eat(Cub c) {
//		System.out.println("Cub is eating....");
//	}
//}
//
//public class TypecastingMCQ {
//	public static void main(String[] args) {
//		Animal a = new Cub();
//		a.eat(a);
//		a.eat((Cub) a);
//	}
//}

/* Animal is eating....
Animal is eating.... */




class Animal {
	public void eat(Animal b) {
		System.out.println("Animal is eating....");
	}
}

class Lion extends Animal {
	public void eat(Lion l) {
		System.out.println("Lion is eating....");
	}
}

class Cub extends Lion {
	public void eat(Cub c) {
		System.out.println("Cub is eating....");
	}
}

public class TypecastingMCQ {
	public static void main(String[] args) {
		Lion a = new Cub();
		a.eat(a);
		new Cub().eat(a);
	}
}

/* Lion is eating....
Lion is eating....
 */