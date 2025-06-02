package business;

public class Platform {
    private String name;
    private Long id;
    private static  Long count = 0L;

    public Platform() {
        id =++count;
    }
    
    public Platform(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long getCount() {
        return count;
    }

    public static void setCount(Long count) {
        Platform.count = count;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
