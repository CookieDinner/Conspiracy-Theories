package com.drools.conspiracies;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Conspiracies {
    public static void main(String[] args) throws DroolsParserException, IOException {
        Conspiracies conspiracies = new Conspiracies();
        conspiracies.executeRules();
    }
    public void executeRules() throws IOException, DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(Conspiracies.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        session.insert(new Starter());
        session.fireAllRules();
    }
}