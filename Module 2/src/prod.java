class prod {
    int pid;
    String pname;
    String category;

    public prod(int pid, String pname, String category) {
        this.pid = pid;
        this.pname = pname;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + pid +
                ", Name: " + pname +
                ", Category: " + category;
    }
}