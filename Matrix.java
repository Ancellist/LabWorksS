//Лабораторная №11
/*
Основание для разработки: Формирование навыков постановки задачи и разработки
Назначение: Сравнить сумму элементов матрицы на главной и побочной диагоналях и выводит соответсвующие результаты
Требования к программе и программному продукту:Выводить диагональ с самой большой суммой или выводить то что они равны
 */
import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        System.out.println("Ввод длины строки");
        int n = scanner.nextInt();//Ввод длины строки
        System.out.println("Ввод длины столбца");
        int m = scanner.nextInt();//Ввод длины столбца
        int[][] arr = new int[n][m];//Матрица
        int buff = 0;//Главная диагональ сумма элементов
        int buff1 = 0;//Побочная диагональ сумма элементов

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]= scanner.nextInt();//ввод
            }
        }//Цикл ввода матрицы построчно

        for (int i =0;i < arr.length;i++){
            System.out.println(arr[i][i]);
            buff += arr[i][i];//Сложение всех элементов массива
        }//Цикл вывода диагонали

        System.out.println();

        for (int i =0;i < arr.length;i++){
            int j = arr.length-i-1;
            System.out.println(arr[i][j]);
            buff1 += arr[i][j];//Сложение всех элементов массива
        }//Цикл вывода побочной диагонали

        if (buff > buff1){
            System.out.println("Сумма главной диагонали больше");
        }
        if (buff < buff1){
            System.out.println("Сумма побочной диагонали больше");
        }
        if (buff == buff1){
            System.out.println("Сумма диагогалей одинакова");
        }
    }
}
