import java.util.*;

public class P02_Dong {
    private static List<CallRecord> callLogs = new ArrayList<>();
    private static Map<String, Integer> callCountMap = new HashMap<>();
    private static Map<String, Integer> callDurationMap = new HashMap<>();
    private static boolean allPhonesValid = true;

    private static class CallRecord {
        String fromNumber;
        String toNumber;
        int duration;

        CallRecord(String fromNumber, String toNumber, int duration) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.duration = duration;
        }
    }

    private static int parseTimeToSeconds(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 3600 + Integer.parseInt(parts[1]) * 60 + Integer.parseInt(parts[2]);
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 10 && phoneNumber.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("#")) break;

            String[] parts = line.split(" ");
            String fromNumber = parts[1];
            String toNumber = parts[2];
            int startTime = parseTimeToSeconds(parts[4]);
            int endTime = parseTimeToSeconds(parts[5]);
            int duration = endTime - startTime;

            if (!isValidPhoneNumber(fromNumber) || !isValidPhoneNumber(toNumber)) {
                allPhonesValid = false;
            }

            callLogs.add(new CallRecord(fromNumber, toNumber, duration));

            callCountMap.put(fromNumber, callCountMap.getOrDefault(fromNumber, 0) + 1);
            callDurationMap.put(fromNumber, callDurationMap.getOrDefault(fromNumber, 0) + duration);
        }

        while (true) {
            String query = scanner.nextLine();
            if (query.equals("#")) break;

            String[] parts = query.split(" ");
            String command = parts[0];

            switch (command) {
                case "?check_phone_number":
                    System.out.println(allPhonesValid ? 1 : 0);
                    break;
                case "?number_calls_from":
                    System.out.println(callCountMap.getOrDefault(parts[1], 0));
                    break;
                case "?number_total_calls":
                    System.out.println(callLogs.size());
                    break;
                case "?count_time_calls_from":
                    System.out.println(callDurationMap.getOrDefault(parts[1], 0));
                    break;
                default:
                    break;
            }
        }
    }
}

