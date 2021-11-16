package medSched;

import java.util.HashSet;
import java.util.Set;

public class PatientFormAnswers {
	
	private int id;
	private int priority;
	private String name;
	
	
	private String userName;
	private long userMobileNum;
	private long userEmergencyNum;
	private int currencyPHP;
	private int userAge;
    private String pagod;
    private String setDate;
	private boolean userPWD;
	//TODO Change all Set<Integer> to Set<String>
	private Set<Integer> patientProblems = new HashSet<>();
	//TODO Change this to Set<String> later
	private boolean isAllergic;
	//TODO Split this variable and question later
	private boolean isSmokingDrinking;
	//TODO change this to a Set<String> later
	private boolean isTakingMedication;
	private Set<Integer> familyHistory = new HashSet<>();
	private boolean inGoodHealth;
	private boolean inAccident;
	//1 to 10
	private int painScale;
	private String purposeOfVisit;
	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}

	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}

	public boolean isInAccident() {
		return inAccident;
	}

	private boolean isVaccinated;
	
	//TODO Update this with the new variables
	public PatientFormAnswers(int id,int priority, String name) {
		super();
		this.id = id;
		this.priority = priority;
		this.name = name;
	}
	
	public PatientFormAnswers() {
	}

	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserMobileNum() {
		return userMobileNum;
	}

	public void setUserMobileNum(long userMobileNum) {
		this.userMobileNum = userMobileNum;
	}

	public long getUserEmergencyNum() {
		return userEmergencyNum;
	}

	public void setUserEmergencyNum(long userEmergencyNum) {
		this.userEmergencyNum = userEmergencyNum;
	}

	public int getCurrencyPHP() {
		return currencyPHP;
	}

	public void setCurrencyPHP(int currencyPHP) {
		this.currencyPHP = currencyPHP;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public boolean isUserPWD() {
		return userPWD;
	}

	public void setUserPWD(boolean userIsPWD) {
		this.userPWD = userIsPWD;
	}
	
	public Set<Integer> getPatientProblems() {
		return patientProblems;
	}

	public void setPatientProblems(Set<Integer> patientProblems) {
		this.patientProblems = patientProblems;
	}

	public boolean isAllergic() {
		return isAllergic;
	}

	public void setAllergic(boolean isAllergic) {
		this.isAllergic = isAllergic;
	}

	public boolean isSmokingDrinking() {
		return isSmokingDrinking;
	}

	public void setSmokingDrinking(boolean isSmokingDrinking) {
		this.isSmokingDrinking = isSmokingDrinking;
	}

	public boolean isTakingMedication() {
		return isTakingMedication;
	}

	public void setTakingMedication(boolean isTakingMedication) {
		this.isTakingMedication = isTakingMedication;
	}

	public Set<Integer> getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(Set<Integer> familyHistory) {
		this.familyHistory = familyHistory;
	}

	public boolean isInGoodHealth() {
		return inGoodHealth;
	}

	public void setInGoodHealth(boolean inGoodHealth) {
		this.inGoodHealth = inGoodHealth;
	}

	public boolean wasInAccident() {
		return inAccident;
	}

	public void setInAccident(boolean inAccident) {
		this.inAccident = inAccident;
	}

	public int getPainScale() {
		return painScale;
	}

	public void setPainScale(int painScale) {
		this.painScale = painScale;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	
}
