package main.java.lec13;

public class JavaHouse {

    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address, LivingRoom livingRoom) {
        this.address = address;
        this.livingRoom = livingRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        public String getAddress() {
            return JavaHouse.this.address;
        }
    }
}
