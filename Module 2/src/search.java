public class search {

    public static int linearSearch(prod[] prods, int id) {
        for (prod p : prods) {
            if (p.pid == id) {
                return p.pid;
            }
        }
        return -1;
    }

    public static prod binarySearch(prod[] prods, int id) {
        int l = 0, h = prods.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (prods[mid].pid == id) {
                return prods[mid];
            }
            if (prods[mid].pid < id) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        prod[] prods = {
                new prod(101, "Laptop", "Electronics"),
                new prod(102, "Phone", "Electronics"),
                new prod(103, "Shoes", "Fashion")
        };
        int result = linearSearch(prods, 102);
        prod ans = binarySearch(prods, 103);
        if (result != -1)
            System.out.println("Product Found: " + result);
        else
            System.out.println("Product Not Found");
    }
}