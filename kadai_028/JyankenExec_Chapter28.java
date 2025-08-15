package kadai_028;
/**
 *
 *
 *@author sumid
 *@version 1.0.0
 *@since 1.0.0
 */
public class JyankenExec_Chapter28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myChoice="";
		String opponentChoice="";
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		myChoice = jyanken.getMyChoice();
		opponentChoice=jyanken.getRandom();
		
		jyanken.playGame(myChoice, opponentChoice);
	}

}
