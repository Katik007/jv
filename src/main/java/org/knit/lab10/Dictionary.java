package org.knit.lab10;
import java.util.ArrayList;
import java.util.List;

public class Dictionary<K, V> {
    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private List<Entry<K, V>> entries;
    public Dictionary() {
        entries = new ArrayList<>();
    }

    // Метод для добавления эл
    public void put(K key, V value) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        entries.add(new Entry<>(key, value));
    }

    // Метод для получения эл
    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    // Метод для удаления элемента по ключу
    public void remove(K key) {
        entries.removeIf(entry -> entry.getKey().equals(key));
    }

}
