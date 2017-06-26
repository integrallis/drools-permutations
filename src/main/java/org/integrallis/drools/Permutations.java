package org.integrallis.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class Permutations {

	public static final void main(String[] args) {
		KieSession knowledgeSession = null;
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
	        KieContainer kContainer = ks.getKieClasspathContainer();
	        knowledgeSession = kContainer.newKieSession("ksession-rules");
			// go !
			knowledgeSession.insert(new Person("Bob"));
			knowledgeSession.insert(new Person("Alice"));
			knowledgeSession.insert(new Person("Steve"));
			
			knowledgeSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			knowledgeSession.dispose();
		}
	}
}