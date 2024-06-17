// ORGIN
package org.example.fraudstrategy1;


public class Decision {
	private String platform;
	private String ruleName;
	
    public Decision() {
        this.platform = "Approve      ";
        this.ruleName = "No Rules Triggered - Approve";
    }
    
	public String getDecision() {
		return platform;
	}

	public void setDecision(String platform) {
		this.platform = platform;
		
	}
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
