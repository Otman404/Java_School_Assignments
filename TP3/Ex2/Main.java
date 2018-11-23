import java.util.*;

class Main{

	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0;i<args.length ;i++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Nombres Nbrs = new Nombres(arr,args.length);
		System.out.println("Somme des elements du tableau : "+Nbrs.getSum());
		System.out.println("Produit des elements du tableau : "+Nbrs.getProd());
		System.out.println("Difference des elements du tableau : "+Nbrs.getDiff());
		System.out.println("Max des elements du tableau : "+Nbrs.getMax());
		System.out.println("Min des elements du tableau : "+Nbrs.getMin());
		Nbrs.ShowMultTable();
		Nbrs.getFactOfEveryElement();
		//System.out.println("==================");
		//Nbrs.FACTT();
	}
}