package az.developia.spring_project_14aprel.entity;


public class RAM {
    private int capacity; 
    private String type;     

    public RAM() {}

    public RAM(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }


    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "RAM [capacity=" + capacity + "GB, type=" + type + "]";
    }
}