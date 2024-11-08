public class Park {
    private String parkName;
    public class Attraction {
        public String name;
        public int time;
        public int price;
        
        public Attraction(String name, int time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

            public void attractionInfo() {
                System.out.println(this.tosString());
            }
            public String tosString() {
                return  "Аттракцион: " + name + "\n" + time + "\n" + price + "\n" ;
            }
    }
    public Park (String parkName) {
        this.parkName = parkName;
    }
    public void parkInfo() {
        System.out.println(this.toString());
    }
    public String toString() {
        return  "Парк: " + parkName + "\n";
    }
}