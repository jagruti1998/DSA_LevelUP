package HashSet;

import java.util.HashSet;

class DesignHashSet {

    HashSet mh=new HashSet<>();

    public void MyHashSet() {

    }

    public void add(int key) {
        mh.add(key);

    }

    public void remove(int key) {
        mh.remove(key);

    }

    public boolean contains(int key) {
        if (mh.contains(key))
        {
            return true;
        }
        else
            return false;


    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */