/**
 *
 * @author xekid78
 *
 */
import java.util.ArrayList;

public class Sample26 {

	public static void main(String[] args) {
		// コレクション
		ArrayList<Enemy2> enemies = new ArrayList<Enemy2>();
		enemies.add(new Enemy2("モンスター"));
		enemies.add(new Enemy2("ガイコツ"));
		enemies.add(new Enemy2("ドラゴン"));

		for (Enemy2 member : enemies) {
			member.Attack();
		}

	}

}

class Enemy2 {
	// メンバ変数
	private String MyName;
	// コンストラクタ
	public Enemy2(String name) {
		MyName = name;
	}

	public void Attack() {
		System.out.println(MyName + "が攻撃してきた。");
	}

}
