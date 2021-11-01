package factoryDesign;

public class GenPlan {
	public Plan getPlan(String planType){  
		if(planType == null){  
			return null;  
		}  
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
			return new DomPlan();  
		}   
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
			return new ComPlan();  
		}   
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
			return new Insplan();  
		}  
		return null;  
	}  

}
