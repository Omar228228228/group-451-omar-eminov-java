package classwork_22;

public class Main{
    //1
    class Dog{
        String name;
        String breed;
        int age;
        public Dog(String name, String breed, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;
        }
        public void bark(){
            System.out.println(name + "gav");
        }
        public void introduce(){
            System.out.println(name+breed+age);
        }
    }
    //2
    class Rectangle{
        double width;
        double height;
        public double area(){
            return height * width;
        }
        public double perimetr(){
            return 2*(width + height);
        }
        public boolean isSquare(){
            return width == height;
        }
    }
    //3
    class GameCharacter{
        String name;
        int health;
        int level;
        public GameCharacter(){
            this.name = name;
            this.health = health;
            this.level = level;
        }
        public void takeDamage(int damage){
            if (health<damage){
            System.out.println("uje mertv");}
            else if(health == 0 ){
                System.out.println("dead");
            }
            else{
                health = health - damage;
            }
        }
        public void heal(int amount){
            health = health + amount;
        }
        public boolean isAlive(){
            return health>0;
        }
        public void levelUp(){
            level++;        
        }
    }
    //4
    class Book {
        String title;
        String author;
        int year;
        private boolean isAviable;
        public Book(String title, String author, int year){
            this.title=title;
            this.author=author;
            this.year=year;
            this.isAviable=isAviable;
        }
        public void returnBook(){
            isAviable = true;
            System.out.println("vernul");
        }
        public String getinfo(){
            return title + author + year;
        }
    }
    //5
    class PiggyBank{
        private double balance;
        private boolean isBroken;
        public PiggyBank(){
            this.balance = balance;
            this.isBroken = isBroken;
        }
        // public double breakOpen(){
        //     if(!isBroken){
        //         isBroken = true;
        //         double money =balance;

        //     }
            
        // }
    }
}

