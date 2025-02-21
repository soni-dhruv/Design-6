// Time Complexity: O(1)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode: YES
// Any problem you faced while coding this: NO

// Your code here along with comments explaining your approach: 

class PhoneDirectory {
    Queue<Integer> q;
    HashSet<Integer> set;
    
    public PhoneDirectory(int maxNumbers) {
        q = new LinkedList<>();
        set = new HashSet<>();
        for(int i = 0; i < maxNumbers; i++){
            q.add(i);
        }
    }
    
    public int get() {
        if(q.isEmpty()) return -1;
        int assigned = q.poll();
        set.add(assigned);
        return assigned;
    }
    
    public boolean check(int number) {
        return !set.contains(number);
    }
    
    public void release(int number) {
        if(set.contains(number)){
            set.remove(number);
            q.add(number);
        }
    }
}