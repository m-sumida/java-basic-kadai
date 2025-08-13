package kadai_021;

/**
 *
 *
 *@author sumid
 *@version 1.0.0
 *@since 1.0.0
 */
public class DictionaryExec_Chapter21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//辞書クラスのインスタンスを生成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		//検索する英単語の配列を宣言
		String[] searchWord = { "apple", "banana", "grape", "orange" };

		for (String target : searchWord) {
			if (null == dictionary.searchDictionary(target)) {
				System.out.println(target+"は辞書に存在しません");
			} else {
				System.out.println(target+"の意味は"+dictionary.searchDictionary(target));
			}
		}
	}
}
