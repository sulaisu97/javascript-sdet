package Encapsulation_Udemy;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel = -1;
		}
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int fillUpToner (int addLevel) {
		if(addLevel>0 && addLevel<100) {
			if(this.tonerLevel+addLevel <= 100) {
				this.tonerLevel += addLevel;
			}else {
				return -1;
			}
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public int pagesToPrint(int pages) {
		if(pages>0) {
			if(duplex) {
				System.out.println("Printing in duplex mood.");
				pages = pages/2 + pages%2;
				this.pagesPrinted += pages; 
			}else {
				this.pagesPrinted += pages; 
			}
		}
		return this.pagesPrinted;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean getDuplex() {
		return duplex;
	}
	
	
	
}
