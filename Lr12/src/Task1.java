import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Device> devices = new LinkedHashMap<>();
        devices.put("iPhone 15", new Phone("iPhone 15", 1, 20.0, 48));
        devices.put("Galaxy S24", new Phone("Galaxy S24", 2, 18.0, 50));
        devices.put("Pixel 8", new Phone("Pixel 8", 3, 19.0, 50));
        devices.put("iPad Air", new Tablet("iPad Air", 4, 30.0, 10.9));
        devices.put("Galaxy Tab S9", new Tablet("Galaxy Tab S9", 5, 35.0, 11.0));
        devices.put("Surface Go 3", new Tablet("Surface Go 3", 6, 28.0, 10.5));
        devices.put("MacBook Air", new Laptop("MacBook Air", 7, 60.0, 52));
        devices.put("ThinkPad X1", new Laptop("ThinkPad X1", 8, 65.0, 57));

        System.out.println("Все устройства (ключ  значение):");
        for (Map.Entry<String, Device> entry : devices.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}








        /*System.out.println("Все устройства (ключ  значение):");
        Iterator<Map.Entry<String, Device>> iterator = devices.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Device> entry = iterator.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }*/