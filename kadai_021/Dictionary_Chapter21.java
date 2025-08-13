package kadai_021;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 *@author sumid
 *@version 1.0.0
 *@since 1.0.0
 */
public class Dictionary_Chapter21 {
	
	private Map<String,String> dictionary  = new HashMap<String, String>();
	
	/**
	 * コンストラクタ
	 */
	public Dictionary_Chapter21() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	
	/**
	 * 辞書を検索する
	 * 
	 * @param word
	 * @return
	 */
	public String searchDictionary(String word) {
		return dictionary.get(word);
	}

}
