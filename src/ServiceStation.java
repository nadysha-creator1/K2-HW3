import org.w3c.dom.ls.LSOutput;

public class ServiceStation {
    public void check(Serviceable serviceable) {
        Mechanic mechanic = new Mechanic("Иван");
        serviceable.service(mechanic);

    }
    }
