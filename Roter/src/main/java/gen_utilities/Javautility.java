package gen_utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Javautility {
	public int getrandomno(int value){
		Random ran=new Random();
		int random=ran.nextInt(value);
		return random;
	}
	public static String getsystemdate() {
	    java.util.Date dt=new java.util.Date();
		String date=dt.toString();
		return date;
	}
	public String getsysdateformat() {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		java.util.Date dt =new java.util.Date();
		String sysdateinformat=dateformat.format(dt);
		return sysdateinformat;
	}
}
//span[.='JBL Tune 770NC Wireless Over Ear ANC Headphones with Mic, Upto 70 Hrs Playtime, Speedcharge, Google Fast Pair, Dual Pairing, BT 5.3 LE Audio, Customize on Headphones App (Black)']/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/following-sibling::div[@class='puisg-row']//span[@class='a-price']