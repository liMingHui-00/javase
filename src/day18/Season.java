package day18;

public enum Season {
    chong("春天"),xia("夏天"),qiu("秋天"),dong("冬天");
    private String name;

    public String getName() {
        return name;
    }

    Season(String name) {
        this.name = name;
    }
}
