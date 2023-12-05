package Q1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LazySingletonAssignment3 {
    private static List<LazySingletonAssignment3> instances = new ArrayList<>();
    private static int instanceCount = 0;
    private int instanceNumber;

    private LazySingletonAssignment3(int instanceNumber) {
        this.instanceNumber = instanceNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("LazySingletonAssignment3 instance " + instanceNumber + " created at: " + formattedDate);
    }

    public static LazySingletonAssignment3 getInstance(int instanceNumber) {
        if (instances.size() < 3) {
            instances.add(new LazySingletonAssignment3(instanceNumber));
        }
        return instances.get(instanceNumber - 1);
    }
}
