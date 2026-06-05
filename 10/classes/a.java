package classes;

public class a {
   public static class Title {
        private String title;
        public Title(String title) {
            this.title = title;
        }
        public void show() {
            System.out.println("Title: " + title);
        }
    }
    public static class Author {
        private String author;
        public Author(String author) {
            this.author = author;
        }
        public void show() {
            System.out.println("Author: " + author);
        }
    }
    public static class Content {
        private String content;
        public Content(String content) {
            this.content = content;
        }
        public void show() {
            System.out.println("Content: " + content);
        }
    }



    public static class Appliance {
        private String name;
        private boolean isPluggedIn;

        public Appliance(String name) {
            this.name = name;
            this.isPluggedIn = false;
        }

        public void plugIn() {
            isPluggedIn = true;
            System.out.println(name + " is now plugged in.");
        }

        public void unplug() {
            isPluggedIn = false;
            System.out.println(name + " is now unplugged.");
        }

        public boolean isPluggedIn() {
            return isPluggedIn;
        }

        public String getName() {
            return name;
        }
    }
        public static class KitchenAppliance extends Appliance {
            public KitchenAppliance(String name) {
                super(name);
            }
        }
        public static class LivingRoomAppliance extends Appliance {
            public LivingRoomAppliance(String name) {
                super(name);
            }
        }
        public static class Refrigerator extends KitchenAppliance {
            public Refrigerator(String name) {
                super(name);
            }
            public void cool() {
                System.out.println(getName() + " is cooling.");
            }
        }
        public static class Microwave extends KitchenAppliance {
            public Microwave(String name) {
                super(name);
            }
            public void heat() {
                System.out.println(getName() + " is heating.");
            }
        }
        public static class Television extends LivingRoomAppliance {
            public Television(String name) {
                super(name);
            }
            public void display() {
                System.out.println(getName() + " is displaying content.");
            }
        }
    }
