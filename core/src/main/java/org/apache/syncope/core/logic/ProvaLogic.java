package org.apache.syncope.core.logic; 
 
import org.springframework.stereotype.Component; 
import org.springframework.security.access.prepost.PreAuthorize;

@Component
public class ProvaLogic {

    @PreAuthorize("isAuthenticated()")
    public String prova() {
        return "{\"nome\": \"Giuseppe\", \"cognome\": \"Maddalena\", \"età\": \"23\"}";
    }
}