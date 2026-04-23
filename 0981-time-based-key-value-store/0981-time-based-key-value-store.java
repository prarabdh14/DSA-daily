class TimeMap {

    class Pair 
    {
        int time;
        String value;
        Pair(int time, String value)
        {
            this.time = time;
            this.value = value;
        }
    }
    HashMap<String, List<Pair>> map;
    public TimeMap() 
    {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));    
    }
    
    public String get(String key, int timestamp) 
    {
        if(!map.containsKey(key))
        return "";
        List<Pair> list = map.get(key);
        int left = 0, right = list.size() - 1;
        String ans = "";
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (list.get(mid).time <= timestamp) 
            {
                ans = list.get(mid).value;
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return ans;
        //return bs(0, toCheck.size() - 1, toCheck, timestamp);
    }
    /*public String bs(int st, int end, List<Pair> list, int trg)
    {
        String ans = "";
        int mid = st + (end - st) / 2;
        while(st <= end)
        {
            if(list.get(mid).time <= trg)
            {
                ans = list.get(mid).value;
                return bs(mid + 1, end, list, trg);
            }
            else
            return bs(st, mid - 1, list, trg);
        }
        return ans;
    }*/
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */