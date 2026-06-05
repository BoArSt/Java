package Tasks;

public class Address {
        private String index;
        private String country;
        private String city;
        private String street;
        private String house;
        private String apartment;
        public String getIndex() {
            return index;
        }
        public void setIndex(String index) {
            this.index = index;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getStreet() {
            return street;
        }
        public void setStreet(String street) {
            this.street = street;
        }
        public String getHouse() {
            return house;
        }
        public void setHouse(String house) {
            this.house = house;
        }
        public String getApartment() {
            return apartment;
        }
        public void setApartment(String apartment) {
            this.apartment = apartment;
        }
        public static void main(String[] args) {
            Address address = new Address();
            address.setIndex("220040");
            address.setCountry("Belarus");
            address.setCity("Minsk");
            address.setStreet("Central");
            address.setHouse("8");
            address.setApartment("64");
            System.out.println("Postal Address:");
            System.out.println("Index: " + address.getIndex() + "\nCountry: " + address.getCountry() + "\nCity: " + address.getCity() + "\nStreet: " + address.getStreet() + "\nHouse: " + address.getHouse() + "\nApartment: " + address.getApartment());
        }
    }
