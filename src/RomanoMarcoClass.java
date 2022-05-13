/**
 * 
 * @author <b>Marco Romano </b>
 * Dichiarazione della classe <ul>RomanoMarcoClass</ul>
 * <i>13/05/2022<i>
 */
public class RomanoMarcoClass 
{
	
	public int RomanoMet(int f,int s)
	{
		int r=0;
		for(int i=6; i<=f && i>=s; i++) {
			r=(f*i)*s;
		}
		return r;
		/**
		 * @return ritorna il valore di r
		 */
	}
	
	/**
	 * Dichirazione del Main con richiamo delle funzioni
	 * @param args
	 */
	public static void main(String[] args) 
	{
		RomanoMarcoClass a = new RomanoMarcoClass();
		System.out.println("Risultato : "+a.RomanoMet(7,5));
	}

}
