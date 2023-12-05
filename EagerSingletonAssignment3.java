package Q1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EagerSingletonAssignment3 {
    private static List<EagerSingletonAssignment3> instances = new ArrayList<>(3);

    static {
        for (int i = 1; i <= 3; i++) {
            instances.add(new EagerSingletonAssignment3(i));
        }
    }

    private int instanceNumber;

    private EagerSingletonAssignment3(int instanceNumber) {
        this.instanceNumber = instanceNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("EagerSingletonAssignment3 instance " + instanceNumber + " created at: " + formattedDate);
    }

    public static EagerSingletonAssignment3 getInstance(int instanceNumber) {
        return instances.get(instanceNumber - 1);
    }
}
