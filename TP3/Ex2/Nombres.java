class Nombres{

	private int[] Tab;
	private int n; // array length

	public Nombres(){}
	public Nombres(int[] Tab,int n){this.Tab = Tab; this.n = n;}

	public int[] getTab(){return this.Tab;}
	public void setTab(int[] Tab){this.Tab = Tab;}

	public int getLength(){return n;}
	public void setLength(int n){
		if(n <= 0)
			n = 1;
		else
		this.n = n;
	}

	public int getSum(){
		int s = 0;
		for (int n : Tab) {
			s+=n;
		}
		return s;
	}

	public int getProd(){
		int p = 1;
		for (int n : Tab ) {
			p*=n;
		}
		return p;
	}

	public int getDiff(){
		int d = 0;
		for (int n : Tab ) {
			d-=n;
		}
		return d;
	}

	public int getMax(){
		int max = this.Tab[0];
		for (int n : Tab ) {
			if(n>max)
				max = n;
		}
		return  max;
	}

	public int getMin(){
		int min = this.Tab[0];
		for (int n : Tab ) {
			if(n<min)
				min = n;
		}
		return  min;
	}

	public void ShowMultTable(){
		for (int i = 0 ;i<n ;i++ ) {
			System.out.println("Table de multiplication Pour le nombre :"+this.Tab[i]);
			for (int j = 1 ;j<10 ;j++ ) {
				System.out.println(this.Tab[i]+" * "+j+" = "+(this.Tab[i]*j));
			}
			System.out.println("\n\n");
		}
	}

	public int getFact(int elem){
		if((elem == 0) || (elem == 1))
			return 1;
		return elem*getFact(elem-1);
	}


	public void getFactOfEveryElement(){
		System.out.println("Factoriel de chaque element du tableau : \n");
		for (int i = 0 ;i<n ;i++ ) {
			System.out.println(this.Tab[i]+"! = "+getFact(this.Tab[i]));
		}
	}
// Autre methode pour calculer factoriel des elements du tableau
	public void FACTT(){
		for (int i = 0 ;i<this.n ;i++ ) {
			if((this.Tab[i] == 1) || (this.Tab[i] == 0)){
				System.out.println(this.Tab[i]+"! = 1");
			}
			else{
					int r = this.Tab[i];
				for (int j = (this.Tab[i]-1);j>1 ;j-- ) {
					r = r * j;
				}
				System.out.println(this.Tab[i]+"! = "+r);
			}
		}
	}


}