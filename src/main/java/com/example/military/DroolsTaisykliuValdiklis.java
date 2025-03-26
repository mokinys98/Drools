package com.example.military;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTaisykliuValdiklis {

    private KieContainer kieContainer;

    public DroolsTaisykliuValdiklis() {
        KieServices kieServices = KieServices.Factory.get();
        kieContainer = kieServices.getKieClasspathContainer();
    }

    public void executeRules(TaktinioVertinimoModelis modelis) {
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");
        kieSession.insert(modelis);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
