package classwork_4;


    class OptimusPredator{
        String name;
        int health;
        boolean CanEatyourleg;
        int IQ;
        int turbo;
        int damage;
        int killing;
        boolean IsAlive; 
        public OptimusPredator(String name, int health, boolean CanEatyourleg ,int turbo, int IQ, int damage,int killing,boolean IsAlive){
            this.name = name;
            this.health = health;
            this.CanEatyourleg = CanEatyourleg;
            this.IQ = IQ;
            this.damage = damage;
            this.turbo = turbo;
            this.killing = killing;
            this.IsAlive = IsAlive;
        }
        void health(){
            health=health+turbo;
        }
        void CanEatyourleg(){
            if (CanEatyourleg=true){
                damage=damage + 600;
            }
        }
        void IQ(){
            killing=killing-50;
        }
        void turbo(){
            damage=damage+100;
            killing=killing-20;
        }

        void killing(){
            health=health-100;
        }        
        void IsAlive(){
            if(health>0){
                System.out.println("survived");
            }
        }
    }
    class Pancake{
        String name;
        int health;
        int damage;
        int killing;
        boolean IsAlive;
        boolean AmARealPancake;
        int senceofhumorlevel;
        String Secret;
        public Pancake(String name, int health, int damage,int killing,boolean IsAlive,boolean AmARealPancake, int senceofhumorlevel,String Secret){
            this.name = name;
            this.health = health;
            this.damage = damage;
            this.killing = killing;
            this.IsAlive = IsAlive;
            this.AmARealPancake = AmARealPancake;
            this.senceofhumorlevel = senceofhumorlevel;
            this.Secret = Secret;
        }
        void AmARealPancake(){
            if (AmARealPancake == true){
                health = health + 9999999;
            }
        }
        void senceofhumorlevel(){
            health = health/senceofhumorlevel-senceofhumorlevel;
        }
        void Secret(){
            if (Secret == "ProPancake" && name == "ProPancake"  ){
                health = health * 8765;
            }
        }
        void isAlive(){
            if(IsAlive == false){
                if(name == "ProPancake"){
                    health= health+1;
                }
            }
        }
        
    }
    class Gigacucumber{
        String name;
        int health;
        int damage;
        int killing;
        boolean IsAlive;
        int tasty;
        boolean green;
        String Badname;
        public Gigacucumber(String name, int health, int damage,int killing,boolean IsAlive,int tasty,boolean green,String Badname){
            this.name = name;
            this.health = health;
            this.damage = damage;
            this.killing = killing;
            this.IsAlive = IsAlive;
            this.tasty = tasty;
            this.green = green;
            this.Badname = Badname;
        }
        void  tasty(){
            killing = killing + tasty;
        }
        void green(){
            if (green == true) {
                health=health+88;
            }
        }
        void Badname(){
            if (Badname == "ADOLFHITLER"){
                health = 0;
            }
        }

    }
    class Rexona{
        String name;
        int health;
        int damage;
        int killing;
        boolean IsAlive;
        int contain;
        boolean Thereisafirenearby;
        int invisibility;
        public Rexona(String name, int health, int damage,int killing,boolean IsAlive,int contain,boolean Thereisafirenearby, int invisibility){
            this.name = name;
            this.health = health;
            this.damage = damage;
            this.killing = killing;
            this.IsAlive = IsAlive;
            this.contain = contain;
            this.Thereisafirenearby = Thereisafirenearby;
            this.invisibility = invisibility;
        }
        void contain(int con){
            if (con>70){
                health = health-health;
            }
        }
        void 
    }

