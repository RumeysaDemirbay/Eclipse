package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin="ilginizi çekebilir";
	    String altMetin="vade süresi";
	    
	    System.out.println(ortaMetin);
	    
	    //integer tam sayı
	    int vade=12;
	    
	    double dolarDun=18.10;
	    double dolarBugun=18.30;
	    
	    boolean dolarDustuMu= false;
	    
	    String okYonu="down.svg";
	    
	    if (dolarBugun<dolarDun) {
	    	okYonu="down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
            System.out.println(okYonu);
		}
	    else {
            okYonu="equal.svg";
            System.out.println(okYonu);
		}
	    
	    String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
	    
	    for(int i=0; i< krediler.length ;i++) {
	    	System.out.println(krediler[i]);
	    }
	}
}
