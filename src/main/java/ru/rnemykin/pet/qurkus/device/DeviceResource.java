package ru.rnemykin.pet.qurkus.device;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/devices")
public class DeviceResource {
    @Inject
    private DeviceService deviceService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Device> devices() {
        return deviceService.findAll();
    }
}
