public class TimeMap {
    private Map<String, TreeMap<Integer, String>> m;

    public TimeMap() {
        m = new TreeMap<>();
    }

    public void set(String key, String value, int timestamp) {
        m.putIfAbsent(key, new TreeMap<>());
        m.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        if(!m.containsKey(key)){
        return "";
        }
        TreeMap<Integer , String> timeMap = m.get(key);
        Integer time = timeMap.floorKey(timestamp);
        if (time == null) {
            return "";
        }
        return timeMap.get(time);
    }
}