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
	private KieServices kieServices = KieServices.Factory.get();

	private KieFileSystem getKieFileSystem() {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		List<String> rules = Arrays.asList("org/example/fraudstrategy1/rules.drl");
		for (String rule : rules) {
			kieFileSystem.write(ResourceFactory.newClassPathResource(rule));
		}
		return kieFileSystem;
	}

	public KieSession getKieSession() {
		KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
		kb.buildAll();

		KieRepository kieRepository = kieServices.getRepository();
		ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
		KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);

		return kieContainer.newKieSession();
	}

}