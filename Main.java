//Лабораторная №11
/*
Основание для разработки: Формирование навыков постановки задачи и разработки
Назначение: Вывод столбцов матрицы
Требования к программе и программному продукту: Безошибочно выводить столбцы матрицы размера заданного пользователем
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        System.out.println("Ввод длины строки");
        int n = scanner.nextInt();//Ввод длины строки
        System.out.println("Ввод длины столбца");
        int m = scanner.nextInt();//Ввод длины столбца
        int[][] arr = new int[n][m];//Создание матрицы

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]=scanner.nextInt();
            }
        }//Цикл ввода матрицы построчно

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                System.out.println(arr[j][i]);
            }
            System.out.println();//Пробел между столбиками
        }//Цикл вывода матрицы по столбцам
    }
}