// public class Main {

//     int x = 1;

//     public static void main(String[] args) {

//         //1
//         //a Zakonno / net
//         int count = 0;
//         int _temp = 1;
//         int userName = 2;
//         int value123 = 3;

//         // int 123value = 5;
//         // int int = 5;
//         // int user-name = 5;
//         // int user name = 5;


//         //b Oshibka int
//         // int int = 5;
//         int number = 5;


//         //c Registr
//         int Value = 1;
//         int value = 2;

//         System.out.println(Value);
//         System.out.println(value);


//         //d Podcherkivanie
//         String user_name = "Ali";
//         int maxScore = 100;

//         System.out.println(user_name);
//         System.out.println(maxScore);


//         //e Shadowing
//         Main obj = new Main();
//         obj.testShadowing();


//         //2
//         //a Desyat slov
//         // class struktura
//         // if uslovie
//         // return vozvrat
//         // for cikl
//         // while cikl
//         // int chislo
//         // boolean logika
//         // new sozdanie
//         // void net vozvrata
//         // static statika


//         //b Konflikt imeni
//         // boolean return = true;
//         boolean result = true;


//         //c main ne keyword
//         // main eto obychnoe imya
//         // JVM ishet ego kak tochku vhoda


//         //d var
//         var s = "ok";
//         var n = 5;

//         System.out.println(s);
//         System.out.println(n);

//         // s eto String
//         // n eto int


//         //e Tablitsa
//         // slovo | tip | primer
//         // class | klyuchevoe | class A {}
//         // if | klyuchevoe | if(true){}
//         // return | klyuchevoe | return 1;
//         // true | literal | boolean b = true;
//         // null | literal | String s = null;
//         // String | net | String s = "hi";
//         // new | klyuchevoe | new Object();
//         // void | klyuchevoe | void m(){}


//         //3
//         //a Pereimenovanie
//         int studentAge = 10;
//         int maxScore2 = 20;
//         String userName2 = "Ali";

//         System.out.println(studentAge);
//         System.out.println(maxScore2);
//         System.out.println(userName2);


//         //b Flagi
//         boolean isLoggedIn = true;
//         boolean hasPermission = false;

//         System.out.println(isLoggedIn);
//         System.out.println(hasPermission);


//         //c snake vs camel
//         int total_price = 100;
//         int totalPrice = 100;

//         System.out.println(total_price);
//         System.out.println(totalPrice);


//         //d Cikl
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.println(i + " " + j);
//             }
//         }

//         /*
//         for (int i = 0; i < 2; i++) {
//             for (int i = 0; i < 2; i++) {
//             }
//         }
//         */


//         //e Reviyu
//         int userAge = 5;
//         System.out.println(userAge);


//         //4
//         //a Mini klass

//         InvoiceCalculator calc = new InvoiceCalculator();
//         double total = calc.calculateTotal(100, 20);
//         boolean discount = calc.isDiscountApplicable(total);

//         System.out.println(total);
//         System.out.println(discount);


//         //b Konstanta

//         System.out.println(Constants.PI_APPROX);

//         // Obyasnenie
//         // konstanty v UPPER_CASE
//         // slova cherez _


//         //c Paket na bumage

//         // com.mycompany.billing


//         //d Isprav stil

//         // userService -> UserService
//         // GetData -> getData


//         //e Tablitsa

//         // element | primer | pravilo
//         // class | UserService | s bolshoy bukvy
//         // metod | getData | s malenkoy bukvy
//         // konstanta | PI_APPROX | vse bolshie i _
//         // paket | com.mycompany.app | vse malenkie

//     }

//     void testShadowing() {
//         int x = 2;
//         System.out.println(this.x);
//         System.out.println(x);
//     }
// }


// // otdelnyy klass
// class InvoiceCalculator {

//     double calculateTotal(double price, double tax) {
//         return price + tax;
//     }

//     boolean isDiscountApplicable(double total) {
//         return total > 100;
//     }
// }


// // klass s konstantoy
// class Constants {
//     public static final double PI_APPROX = 3.14159;
// }