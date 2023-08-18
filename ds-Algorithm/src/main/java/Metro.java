import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] stop : stops) {
            result += stop[0];
            result -= stop[1];
        }
        return result;
    }
}
