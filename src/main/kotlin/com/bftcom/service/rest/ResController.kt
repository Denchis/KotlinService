package com.bftcom.service.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import com.bftcom.service.services.WordService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Component
@Path("word/{name}")
class GreatController  @Autowired constructor(val service: WordService){

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun great (@PathParam("name") name: String): Response {
        val resp = service.spell(name)
        return Response.ok(resp).build()
    }
}