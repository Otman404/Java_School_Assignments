class Nombres{

	private int[] tab;
	private int n; // array length

	public Nombres(){
		this.n = 1;
		this.tab = new int[n];
	}
	public Nombres(int[] tab,int n){
		this.n = n;
		this.tab = new int[n];
		for (int i = 0;i<n ;i++ ) {
			this.tab[i] = tab[i]; 
		}
	}

	public int[] getTab(){return this.tab;}
	public void setTab(int[] tab){
		this.tab = new int[tab.length];
		for (int i = 0;i<n ;i++ ) {
			this.tab[i] = tab[i]; 
		}
	}

	public int getLength(){return this.n;}
	public void setLength(int n){
		if(n <= 0)
			n = 1;
		else
		this.n = n;
	}

	public int getSum(){
		int s = 0;
		for (int n : tab) {
			s+=n;
		}
		return s;
	}

	public int getProd(){
		int p = 1;
		for (int n : tab ) {
			p*=n;
		}
		return p;
	}

	public int getDiff(){
		int d = 0;
		for (int n : tab ) {
			d-=n;
		}
		return d;
	}

	public int getMax(){
		int max = this.tab[0];
		for (int n : tab ) {
			if(n>max)
				max = n;
		}
		return  max;
	}

	public int getMin(){
		int min = this.tab[0];
		for (int n : tab ) {
			if(n<min)
				min = n;
		}
		return  min;
	}

	public void ShowMultTable(){
		for (int i = 0 ;i<n ;i++ ) {
			System.out.println("table de multiplication Pour le nombre :"+this.tab[i]);
			for (int j = 1 ;j<10 ;j++ ) {
				System.out.println(this.tab[i]+" * "+j+" = "+(this.tab[i]*j));
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
			System.out.println(this.tab[i]+"! = "+getFact(this.tab[i]));
		}
	}
// Autre methode pour calculer factoriel des elements du tableau
	public void FACTT(){
		for (int i = 0 ;i<this.n ;i++ ) {
			if((this.tab[i] == 1) || (this.tab[i] == 0)){
				System.out.println(this.tab[i]+"! = 1");
			}
			else{
					int r = this.tab[i];
				for (int j = (this.tab[i]-1);j>1 ;j-- ) {
					r = r * j;
				}
				System.out.println(this.tab[i]+"! = "+r);
			}
		}
	}


}