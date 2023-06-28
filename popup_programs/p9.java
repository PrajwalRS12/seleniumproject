package popup_programs;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class p9 {

	public static void main(String[] args) {
		 
		StringSelection s = new StringSelection("bjgjhgm");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	}
	}



