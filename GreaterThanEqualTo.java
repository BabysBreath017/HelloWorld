public class GreaterThanEqualTo {
  	public static void main(String[] args){
      
  		//Greater/Less Than or Equal To  大于等于 》= 或小于等于《=
  		
  	  double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;

      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      System.out.println(isChallengeComplete);
    }       
}
