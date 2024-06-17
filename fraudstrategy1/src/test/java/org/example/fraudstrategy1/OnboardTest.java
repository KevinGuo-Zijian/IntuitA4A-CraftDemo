package org.example.fraudstrategy1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class OnboardTest {
	private Onboard onboard;
	private KieSession kieSession;

	
	@BeforeEach
	void init() {	

		this.kieSession = new KieServ().getKieSession();
		this.onboard = new Onboard(kieSession);
	}
	
    @AfterEach
    void cleanup() {
        this.kieSession.dispose(); // Dispose Kie Session after each test
    }
    
	@Test
	void testOnboardMerchanta() {
		//添加merchant variables
		Merchant merchant = new Merchant("1020979",998,709,98.822,8,2,-1,-1,-1,0,"N","U","I1","L",0,1,2,"Verizon","Verizon","Wireline",3,null,1);
		Decision decision = new Decision();
		onboard.onboardMerchant(merchant, decision);
		assertEquals("Decline      ", decision.getDecision());
	}
	
	@Test
	void testOnboardMerchantb() {
		//添加merchant variables
		Merchant merchant = new Merchant("1018345",598,707,95.922,2,8,2,-1,-1,-2,"N","U","A7","W",0,2,3,"Verizon Wireless - SVR","Verizon","Wireless",null,"N",0);
		Decision decision = new Decision();
		onboard.onboardMerchant(merchant, decision);
		assertEquals("Manual Review", decision.getDecision());
	}
	
	@Test
	void testOnboardMerchantc() {
		//添加merchant variables
		Merchant merchant = new Merchant("1000039",347,84,0.516,2,8,2,-1,2,0,"N","B","A7","W",0,1,3,"Sprint PCS","Sprint Nextel","Wireless",null,"N",0);
		Decision decision = new Decision();
		onboard.onboardMerchant(merchant, decision);
		assertEquals("Approve      ", decision.getDecision());
	}
}
