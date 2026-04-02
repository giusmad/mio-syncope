package org.apache.syncope.core.rest.cxf.service; 
 
import org.apache.syncope.core.logic.ProvaLogic; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.apache.syncope.common.rest.api.service.Prova;
import org.springframework.security.access.prepost.PreAuthorize;

@Service 
public class ProvaImpl implements Prova { 
 
    @Autowired 
    private ProvaLogic logic; 
 
    @PreAuthorize("isAuthenticated()")
    @Override 
    public String prova() { 
        return logic.prova(); 
    } 
}