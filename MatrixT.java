//Лабораторная №11
/*
Основание для разработки: Формирование навыков постановки задачи и разработки
Назначение: Транспорировать матрицу
Требования к программе и программному продукту:После ввода массива матрица должна транспорироваться без ошибочно
 */
import java.util.Random;
import java.util.Scanner;

public class MatrixT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        System.out.println("Ввод длины строки");
        int n = scanner.nextInt();//Ввод длины строки
        System.out.println("Ввод длины столбца");
        int m = scanner.nextInt();//Ввод длины столбца
        int[][] arr = new int[n][m];//Матрица
        int[][] arrBuff = new int[m][n];//Матрица для транспорирования

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]= scanner.nextInt();//ввод
            }
        }//Цикл ввода матрицы построчно

        for (int i = 0 ;i < arr.length;i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                arrBuff[j][i] = arr[i][j];//Транспорирование
            }
        }//Цикл транспорирования матрицы

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                System.out.print(arrBuff[j][i]+"");
            }
            System.out.println(" Столбик"+(i+1));//Вывод номера столбца
            System.out.println();//Пробел между столбиками
        }//Цикл вывода матрицы по столбцам
        }
    }

