import java.util.Scanner;
public class XO {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("dssd");
        char[][] field = new char[3][3];


        while (true) {

            System.out.println("введите место X от 1 до 3:");
            int b = in.nextInt() - 1;
            System.out.println("введите место x от 1 до 3:");
            int a = in.nextInt() - 1;
            field[a][b] = 'x';

            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    System.out.print(field[i][j]+" | ");
                }
                System.out.println();
            }

            System.out.println("введите место 0 от 1 до 3:");
            int c = in.nextInt() - 1;
            System.out.println("введите место 0 от 1 до 3:");
            int d = in.nextInt() - 1;
            field[c][d] = '0';

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(field[i][j] + " | ");
                }
                System.out.println();
            }



            if (field[0][0] == field[0][1]&& field[0][1] == field[0][2]&&field[0][2]=='x'||field[0][2]=='y'){
                System.out.println("Победили "+field[0][2]);
                break;
            }

            else if (field[0][0] == field[1][0]&& field[1][0] == field[2][0]&&field[2][0]=='x'||field[2][0]=='y'){
                System.out.println("Победили "+field[0][0]);
                break;
            }

            else if (field[0][1] == field[1][1]&& field[1][1] == field[2][1]&&field[2][1]=='x'||field[2][1]=='y'){
                System.out.println("Победили "+field[0][1]);
                break;
            }

            else if (field[2][0] == field[2][1]&& field[2][1] == field[2][2]&&field[2][2]=='x'||field[2][2]=='y'){
                System.out.println("Победили "+field[2][0]);
                break;
            }

            else if (field[0][2] == field[1][2]&& field[1][2] == field[2][2]&&field[2][2]=='x'||field[2][2]=='y'){
                System.out.println("Победили "+field[0][2]);
                break;
            }

            else if (field[0][0] == field[1][1]&& field[1][1] == field[2][2]&&field[2][2]=='x'||field[2][2]=='y'){
                System.out.println("Победили "+field[0][0]);
                break;
            }

            else if (field[1][0] == field[1][1]&& field[1][1] == field[2][2]&&field[2][2]=='x'||field[2][2]=='y'){
                System.out.println("Победили "+field[1][0]);
                break;
            }

            else if (field[0][2] == field[1][1]&& field[1][1] == field[2][0]&&field[0][2]=='x'||field[0][2]=='y'){
                System.out.println("Победили "+field[0][2]);
                break;
            }
        }
    }

}


