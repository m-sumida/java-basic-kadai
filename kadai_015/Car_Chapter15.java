package kadai_015;

public class Car_Chapter15 {
	
	// ギア
	private int gear = 1;
	
	//スピード
	private int speed = 10;
	
	//ギア変更
	public void changeGear(int afterGear) {
		
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		
		gear = afterGear;
		
		speed = switch (gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}

}
