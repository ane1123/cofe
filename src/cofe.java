import java.util.Scanner;
public class cofe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("это кофе маш");
        int water = 2000; // 2 литра воды в кофе варке
        int milk = 500; // 0.5 литров молока в кофе варке
        int coffee = 150; // 0.15 грамм коффе

        System.out.println("Write how many ml of water the coffee machine has: " + water);
        System.out.println("Write how many ml of water the coffee machine has: " + milk);
        System.out.println("Write how many ml of water the coffee machine has: " + coffee);

        System.out.println("что вы хотите сделать");
        System.out.println("buy-1,fill-2,take-3");
        int p = in.nextInt();
        int m3 = 500;
        int mm;
        int l;
        int Cup = 9;
        int j;


        int cof;
        int w2;
        int m2;

        if (p == 1) {

           System.out.println("espresso-1,latte-2,cappuccino-3");
           int a = in.nextInt();

            if (a == 1) {
                System.out.println("espresso стоит 4$");
                System.out.println("сколько порций");
                int q = in.nextInt();
                System.out.println(4 * q + " цена");
            } else if (a == 2) {
                System.out.println("espresso стоит 7$");
                System.out.println("сколько порций");
                int z = in.nextInt();
                System.out.println(7 * z + " $ цена");
            } else if (a == 2) {
                System.out.println("espresso стоит 6$");
                System.out.println("сколько порций");
                int w = in.nextInt();
                System.out.println(6 * w + " $ цена");
            }
        } else if (p == 2) {
            System.out.println("какие ингридиенты вы хотите добавить");
            System.out.println("вода-1,молоко-2,кофе-3,стакан-4");
            int i = in.nextInt();
            if (i == 1) {
                System.out.println("сколько воды вы хотите добавить");
                w2 = in.nextInt();
                System.out.println(water + w2 + "в итоге");

            } else if (i == 2) {
                System.out.println("сколько молока кофе вы хотите добавить");
                m2 = in.nextInt();
                System.out.println(milk + m2 + " в итоге");

            } else if (i == 3) {
                System.out.println("сколько г кофе вы хотите добавить");
                int с2 = in.nextInt();
                System.out.println(coffee + с2 + "в итоге");


            }
            else if (i == 4){
                System.out.println("сейчас " + Cup + " хотите добавить ");
                int v = in.nextInt();
                j = Cup + v;
                System.out.println(j);
            }
        }else if (p == 3){
                System.out.println("есть 500$");
                System.out.println("сколько хотите снять число должно быть меньше " + m3);
                mm = in.nextInt();
                l = m3 - mm;
                System.out.println("у вас осталось" + l);

            }






            }



        }


