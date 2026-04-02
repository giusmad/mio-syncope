package org.apache.syncope.common.rest.api.service; 

import jakarta.ws.rs.GET; 
import jakarta.ws.rs.Path; 
import jakarta.ws.rs.Produces; 
import jakarta.ws.rs.core.MediaType; 
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

@Tag(name="Prova")
@Path("prova") 
public interface Prova extends JAXRSService { 
    @GET 
    @Produces(MediaType.APPLICATION_JSON) 
    @Operation(summary = "Restituisce JSON")
    String prova(); 
}  