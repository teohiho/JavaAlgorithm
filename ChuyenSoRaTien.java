
import java.text.NumberFormat;
import java.util.Locale;

//chuyen so ra tien dong VietNam
public class ChuyenSoRaTien {
	public static void main(String[] args) {
		float f = 1000000;
        Locale locale = new Locale("vi");
        NumberFormat format =  NumberFormat.getCurrencyInstance(locale);
        System.out.println(format.format(f));
	}

}
