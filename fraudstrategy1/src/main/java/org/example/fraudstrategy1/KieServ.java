//ORIGIN
package org.example.fraudstrategy1;


import java.util.Arrays;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;


public class KieServ {
	
	//create a KieServices Instance, which is a factory class defined in drools package
	
	private KieServices kieServices = KieServices.Factory.get();

	// method to create a KieFileSystem
	private KieFileSystem getKieFileSystem() {
		
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		
		// insert list of rules
		List<String> rules = Arrays.asList("org/example/fraudstrategy1/multiplerules.drl");
		
		// rule test set
		//List<String> rules = Arrays.asList("org/example/fraudstrategy1/rules.drl");
		
		for (String rule : rules) {
			kieFileSystem.write(ResourceFactory.newClassPathResource(rule));
		}
		return kieFileSystem;
	}

	public KieSession getKieSession() {
		
		// build KIE session with given KIE file system
		KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
		kb.buildAll();
		
		KieRepository kieRepository = kieServices.getRepository();
		
		ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
		
		
		KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);
		
		
		// return built KieSession
		return kieContainer.newKieSession();
	}

}