// ORGIN
package org.example.fraudstrategy1;


public class Decision {
	private String decision;
	private String ruleName;
	
    public Decision() {
    	// default decision "no rules fired"
        this.decision = "Approve      ";
        this.ruleName = "No Rules Triggered - Approve";
    }
    
	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
		
	}
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
