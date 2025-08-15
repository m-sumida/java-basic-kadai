package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 *
 *@author sumid
 *@version 1.0.0
 *@since 1.0.0
 */
public class Jyanken_Chapter28 {
	
	private Map<String,String> jyankenChoice;
	
	public Jyanken_Chapter28() {
		jyankenChoice = new HashMap<>();
		jyankenChoice.put("r", "グー");
		jyankenChoice.put("s", "チョキ");
		jyankenChoice.put("p", "パー");
	}
	
	/**
	 * 自分のじゃんけんの手を入力する
	 * 
	 * @return
	 */
	public String getMyChoice() {
		String input = "";
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);
		while(true) {

			input = scanner.nextLine();
			
			System.out.println(input);

			if(jyankenChoice.containsKey(input)) {
				break;
			}
			
			System.out.println("r、s、pのいずれかの文字を入力してください");
		}
		scanner.close();
		return input;
	}
	
	/**
	 * 対戦相手のじゃんけんの手を乱数で選ぶ
	 * 
	 * @return
	 */
    public String getRandom() {
    	String[] jaynkenOpponentChoice = {"r","s","p"};
		return jaynkenOpponentChoice[(int)Math.floor(Math.random()*3)];
    }
    
    /**
     * じゃんけんを行う
     */
    public void playGame(String myChoice,String opponentChoice) {
    	System.out.println("自分の手は"+jyankenChoice.get(myChoice)+",対戦相手の手は"+jyankenChoice.get(opponentChoice));
    	//あいこの場合
    	if(myChoice.equals(opponentChoice)) {
    		System.out.println("あいこです");
    		return;
    	}
    	
    	//自身が勝つ場合
    	if((myChoice.equals("r") && opponentChoice.equals("s")) 
    			||(myChoice.equals("s") && opponentChoice.equals("p"))
    			||(myChoice.equals("p") && opponentChoice.equals("r"))) {
    		System.out.println("自分の勝ちです");
    	}else {
    		System.out.println("自分の負けです");
    	}
    }

}
