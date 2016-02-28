package ejercicioDiablo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Devil {
	
	HashMap<Demon, HashSet<Soul>> demons = new HashMap<Demon, HashSet<Soul>>();
	
	public void payBack(Demon aDemon){
		if(!aDemon.huntedSouls.isEmpty()){
			
			HashSet<Soul> huntedSoulsByDemon = new HashSet<Soul>(aDemon.huntedSouls);
			
			demons.put(aDemon, huntedSoulsByDemon);
			
			aDemon.huntedSouls.clear();
			
		}else{
			aDemon.punishment();
		}
	}
	
	
	public Demon littleDemon(){
		Demon theLittleDemon = null;
		//TODO como mejorar esto.
		int minimumPower = -1;
		
		if(!demons.isEmpty()){
			
			
			for(Map.Entry<Demon, HashSet<Soul>> entry : demons.entrySet()){
				
				Demon aDemon = entry.getKey();
				HashSet<Soul> souls = entry.getValue();
				int totalPower = 0;
				for(Soul aSoul : souls){
					totalPower = totalPower + aSoul.getCourage() + aSoul.getGoodnessLevel();
				}
				
				if(totalPower < minimumPower){
					minimumPower = totalPower;
					theLittleDemon = aDemon;
				}
			}
			
			
		}
		
		return theLittleDemon;
		
		
	}

}
