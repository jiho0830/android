package Game_0526;


public class 일반몬스터 extends 몬스터//
{	
	public void 보상금(int a)// 일반몬스터는 5레벨 차이가 나면 경험치와 골드는 사라짐
	{
		if (a > 레벨 + 5) {
			경험치 = 0;
			골드 = 0;
			System.out.println("레벨차이로 인해 골드와 경험치가 사라졌습니다.\n");
		}
	}
}
