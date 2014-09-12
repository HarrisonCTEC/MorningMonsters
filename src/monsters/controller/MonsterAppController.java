package monsters.controller;

import monsters.view.MonsterView;
import monsters.model.MarshmallowMonster;

public class MonsterAppController
{
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Kevin", 4.0, 0.0, 1, 0, 0, false);
		otherMonster = new MarshmallowMonster("Derf", 0.001, 0.2, 5, 0, 0, true);
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}

}
