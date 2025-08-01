package kadai_018;

public abstract class Kato_Chapter18 {
	
	// 姓
	public String familyName;
	
	// 名
	public String givenName;
	
	//住所
	public String address;
	
	
	/**
	 * コンストラクタ
	 */
	public Kato_Chapter18() {
		this.familyName = "加藤";
		this.address = "東京都中野区○×";
	}
	
	/**
	 * 共通の紹介を出力する
	 */
	public void commonIntroduce() {
		System.out.println("住所は"+address+"です");
	}
	
	/**
	 * 個別の紹介を出力する
	 */
	abstract public void eachIntroduce();

	/**
	 * 紹介を実行する
	 */
	public void execIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		commonIntroduce();
		eachIntroduce();
	}
}
