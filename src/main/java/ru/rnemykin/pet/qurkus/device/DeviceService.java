package ru.rnemykin.pet.qurkus.device;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class DeviceService {
    public List<Device> findAll() {
        var devices = Arrays.asList(new Device("Iphone 11"), new Device("MiBand4"));
        return devices;
    }
}
