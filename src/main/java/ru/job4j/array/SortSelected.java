package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); //находим минимальное
            int index = FindLoop.indexInRange(data, min, 0, data.length - 1); //находим индекс минимального значения
            //если индекс текущего значения больше индекса минимального значения, меняем через swap
            SwitchArray.swap(data, i, index); //должно вернуть массив в котором в индексе i минимальное значение
        }
        return data;
    }
}