package classwork_26;

public class Main{
    //1
    class phone {
        private String brand;
        private String model;
        private int batteryLife;
        phone(String brand,String model,int batteryLife){
            this.brand=brand;
            this.model=model;
            this.batteryLife=batteryLife;
        }
        String getBrand(){
            return brand;
        }
        String getModel(){
            return model;
        }
        int getBatteryLife(){
            return batteryLife;
        }
        void call(){
            if (batteryLife>=10){
                batteryLife-=10;
                System.out.println("mpjno"+batteryLife);
            } else{
                System.out.println("nelza");
            }
        }
    }
    //2
}